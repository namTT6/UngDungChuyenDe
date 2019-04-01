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
import vn.edu.tdc.fit.chuyende2.Adapter.thoiTrangThuongHieuAdapter;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class ThoiTrangThuongHieuActivity extends AppCompatActivity {

    private RecyclerView rvsanphamthoitrangthuonghieu;
    private ArrayList<sanPham> dssp;
    private thoiTrangThuongHieuAdapter trangThuongHieuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thoi_trang_thuong_hieu);


        // Set theme
        ThemeManagement.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_thoi_trang_thuong_hieu);
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
        rvsanphamthoitrangthuonghieu = (RecyclerView) findViewById(R.id.rvsanphamthoitrangthuonghieu);
        dssp = new ArrayList<>();
        trangThuongHieuAdapter = new thoiTrangThuongHieuAdapter(ThoiTrangThuongHieuActivity.this, dssp);

        rvsanphamthoitrangthuonghieu.setAdapter(new ScaleInAnimationAdapter(trangThuongHieuAdapter));


        rvsanphamthoitrangthuonghieu.setHasFixedSize(true);

        rvsanphamthoitrangthuonghieu.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        // Set adapter cho recycler view
        rvsanphamthoitrangthuonghieu.setAdapter(trangThuongHieuAdapter);
    }


    public void importSanPham() {
        dssp.add(new sanPham(21, R.drawable.thoitrangmot, "ÁO KHOÁC NAM - ÁO KHOÁC NAM - ÁO KHOÁC NAM313", "690,000 Đ", "Áo giữ nhiệt dành cho nam giới\n" +
                "- Chất liệu: vải poly giữ nhiệt nhập Hàn\n" +
                "\n" +
                "- Form body\n" +
                "\n" +
                "- 6 màu: Đen- Trắng- Xám- Đỏ đô- Tím than\n" +
                "\n" +
                " Chất liệu: 100% thun coton co giãn 4 chiều\n" +
                "\n" +
                "- Form người Việt\n" +
                "\n" +
                "- Size M (45-55kg) L(55-65kg) XL(65-80kg)\n" +
                "\n" +
                "Các b vào shop, chọn phần 11.11 kéo xuống để lấy mã giảm nha.\n" +
                "\n" +
                "Việt Nam tuy nằm ở miền nhiệt đới nhưng khí hậu mùa đông vô cùng khắc nghiệt với những đợt không khí lạnh giá buốt từ miền bắc tràn về. Chính vì vậy, mặc quần áo vào mùa đông đối với các chàng luôn là một vấn đề nan giải. Làm sao để mặc đẹp mà vẫn ấm ? Mặc nhiều thì quần áo cộm, xộc xệch ! Mậc ít thì lại dễ bị nhiếm lạnh!\n" +
                "\n" +
                "Thấu hiếu những sự khó khăn đó, Vsport hân hạnh được giới thiệu tới anh em mẫu áo giữ nhiệt body mới nhất của bên mình. Với vải thun coton 100% nhập ngoại với công nghệ đan dệt tiên tiến nhất , chuyên cấp vải cho các hãng thời trang thể thao , Áo thun giữ nhiệt body Vsport sẽ đem lại cho anh em 1 trải nghiệm vô cùng thoài mái.Áo thun giữ nhiệt body với vải thun coton 100% rất nhẹ, mỏng, mà vẫn giữ được nhiệt cho anh em . Chỉ cần mặc 1 áoÁo thun giữ nhiệt body bên trong, sau đó mặc sơ mi hoặc một chiếc áo dài tay, kết hợp với 1 chiếc áo khoác là anh em có thể đảm bảo ấm áp cả ngày.Áo thun giữ nhiệt body với vải công nghệ sẽ giúp anh em giữ được tới 80% nhiệt lượng tỏa ra từ cơ thể mà không bị mất ra ngoài, điều đó làm anh em sẽ không bị nhiễm lạnh, cũng như giữ được nhiều năng lực để có thể làm việc, chơi thể thao.Áo thun giữ nhiệt body Vsport cực kỳ co giãn, giúp anh em thoải mái vận động mà không sợ gò bó. Ngoài mặc đi làm, đi ra ngoài,Áo thun giữ nhiệt body còn có thể dùng trong chơi thể thao. Anh em đá bóng, bóng rổ, cầu lông, hoặc chơi các môn vận động ngoài trời, chỉ cần mặc 1Áo thun giữ nhiệt body rồi mặc các áo thể thao bên ngoài là có thể chơi môt cách yên tâm không sợ lạnh\n" +
                "\n", 21));
        dssp.add(new sanPham(22, R.drawable.thoitranghai, "Áo sơ mi nam dài tay màu đen", "99,000 Đ", "Facioshop - Sinh ra để dẫn dắt xu hướng thời trang (Born to lead the fashion trend)\n" +
                "\n" +
                "Facioshop chuyên cung cấp áo thun cổ lọ nam tay dài, size M-4XL, chất liệu cotton 100%, mịn giữ nhiệt tốt. Áo có nhiều màu để quí khách lựa chọn, phù hợp với mọi lứa tuổi, mix cùng vest hoặc áo da cực hợp và đẹp.\n" +
                "\n" +
                "Sản phẩm thích hợp cho khí hậu Việt Nam, có thể mặc giữ ấm hoặc theo xu hướng thời trang phong cách Hàn quốc. Shop có sản xuất cho cả nam và nữ, vải giặt máy hoặc giặt tay không sợ dãn. \n" +
                "\n" +
                "Size M: 50-60kg, Size L: 60-70kg, Size XL: 70-80kg, Size 2XL 80-90kg, size 3XL: 90-100kg, size 4XL: trên 100kg. \n" +
                "\n" +
                "Quí khách mua sản phẩm cung cấp bởi Facioshop được kiểm tra sản phẩm trước khi nhận hàng, và chế độ bảo hành 1 đổi 1 nếu có lỗi hoặc không vừa size. Hiện nay có nhiều shop sao chép hình ảnh của Facioshop và cung cấp. Quí khách nên cân nhắc kỹ trước khi lựa chọn để tránh nhầm lẫn độ uy tín cũng như dịch vụ của Facioshop.  \n" +
                "\n" +
                "Nếu quí khách cần chất liệu áo cổ lọ Len vui lòng click vào link shop bên dưới - để xem sản phẩm áo cổ lọ len nam nữ. \n" +
                "\n" +
                "Cần tư vấn thêm quí khách liên hệ: 0989 810 110 (mua lẻ) và 0906 966 011 (mua sỉ).\n" +
                "\n" +
                "Quí khách lưu ý mua đủ hóa đơn dể được hỗ trợ ship tối đa 50k và đồng thời giảm theo chương trình giảm giá của Facioshop.\n" +
                "\n" +
                "--------------------------------\n" +
                "\n" +
                "Chuyên phân phối, gia công mặt hàng nam nữ, giá cạnh tranh, nhận may cho các shop và đại lý các tỉnh.\n" +
                "\n" +
                "Bán sỉ cho học sinh sinh viên, hàng lun có sẵn sll tại shop:  - áo thun, áo sơ mi, áo khoác, quần short, quần kaki, quần jeans & phụ kiện.\n" +
                "\n" +
                "Có nhiều ưu đãi khách mua lẻ tại shop. Nhận đặt áo thun gia đình, kể cả áo cho các bé – size nhỏ, áo cho bố, mẹ - size lớn…Size 2XL, 3XL, 4XL phụ thu 15k/size.\n" +
                "\n" +
                "Địa chỉ các chi nhánh của Facio Shop, Quý khách vui lòng truy cập website: www.facioshop.com để biết rõ hơn.\n" +
                "\n" +
                "Like và share facebook shop để theo dõi chương trình khuyến mãi: www.facebook.com/facioshop\n" +
                "\n" +
                "Theo dõi sản phẩm tại web: www.facioshop.com hoặc http://www.sendo.vn/shop/facioshop\n" +
                "\n" +
                "GIAO HÀNG TRÊN TOÀN QUỐC\n" +
                "\n" +
                "GIAO HÀNG MIỄN PHÍ tại nội thành TPHCM cho đơn hàng trên 400k.\n" +
                "\n" +
                "áo thun cổ lọ nam tay dài\n" +
                "\n" +
                "áo thun cổ lọ nam , áo thun cổ lọ , áo thun cổ lọ tay dài, áo thun cổ lọ đẹp", 22));
        dssp.add(new sanPham(23, R.drawable.thoitrangba, "QUẦN BƠI NAM KẺ CARO ẤN TƯỢNG-QB13",
                "180,000 Đ", "Áo Thun Dài Tay Nam\n" +
                "Hàng Việt Nam - Form xuông\n" +
                "\n" +
                "Size: M L XL XXL\n" +
                "\n" +
                "Chất liệu: thun 4 chiều\n" +
                "\n" +
                "( Nhập mã L4NQZYM2 để được giảm 20.000 cho đơn hàng > 240.000 )\n" +
                "\n" +
                "-----------------------------------------------------\n" +
                "\n" +
                "[ Cám ơn anh chị đã ghé qua shop ]\n" +
                "Anh chị nào đặt hàng qua APP ĐIỆN THOẠI thì nhớ điền MÃ ÁO (số góc trên bên trái áo ấy: SOC748, DC114, AT22 ) vào phần GHI CHÚ để em gửi đúng màu anh chị đặt hen.\n" +
                "\n" +
                "Link Sendo shop --->   https://www.sendo.vn/shop/soc89\n" +
                "\n" +
                "Facebook : www.facebook.com/soc89\n" +
                "\n" +
                "GỌI / SMS / ZALO đặt hàng 0903.90.28.09\n" +
                "\n" +
                "-------------------------------------\n" +
                "\n" +
                "Xem thêm các mẫu khác, khách bấm vào bên dưới:\n" +
                "\n" +
                "Áo Thun Nam => Áo Thun Có Cổ - Áo Thun Không Cổ - Áo Thun Dài Tay - Áo Thun 3 Lỗ\n" +
                "Áo Sơ Mi Nam => Áo Sơ Mi Trơn - Áo Sơ Mi Ca Ro - Áo Sơ Mi Kẻ Sọc - Áo Sơ Mi Họa Tiết\n" +
                "Áo Khoác Nam =>  Áo Khoác Dù - Áo Khoác Nỉ - Áo Khoác Kaki - Áo Khoác Jean\n" +
                "Quần Short Nam => Quần Short Jean - Quần Short Kaki\n" +
                "Quần Dài Nam => Quần Jogger - Quần Tây Công Sở\n" +
                "Quần Áo Thể Thao => Áo Thể Thao\n" +
                "Áo Đôi - Áo Gia Đình\n" +
                "-------------------------------------\n" +
                "\n" +
                "--- Góc giải đáp thắc mắc ---\n" +
                "--- Vải mặc có mát không, có bị giãn không? ---\n" +
                "Anh chị yên tâm là vải mềm mịn thoáng mát hen. Do hàng bên shop đa số đều là thun 4 chiều 100% cotton nên thấm hút mồ hôi tốt, lại không bị xù lông hay chảy vải ;)\n" +
                ".\n" +
                "--- Mua nhiều có khuyến mãi gì không? ---\n" +
                "Nhập mã L4NQZYM2 giảm 20.000 cho đơn hàng > 240.000\n" +
                "Nhập mã 05G2FYAB giảm 30.000 cho đơn hàng > 360.000\n" +
                "Nhập mã LJIUCOF8 giảm 40.000 cho đơn hàng > 480.000\n" +
                "( nhập mã giảm giá trong phần THANH TOÁN đơn hàng )\n" +
                ".\n" +
                "--- Rồi giao hàng với thanh toán sao? ---\n" +
                "Anh chị vui lòng đặt trên Sendo (nhớ ghi rõ địa chỉ, sdt và tên người nhận nha) để em gửi qua bưu điện. MỞ ĐIỆN THOẠI để giao hàng tới thì gọi anh chị nha, anh chị có thể yêu cầu MỞ HÀNG ra kiểm tra, vừa ý thì THANH TOÁN cho giao hàng.\n" +
                ".\n" +
                "--- Lấy hàng rồi có đổi size khác được không? ---\n" +
                "Trường hợp mặc rộng hay chật, khách muốn đổi size áo thì phí đổi trả shop và khách cùng chia đôi.\n" +
                ".\n" +
                "--- Chính sách đổi - trả áo như thế nào? ---\n" +
                "- Trường hợp hàng bị lỗi nghiêm trọng hoặc không giống ảnh, shop sẽ hoàn trả 100% đơn hàng cho khách.\n" +
                "- Nếu khách đã nhận hàng nhưng không vừa ý muốn trả lại hàng , shop sẽ hoàn trả 80% giá trị đơn hàng, và khách chịu phí trả hàng về shop. Nên mong khách kiểm tra hàng ngay khi nhân viên giao hàng vừa giao tới.\n" +
                ".\n" +
                "--- Tôi muốn trực tiếp shop xem hàng luôn được không? ---\n" +
                "Rất tiếc là hiện tại Sọc89 chỉ bán hàng online chứ chưa có shop ở ngoài. Mong khách thông cảm.\n" +
                ".\n" +
                "--- Tôi muốn mua nhiều sản phẩm khác nhau chung 1 đơn hàng sao không được? ---\n" +
                "Khách xem hình bên dưới rồi làm theo trình tự nha, hoặc gọi tới 0903 90 28 09 để shop hướng dẫn cụ thể hơn.\n" +
                "\n" +
                "\n" +
                "\n", 23));
        dssp.add(new sanPham(24, R.drawable.thoitrangbon, "Váy xuông cao cấp màu ghi khói thời trang - DAMNU2018_0027"
                , "185,000 Đ", "ÁO THUN NAM PHONG CÁCH\n" +
                "\n" +
                "Thông tin liên hệ: 0984373861 (Zalo /Viber/ Ims) hoặc add zalo 0898451592 để xem mẫu\n" +
                "\n" +
                "ÁO THUN NAM không chỉ thoải mái và tiện lợi để mặc trong nhiều dịp khác nhau như đi làm, đi chơi, dạo phố mà còn giúp ngừoi mặc tự tin hơn với phong cách thời trang độc đáo.\n" +
                "– Sản phẩm được may bằng thun cotton mềm, màu sắc thanh lịch, dễ dàng phối hợp nhiều loại quần hay áo khoác, phụ kiện.\n" +
                "\n" +
                "– Size M: dưới 58kg\n" +
                "- Size L: dưới 68kg\n" +
                "\uD83D\uDD1C\uD83D\uDD1C\uD83D\uDD36\uD83D\uDD36 Để lựa chọn nhiều mẫu hơn và tư vấn kĩ hơn, vui lòng nhắn tin số zalo 0898451592 (ko gọi). Xin cám ơn\n", 24));
        dssp.add(new sanPham(25, R.drawable.sanphamnam, "Áo Khoác Jeans Nam In Sành Điệu - aokhoacnam-1", "175,000 Đ", "Bạn cần hướng dẫn cách thức đặt hàng , mà bạn có rất ít thời gian , hay cần tư vấn trực tiếp hãy gọi  hoặc zalo 0974511076   dc tư vấn  nhanh\n" +
                "Vẫn là thiết kế cổ tim, không kén dáng người mặc, đồng thời điểm nhấn chính là xẻ đùi, các nàng sẽ thấy vô cùng thoải mái và tiện lợi trong từng bước đi cũng như việc di chuyển trên các phương tiện xe máy. Chất liệu thun gân có độ co giãn cũng như thấm hút mồ hôi tốt, 4 màu sắc chủ đạo: đen, nâu bò  liệu bạn có thể bỏ qua được một em váy siêu xinh như này.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "➡️ CHẤT LIỆU: Váy được làm từ chất liệu thun gân co giãn thoải mái. Đường tăm nổi làm cho người mặc cảm giác thon gọn, tôn nên những đường nét của cơ thể, giúp bạn gái tự tin hơn trước người đối diện\n" +
                "➡️ SIZE : Váy thiết kế freesize phù hợp với người cao 1m58 cân nặng 40-58kg. ước tính chỉ mang tính chất tương đối nên bạn nào cao hoặc thấp hơn có thể inbox trực tiếp shop tư vấn nhé.\n" +
                "Bạn cần hướng dẫn cách thức đặt hàng , mà bạn có rất ít thời gian , hay cần tư vấn trực tiếp hãy gọi  hoặc zalo 0974511076   dc tư vấn  nhanh\n" +
                "Vẫn là thiết kế cổ tim, không kén dáng người mặc, đồng thời điểm nhấn chính là xẻ đùi, các nàng sẽ thấy vô cùng thoải mái và tiện lợi trong từng bước đi cũng như việc di chuyển trên các phương tiện xe máy. Chất liệu thun gân có độ co giãn cũng như thấm hút mồ hôi tốt, 4 màu sắc chủ đạo: đen, nâu bò  liệu bạn có thể bỏ qua được một em váy siêu xinh như này.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "➡️ CHẤT LIỆU: Váy được làm từ chất liệu thun gân co giãn thoải mái. Đường tăm nổi làm cho người mặc cảm giác thon gọn, tôn nên những đường nét của cơ thể, giúp bạn gái tự tin hơn trước người đối diện\n" +
                "➡️ SIZE : Váy thiết kế freesize phù hợp với người cao 1m58 cân nặng 40-58kg. ước tính chỉ mang tính chất tương đối nên bạn nào cao hoặc thấp hơn có thể inbox trực tiếp shop tư vấn nhé.\n" +
                "Bạn cần hướng dẫn cách thức đặt hàng , mà bạn có rất ít thời gian , hay cần tư vấn trực tiếp hãy gọi  hoặc zalo 0974511076   dc tư vấn  nhanh\n" +
                "Vẫn là thiết kế cổ tim, không kén dáng người mặc, đồng thời điểm nhấn chính là xẻ đùi, các nàng sẽ thấy vô cùng thoải mái và tiện lợi trong từng bước đi cũng như việc di chuyển trên các phương tiện xe máy. Chất liệu thun gân có độ co giãn cũng như thấm hút mồ hôi tốt, 4 màu sắc chủ đạo: đen, nâu bò  liệu bạn có thể bỏ qua được một em váy siêu xinh như này.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "➡️ CHẤT LIỆU: Váy được làm từ chất liệu thun gân co giãn thoải mái. Đường tăm nổi làm cho người mặc cảm giác thon gọn, tôn nên những đường nét của cơ thể, giúp bạn gái tự tin hơn trước người đối diện\n" +
                "➡️ SIZE : Váy thiết kế freesize phù hợp với người cao 1m58 cân nặng 40-58kg. ước tính chỉ mang tính chất tương đối nên bạn nào cao hoặc thấp hơn có thể inbox trực tiếp shop tư vấn nhé.", 25));
        dssp.add(new sanPham(26, R.drawable.sanphamsau, "áo khoác jeans rách fashion Mã: NK1250 - NK1250", "310,000 Đ", "Chất vải: Voan.\n" +
                "Chiều dài váy: Trên gối.\n" +
                "Chiều dài tay áo: Tay ngắn.\n" +
                "Kiểu cổ áo: Cổ tròn.\n" +
                "Họa tiết: Trơn.\n" +
                "Phong cách: Nhẹ nhàng.\n" +
                "CHI TIẾT SẢN PHẨM\n" +
                "⚛️ Sản phẩm:Đầm xếp ly nhẹ nhàng Haint Boutique da36\n" +
                "✅ Mã sản phẩm :da36\n" +
                "\n" +
                "✅ kích thước :s-2xl\n" +
                "\n" +
                "✅ Thích hợp: đi biển, đi chơi, dự tiệc, dã ngoại,đi chơi tết..\n" +
                "\n" +
                " \n" +
                "\n" +
                "⚛️ Cam kết của shop\n" +
                "\n" +
                "✅ Sản phẩm giống hình 100%.\n" +
                "\n" +
                "✅ Đây là hàng shop nhập trực tiếp không qua bất cứ trung gian nào,  không phải hàng gia công tại Việt Nam nên quý khách có thể yên tâm về chất lượng sản phẩm.\n" +
                "\n" +
                "✅ Ship COD toàn quốc (giao hàng và thu tiền tận địa chỉ khách hàng).\n" +
                "\n" +
                "✅ Được xem và kiểm tra sản phẩm trước khi thanh toán nhận hàng.\n" +
                "\n" +
                "✅ Hỗ trợ đổi hàng trong vòng 48 giờ với các lý do khách quan (không vừa size, lỗi sản phẩm,..)\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "       ⚛️ Ưu đãi từ shop\n" +
                "\n" +
                "✅ Đơn hàng hoàn tất được đánh giá 5* bạn sẽ được giảm thêm 5% cho đơn hàng tiếp theo khi mua của shop (Vui lòng liên hệ trực tiếp cho lần mua tiếp theo để shop xác nhận thông tin chính xác).", 26));
        dssp.add(new sanPham(27, R.drawable.thoitrangbon, "Áo Sơ Mi Công Sở Đính Trân Châu - RR154", "197,000 Đ", "Chất Liệu : Cotton Thun\n" +
                "Màu Sắc : Đen, Trắng và Đỏ\n" +
                "Kích Thước : Freesize ( Dưới 55kg)\n" +
                "Chất Thun mềm mại, co giản, thoáng mát, thoát mồ hôi.\n" +
                "Mẫu Đầm thiết kế đầy cá tính nhưng không kém phần sang trong, Cổ dây kéo rất hiện đại.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Cách thức mua hàng:\n" +
                "\n" +
                "Cách 1: Nhấn vào nút \"mua ngay\" và điền thông tin chi tiết để đặt hàng\n" +
                "\n" +
                "Cách 2: Nhắn tin theo cú pháp:\n" +
                "\n" +
                "Mã sản phẩm - màu sắc - tên người nhận - SDT - địa chỉ nhận hàng vào hotline: 0909 73 73 85 hoặc Add zalo shop để tư vấn 0909 73 73 85\n" +
                "\n" +
                "Sẽ có nhân viên liên hệ lại để hỗ trợ sớm nhất\n" +
                "\n" +
                "Cam kết về chất lượng và dịch vụ bán hàng\n" +
                "\n" +
                "- Cung cấp các sản phẩm theo đúng tiêu chuẩn với chất lượng tốt nhất;\n" +
                "\n" +
                "- Giá cả cạnh tranh;\n" +
                "\n" +
                "- Đáp ứng mọi yêu cầu của khách hàng trong thời gian ngắn nhất;\n" +
                "\n" +
                "- Đảm bảo về số lượng và đúng chủng loại khách đặt ;\n" +
                "\n" +
                "- Tư vấn miễn phí 24/24 cho quý khách hàng về các sản phẩm của chúng tôi, bất cứ thắc mắc gì trước và sau khi mua sản phẩm ;\n" +
                "\n" +
                "- Shop chỉ cung cấp những sản phẩm có chất lượng tốt nhất tới tay khách hàng.\n" +
                "\n" +
                "Với phương châm “Sự hài lòng của quý khách là thành công của chúng tôi”, luôn luôn lắng nghe và sẵn sàng tiếp thu mọi ý kiến góp ý của quý khách hàng; không ngừng cải tiến, nghiên cứu và ứng dụng các công nghệ mới vào sản xuất để ngày càng hoàn thiện hơn các dòng sản phẩm chính, nâng cao tính năng và giảm giá thành sản xuất, mang lại cho khách hàng nhiều sự lựa chọn với giá cả hợp lý nhất\n" +
                "\n" +
                "THAM KHẢO THÊM CÁC SẢN PHẨM KHÁC CỦA SHOP TẠI ĐÂY", 27));
        dssp.add(new sanPham(28, R.drawable.thoitrangtam, "BỘ ĐỒ THỂ THAO NỮ PHỐI SỌC - m105", "99,000 Đ", "ĐẦM SUÔNG PHỐI REN 2 LỚP - DCS61\n" +
                "Chất liệu: Vải ren mềm mịn dày dặn,có lớp lót co giãn mặc thoải mái khi duy chuyển,vận động.Đặc biệt không ra màu khi giặt,thoải mái khi giặt máy\n" +
                "\n" +
                "Kiểu dáng trẻ trung phù hợp với các bạn khi đến công sở,dạo phố cùng bạn bè,...\n" +
                "\n" +
                "Sản phẫm chỉ phù hợp với những bạn từ 40kg đến 54kg thôi nha tương ứng với size S,M,L.Các bạn có chiều cao cân nặng khác muốn bon chen thì gọi shop tư vấn trước khi order nhé,ko thì mắc công đổi trả nha\n" +
                "\n" +
                "Hàng giống y hình đẹp khỏi chê nha khách\n" +
                "\n" +
                "xem thêm sp shop https://www.sendo.vn/shop/huynh-pham-shop/\n" +
                "\n" +
                "Cách thức mua hàng:\n" +
                "\n" +
                "Cách  1:Khách đặc trực tiếp trên sendo ,khách vào đặc mua và điền đầy đủ thông tin sendo yêu cầu\n" +
                "\n" +
                "Cách 2:Khách có thể gọi số 0976 818 878 hoặc nhắn tin mã sản phẫm, màu, size shop sẽ gọi lại để được tư vấn thêm về sản phẫm  khách muốn mua.\n" +
                "\n" +
                "Đó chỉ là cách thức mua nha khách còn sản phẩm,chất lượng ,mẫu mã,giá là 1.\n" +
                "\n" +
                "Cách thức giao dịch:\n" +
                "\n" +
                "Shop sẽ vận chuyển hàng cho khách bằng dịch vụ COD của bưu điện,nhân viên bưu điện sẽ giao hàng  tận nhà hoặc cơ quan của khách và thu tiền\n" +
                "\n" +
                "                   KHÁCH CÓ NHU CẦU SĨ SLL, BUÔN .... LIÊN HỆ 0976 818 878 (ZALO)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "CÁCH BẢO QUẢN VÁY ĐẦM\n" +
                "\n" +
                "Váy đầm mới mua về thường bị ra màu? Vậy làm sao để giữ màu cho những chiếc đầm tốt nhất? Để chúng luôn sáng và mới khi nàng diện lên người. Sau đây là một vài mẹo nhỏ vô cùng hữu ích giúp nàng luôn giữ màu sắc của những chiếc váy đầm như ban đầu nhé:\n" +
                "\n" +
                "Giặt bằng nước lạnh\n" +
                "Nước ấm sẽ khiến các sợi vải bị nới lỏng, theo đó chất nhuộm và màu sắc váy đầm (nhất là quần jeans) có xu hướng mờ nhanh hơn. Vì vậy, tốt nhất mọi người nên giặt chúng trong nước lạnh để bảo quản màu.\n" +
                "\n" +
                "Dùng dấm\n" +
                "Ngâm váy đầm vào nước có pha dấm, nếu không các chị cũng có thể dùng phèn chua hoặc muối ăn trong khoảng từ 1-2 tiếng đồng hồ. Dấm và phèn chua sẽ làm cho quần áo của nàng bền màu hơn. Sau đó giặt lại với nước lạnh cho sạch và phơi khô\n" +
                "\n" +
                "Cách sử dụng:\n" +
                "\n" +
                "- Đối với giấm: Thêm 1 cốc (250 ml) giấm trong lượt xả nước cuối cùng sẽ giúp làm mềm vải và bền màu hơn.\n" +
                "\n" +
                "- Dùng muối trắng: bỏ 1/2 chén (125 ml) muối ăn vào xả váy đầm, chúng sẽ ngăn chặn phai màu hiệu quả, đặc biệt với quần áo mới. Ngoài ra, muối giúp khôi phục lại màu sắc của quần áo cũ một cách nhanh chóng.\n" +
                "\n" +
                "Lộn trái quần áo khi giặt\n" +
                "Bề mặt của vải cũng như màu nhuộm sẽ mất dần khi bị chà xát mạnh. Vì thế, cách đơn giản là hãy lộn trái váy đầm khi giặt. Thêm nữa, người giặt có thể làm giảm lượng mài mòn và ma sát vào vải bằng cách đóng cúc hoặc bất kỳ móc khóa nào trên đồ giặt.\n" +
                "\n" +
                "Dùng lá trầu không\n" +
                "Cách này mất thời gian hơn cách 1 một chút. Đầu tiên nàng cần hái lá trầu không và rửa sạch; vò nát lá trầu không cho vào nồi nước. Sau đó, lọc hết lá trầu không đi, chỉ để lại nước. Tiến hành ngâm quần vào nước trầu không khoảng 45 phút. Với cách này, sau khi ngâm quần trong nước lá trầu không bạn phơi vắt khô nước rồi phơi luôn mà không cần phải giặt lại.\n" +
                "\n" +
                "Dùng nước dừa khô\n" +
                "Đối với nước dừa khô thì chị em tiến hành làm tương tự như với dấm:\n" +
                "\n" +
                "Ngâm quần vào nước có pha dừa khô khoảng 3 tiếng đồng hồ. Sau đó giặt lại với nước lạnh cho sạch và phơi khô\n" +
                "\n" +
                "Dùng bột cà phê, trà\n" +
                "Cà phê và trà đen đều được sử dụng như thuốc nhuộm tự nhiên. Chị em có thể bỏ 2 chén (500 ml) cà phê hoặc trà đen vào nước xả cuối cùng khi giặt quần áo tối màu, hai loại bột này sẽ tăng cường màu sắc tổng thể của quần áo.\n" +
                "\n" +
                "Sử dụng chất tẩy rửa chuyên dụng\n" +
                "Ngày nay, một số loại bột giặt hoặc chất tẩy rửa đặc biệt sử dụng với các loại vải bóng, tối màu, có thể là giải pháp hỗ trợ tránh phai màu quần áo. Hóa chất tẩy rửa dạng lỏng sẽ tốt hơn so với chất dạng bột khi giặt bằng nước lạnh và giặt trong chu kỳ ngắn, hoặc các chị có thể dùng xà phòng tắm để giặt nhé.", 28));
        dssp.add(new sanPham(29, R.drawable.thoitrangchin, "MIỄN SHIP TOÀN QUỐC- Bộ đồ lửng form dài áo cách điệu BDL125 - BDL125", "175,000 Đ", "ĐẦM GIÚP BỤNG TRÔNG THON GỌN - THỜI TRÁNG BIG SIZE\n" +
                "\n" +
                "Size: M - XL - XXL - XXXL - XXXXL (Có bảng size đối chiếu bên dưới)\n" +
                "\n" +
                "Chất liệu: Vải tre có sứa chìm - Rất mát, thấm hút mồ hôi và dành dặn, đứng dáng\n" +
                "\n" +
                "Hình chụp có kèm ảnh thật\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Những cô nàng béo bụng luôn mang một nỗi khổ đó chính là làm sao để che đi khuyết điểm này và có thể tự tin diện những trang phục ưa thích.\n" +
                "\n" +
                "- Đầm suông cho nàng béo bụng chính là những gợi ý tuyệt vời nhất. Đầm được rất nhiều bạn gái ưa thích vì sự thoải mái khi diện chúng. Hơn nữa đầm suông lại giúp bạn gái che đi những khuyết điểm trên cơ thể mình một cách hoàn hảo nhất.\n" +
                "\n" +
                "- Đầm suông không chỉ giúp các nàng gầy trông “có da có thịt” hơn mà còn giúp những nàng béo bụng che đi phần mỡ thừa.\n" +
                "\n" +
                "Đầm suông chính là vị cứu tinh cho các nàng béo bụng. Nhanh tay nào các bạn gái\n" +
                "Tham khảo thêm SP\n" +
                "\n" +
                "Liên hệ tự vấn Zalo: 01234 700 138\n" +
                "Tham khảo thêm SP tại: Lylyhouse.com\n" +
                "FREE SHIP CHO ĐƠN HÀNG TRÊN 150K\n" +
                "\n" +
                "★★★  KHÔNG GIỐNG HÌNH HOÀN TIỀN 100% ★★★\n" +
                "Hàng đảm bảo chất lượng, tuyệt đối không có hàng không giống hình.\n" +
                "Màu có thể đậm hoặc nhạt hơn đôi chút do sự can thiệp của ánh sáng khi chụp.\n" +
                "XEM THÊM CÁC BỘ SƯU TẬP KHÁC:  ÁO KIỂU NỮ BIG SIZE - ÁO THUN NỮ BIG SIZE - VÁY BIG SIZE - ĐỒ BỘ MẶC NHÀ BIG SIZE", 29));
        dssp.add(new sanPham(30, R.drawable.thoitrangbay, "Áo hai dây nữ - A005", "39,000 Đ", "Đầm Voan Suông Họa Tiết Thêu HR1464\n" +
                "\n" +
                "Hàng nhập quảng châu , chất liệu và đường may đẹp miễn chê\n" +
                "\n" +
                "- Chất liệu :   voan thêu hoa tinh tế, tỉ mỉ , sắc nét , form suông xẻ tà trước , che tốt các khuyết điểm \n" +
                "\n" +
                "- Màu sắc : như hình \n" +
                "\n" +
                "- Size (form  quảng châu) : M, L, XL, XXL.\n" +
                "\n" +
                "Size M  : Ngực 85-88. Dài đầm 106-108. Vai 36\n" +
                "Size L :    Ngực 89-92. Dài đầm 106-108. Vai 37\n" +
                "Size XL : Ngực 92 - 95. Dài đầm 108 - 110. Vai 38\n" +
                "Size XXL : Ngực 96 - 99. Dài đầm 108 - 110. Vai 39\n" +
                "Phí vận chuyển & thời gian nhận hàng\n" +
                "\n" +
                "Phí vận chuyển  :\n" +
                "\n" +
                " + Đối với khu vực TPHCM : 20k phí vận chuyển\n" +
                "\n" +
                "+ Đối với các tỉnh thành khác : phí vận chuyển 35.000đ/ đơn. Miễn phí vận chuyển toàn quốc cho đơn hàng từ 2 sản phẩm trở lên.\n" +
                "\n" +
                "- Thời gian giao sản phẩm :\n" +
                "\n" +
                "+ Đối với khu vực TPHCM : 1 - 2 ngày làm việc.\n" +
                "\n" +
                "+ Đối với các tỉnh thành khác : 3 - 7 ngày làm việc\n" +
                "\n" +
                "+ Liên hệ: 0903740760-0903898337 (8h-12h : 1h-17h) [ Từ T2- CN] ", 30));
        trangThuongHieuAdapter.notifyDataSetChanged();

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
