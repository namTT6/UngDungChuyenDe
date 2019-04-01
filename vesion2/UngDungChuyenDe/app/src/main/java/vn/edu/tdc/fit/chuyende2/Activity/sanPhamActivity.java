package vn.edu.tdc.fit.chuyende2.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ViewFlipper;

import java.io.Serializable;
import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.HomeAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.danhMucSanPhamAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.sanPhamAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.sanPhamMoiNhatAdapter;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.danhMuc;
import vn.edu.tdc.fit.chuyende2.model.danhMucSanPham;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class sanPhamActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView rvdanhmucsanpham;
    private ArrayList<danhMucSanPham> ds;
    private danhMucSanPhamAdapter mucSanPhamAdapter;

    private RecyclerView rvsanphammoinhat;
    private ArrayList<sanPham> dsspmoinhat;
    private sanPhamMoiNhatAdapter phamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);
        // Set theme
        ThemeManagement.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_san_pham);
        setControl();
        setFuntion();
        importData();
        importSanPhamMoiNhat();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Sản phẩm tập luyện");
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    private void setControl() {
        rvdanhmucsanpham = (RecyclerView) findViewById(R.id.rvdanhmucsanpham);
        rvsanphammoinhat = (RecyclerView) findViewById(R.id.rvsanphammoinhat);
        ds = new ArrayList<>();
        dsspmoinhat = new ArrayList<>();
        mucSanPhamAdapter = new danhMucSanPhamAdapter(sanPhamActivity.this, ds);
        phamAdapter = new sanPhamMoiNhatAdapter(sanPhamActivity.this, dsspmoinhat);
        // Quy định chiều hiển thị của recycler view (Vertical hoăc Hozital)
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(sanPhamActivity.this, LinearLayoutManager.HORIZONTAL, false);
        // Set chiều hiển thị cho recycler view word tođay
        rvdanhmucsanpham.setLayoutManager(linearLayoutManager);
        // Set adapter cho recycler view word today
        rvdanhmucsanpham.setAdapter(mucSanPhamAdapter);

        rvdanhmucsanpham.setAdapter(new ScaleInAnimationAdapter(mucSanPhamAdapter));


        rvsanphammoinhat.setHasFixedSize(true);

        rvsanphammoinhat.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        // Set adapter cho recycler view
        rvsanphammoinhat.setAdapter(phamAdapter);
    }

    public void importSanPhamMoiNhat() {
        dsspmoinhat.add(new sanPham(1, R.drawable.sanphammot, "Cặp gội xả mefaso chính hãng - MFS01", "250000", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 1));
        dsspmoinhat.add(new sanPham(2, R.drawable.sanphamhai, "Hấp lụa tơ tằm dưỡng tóc - hap lua fakeshu", "60,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 2));
        dsspmoinhat.add(new sanPham(3, R.drawable.sanphamba, "Bộ Dầu Gội Xả Mefaso 850ml*2 - HJKG", "20000", "\\uD83D\\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"DÀNH CHO NỮ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \\uD83C\\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \\uD83C\\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"DÀNH CHO NAM:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"➡ Hương thơm lôi cuốn và quyến rũ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 3));
        dsspmoinhat.add(new sanPham(4, R.drawable.sanphambon, "Dầu gội Head Shoulder Sạch gàu Bạc hà mát rượi chai 850ml"
                , "165,000 Đ", "\\uD83D\\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"DÀNH CHO NỮ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \\uD83C\\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \\uD83C\\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"DÀNH CHO NAM:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"\\uD83C\\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"➡ Hương thơm lôi cuốn và quyến rũ\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 4));
        dsspmoinhat.add(new sanPham(5, R.drawable.sanphamnam, "Áo Khoác Jeans Nam In Sành Điệu - aokhoacnam-1", "175,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 5));
        dsspmoinhat.add(new sanPham(6, R.drawable.sanphamsau, "áo khoác jeans rách fashion Mã: NK1250 - NK1250", "310,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 6));
        dsspmoinhat.add(new sanPham(7, R.drawable.sanphambay, "Dụng cụ kéo cơ Tummy - Dụng cụ kéo cơ Tummy", "55,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 7));
        dsspmoinhat.add(new sanPham(8, R.drawable.sanphamtam, "MÁY TẬP CƠ BỤNG - máy tập cơ bụng", "225,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 8));
        dsspmoinhat.add(new sanPham(9, R.drawable.sanphamchin, "Bộ 3 khung vẽ chân mày - m163", "15,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 9));
        dsspmoinhat.add(new sanPham(10, R.drawable.sanphammuoi, "Set Chì kẻ mày Novo siêu mịn gồm 3 lõi thay thế cùng 3 kiểu khuôn mày", "55,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
                "\n" +
                "DÀNH CHO NỮ\n" +
                "\n" +
                "\uD83C\uDF39 (CHANEL COCO) MISS UNIVERSE: Top mùi hương LỰA CHỌN HÀNG ĐẦU cho các quý cô hiện đại, độc lập, cá tính và thu hút cánh đàn ông. Một mùi hương KHÔNG THỂ CƯỠNG LẠI. Nồng nàn mà vẫn thanh mát, quyến rũ dai dẳng vô cùng.\n" +
                "\n" +
                "\uD83C\uDF39COOL MOON: Hương thơm mát lành của biển, sư hoà quyện tinh tế sang trọng , rất thoải mái cho người dùng.\n" +
                "\n" +
                "\uD83C\uDF39DIOR HYPNOS: Sang trọng kết hợp tông gỗ - Tinh tế từ hương thơm nồng nàn, bí ẩn làm say đắm lòng người. Dùng dc cho nam và nữ\n" +
                "\n" +
                "\uD83C\uDF39GOLDEN JUST: Hương ngọt ngào, sự lựa chọn hoàn hảo cho anh chàng lãng mạn cùng cô nàng năng động, những phụ nữ của gia đình và lại ngọt ngào quyến rũ.\n" +
                "\n" +
                "\uD83C\uDF39212 SEXY: Hương hoa , gợi cảm, quyến rũ. Tông ngọt\n" +
                "\n" +
                "\uD83C\uDF39LANCOME: Tone ngọt, hương nồng nàn và lôi cuốn.\n" +
                "\n" +
                "\uD83C\uDF39GODGIRL: luôn nằm trong top bán chạy nhất. Godgirl là sự hoà trộn giữa tươi vui và trẻ trung..\n" +
                "\n" +
                "\uD83C\uDF39GUCI: HƯƠNG thơm nhẹ nhàng đáng yêu, trong sáng nhưng không kém phần sang trọng. \uD83C\uDF39LUCKY: hương thơm lôi cuốn và rất sang chảnh, dùng được cho cả nam và nữ.\n" +
                "\n" +
                "\uD83C\uDF39FANTA BULOUS: hương thơm ngọt ngào, tiểu thư, trong sáng như viên kẹo ngọt.\n" +
                "\n" +
                "\uD83C\uDF39PRADA CANDY: sư hoà quyện của các mùi hương gỗ hương hoa.. sang trọng và quý phái. \uD83C\uDF39DKNY: phong cách quý tộc, đơn giản, tinh tế.\n" +
                "\n" +
                "\uD83C\uDF39EXTRA PURE: Tông nhẹ, tinh tế, dịu dàng ..phù hợp mọi hoàn cảnh.\n" +
                "\n" +
                "DÀNH CHO NAM:\n" +
                "\n" +
                "\uD83C\uDF39CHANEL BLUE: Hương thơm nam tính, mạnh mẽ nhug lại lôi cuốn, nhã nhặn. Hợp với hoạt động thường ngày.\n" +
                "\n" +
                "POLOo RED: sự quyến rũ sang trọng không thể chối từ của anh chàng chuẩn men.\n" +
                "\n" +
                "D&G: Phong cách lịch lãm, pha chút thanh mát, hợp cho mọi hoàn cảnh.\n" +
                "\n" +
                "VERSACE: anh chãng lãng mạn và hoa hồng hợp các buổi hẹn\n" +
                "\n" +
                "➡ Hương thơm lôi cuốn và quyến rũ\n" +
                "\n" +
                ". ➡ Giá hạt dẻ, phù hợp túi tiền của mọi người\n" +
                "\n" +
                "➡ Giữ mùi trên cơ thể từ 8 đến 12 tiếng trở lên, trên quần áo vải vóc từ 24 ngày.\n" +
                "\n" +
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 10));
        phamAdapter.notifyDataSetChanged();

    }

    public void importData() {
        ds.add(new danhMucSanPham(1, R.drawable.thethaotaluyen, "Thể thao - Tập luyện"));
        ds.add(new danhMucSanPham(2, R.drawable.thoitrangthuonghieu, "Thời trang thương hiệu"));
        ds.add(new danhMucSanPham(3, R.drawable.khoedep, "Sức khỏe - Làm đẹp"));
        mucSanPhamAdapter.notifyDataSetChanged();

    }

    //Kích chọn vào các item trong recyclerview chuyển màn hình
    public void setFuntion() {
        mucSanPhamAdapter.setOnItemClickedListener(new danhMucSanPhamAdapter.OnItemClickedListener() {
            @Override
            public void onItemClick(int idFunction) {
                Intent intent;
                switch (idFunction) {
                    case 1:
                        intent = new Intent(sanPhamActivity.this, sanPhamTapLuyen.class);
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(sanPhamActivity.this, ThoiTrangThuongHieuActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(sanPhamActivity.this, sucKhoeLamDepActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // sự kiện kích chọn vào navigationview chuyển màn hình
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(sanPhamActivity.this, Home.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
