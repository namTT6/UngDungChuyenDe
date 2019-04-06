package vn.edu.tdc.fit.chuyende2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.danhMucSanPhamAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.sanPhamAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.sanPhamMoiNhatAdapter;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class sanPhamTapLuyen extends AppCompatActivity {

    private RecyclerView rvsanpham;
    private ArrayList<sanPham> dssp;
    private sanPhamAdapter phamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham_tap_luyen);
        // Set theme
        ThemeManagement.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_san_pham_tap_luyen);
        setControl();
        importSanPham();
        toolBar();


    }

    private void toolBar() {
        // Khởi tạo tool bar và thay thế action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Loại bỏ tiêu đề tool bar
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        // Hiển thị nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setControl() {
        rvsanpham = (RecyclerView) findViewById(R.id.rvsanphamtapluyen);
        dssp = new ArrayList<>();
        phamAdapter = new sanPhamAdapter(sanPhamTapLuyen.this, dssp);

        rvsanpham.setAdapter(new ScaleInAnimationAdapter(phamAdapter));


        rvsanpham.setHasFixedSize(true);

        rvsanpham.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        // Set adapter cho recycler view
        rvsanpham.setAdapter(phamAdapter);

    }

    public void importSanPham() {
        dssp.add(new sanPham(11, R.drawable.theducmot, "Xe đạp tập EDIT 381B", 4960000, "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 11));
        dssp.add(new sanPham(12, R.drawable.theduchai, "BG - Xe đạp tập thể dục Thái Lan Exercise Bike YS04 Green - YS04-G", 2999000, "\\uD83D\\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\\n\" +\n" +
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
                "                \"➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 12));
        dssp.add(new sanPham(13, R.drawable.theducba, "GẬY GOLF SUPER LADY HÀNG QUA TAY TRẦY - GẬY GOLF SUPER LADY", 280000, "\\uD83D\\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\\n\" +\n" +
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
                "                \"➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 13));
        dssp.add(new sanPham(14, R.drawable.theducnam, "gậy đánh golf cho thuê - golf"
                , 50000, "\\uD83D\\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\\n\" +\n" +
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
                "                \"➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 14));
        dssp.add(new sanPham(15, R.drawable.theducsau, "Găng tay đánh golf Fit39 - GT2", 240000, "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 15));
        dssp.add(new sanPham(16, R.drawable.theducbay, "Tạ tay gang đúc hoàn chỉnh 10kg - 213", 300000 , "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 16));
        dssp.add(new sanPham(17, R.drawable.sanphambay, "Dụng cụ kéo cơ Tummy - Dụng cụ kéo cơ Tummy", 55000 , "\\uD83D\\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\\n\" +\n" +
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
                "                \"➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 17));
        dssp.add(new sanPham(18, R.drawable.sanphamtam, "MÁY TẬP CƠ BỤNG - máy tập cơ bụng", 225000, "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 18));
        dssp.add(new sanPham(19, R.drawable.theductam, "giàn tạ đa năng tập thể hình Xuki VN 2017 - XKVN 2017",
                1590000, "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 19));
        dssp.add(new sanPham(20, R.drawable.theducchin, "Tạ tay đơn mini - Tạ tay đơn mini,\n" +
                "Thương hiệu: MDBuddy\n" +
                "\n", 359000, "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 20));
        phamAdapter.notifyDataSetChanged();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shopcart, menu);
        return true;
    }

    // Bắt sự kiên trên tool bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:

                // Hủy màn hình
                finish();
                onBackPressed();
                return true;


                //Khi người dùng chọn vào menu giỏ hàng di chuyển đến màn hình giỏ hàng
            case R.id.menugiohang:
                Intent intent = new Intent(sanPhamTapLuyen.this, cartActivity.class);
                startActivity(intent);

            default:
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
