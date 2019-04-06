package vn.edu.tdc.fit.chuyende2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.adapters.ScaleInAnimationAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.sanPhamAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.sucKhoeLamDepAdapter;
import vn.edu.tdc.fit.chuyende2.Adapter.thoiTrangThuongHieuAdapter;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class sucKhoeLamDepActivity extends AppCompatActivity {

    private RecyclerView rvsuckhoe;
    private ArrayList<sanPham> dssp;
    private sucKhoeLamDepAdapter khoeLamDepAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suc_khoe_lam_dep);


        // Set theme
        ThemeManagement.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_suc_khoe_lam_dep);
        setControl();
        importSanPham();


        // Khởi tạo tool bar và thay thế action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Loại bỏ tiêu đề tool bar
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        // Hiển thị nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setControl() {
        rvsuckhoe = (RecyclerView) findViewById(R.id.rvsuckhoe);
        dssp = new ArrayList<>();
        khoeLamDepAdapter = new sucKhoeLamDepAdapter(sucKhoeLamDepActivity.this, dssp);

        rvsuckhoe.setAdapter(new ScaleInAnimationAdapter(khoeLamDepAdapter));


        rvsuckhoe.setHasFixedSize(true);

        rvsuckhoe.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        // Set adapter cho recycler view
        rvsuckhoe.setAdapter(khoeLamDepAdapter);
    }

    public void importSanPham() {
        dssp.add(new sanPham(31, R.drawable.lamdepmot, "NƯỚC HOA NỮ AVON BLUE INDIVIDUAL FOR HER 50ML - 0105", "79,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 31));
        dssp.add(new sanPham(32, R.drawable.sanphamhai, "Hấp lụa tơ tằm dưỡng tóc - hap lua fakeshu", "60,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 32));
        dssp.add(new sanPham(33, R.drawable.sanphamba, "Bộ Dầu Gội Xả Mefaso 850ml*2 - HJKG", "20000", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 33));
        dssp.add(new sanPham(34, R.drawable.sanphambon, "Dầu gội Head Shoulder Sạch gàu Bạc hà mát rượi chai 850ml"
                , "165,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 34));
        dssp.add(new sanPham(35, R.drawable.lamdephai, "Nước Hoa COOC SHILIYA PERFUME - TL2", "150,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 35));
        dssp.add(new sanPham(36, R.drawable.lamdepba, "Bộ 4 Nước Hoa Macreat Nữ Quyến Rũ - AB05", "200,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 36));
        dssp.add(new sanPham(37, R.drawable.sanphambay, "NƯỚC HOA HỒNG GẠO NHẬT BẢN Naturie 500ML - 0000058", "105,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 37));
        dssp.add(new sanPham(38, R.drawable.lamdepbon, "Nước hoa hồng Innisfree Green Tea Balancing Skin EX 200ml - 8809560244433",
                "274,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 38));
        dssp.add(new sanPham(39, R.drawable.lamdepnam, "Bộ 3 khung vẽ chân mày - m163", "15,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 39));
        dssp.add(new sanPham(40, R.drawable.sanphammuoi, "Set Chì kẻ mày Novo siêu mịn gồm 3 lõi thay thế cùng 3 kiểu khuôn mày", "55,000 Đ", "\uD83D\uDC49TỔNG HỢP LẠI CÁC MÙI HƯƠNG CÒN CHO CÁC BẠN DỄ LỰA CHỌN:\n" +
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
                "➡ Nguyên chất không cồn nên không bị dị ứng, ai cũng dùng được.", 40));
        khoeLamDepAdapter.notifyDataSetChanged();

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

            default:
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
