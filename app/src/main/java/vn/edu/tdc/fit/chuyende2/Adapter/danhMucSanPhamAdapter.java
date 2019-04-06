package vn.edu.tdc.fit.chuyende2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.danhMuc;
import vn.edu.tdc.fit.chuyende2.model.danhMucSanPham;

public class danhMucSanPhamAdapter extends RecyclerView.Adapter<danhMucSanPhamAdapter.ViewHolder> {

    // Các thuộc tính
    private ArrayList<danhMucSanPham> list;  // Danh sách
    private Context context;   // Màn hình hiện tại
    private LayoutInflater inflater;


    // Phương thức khởi tạo
    public danhMucSanPhamAdapter(Context context, ArrayList<danhMucSanPham> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // Liên kết với giao diện item
        View itemView = inflater.inflate(R.layout.list_item_danhmucsanpham, viewGroup, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        // Lấy từ hiện tại
        final danhMucSanPham dm = list.get(i);


        // Set từng giá trị lên item

        viewHolder.imgicon.setImageResource(dm.getHinhAnh());
        viewHolder.tvloaidanhmuc.setText(dm.getTenDanhMucSanPham());


        // Bắt sự kiện click vào một item
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onItemClickedListener.onItemClick(dm.getId());

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Tạo ra một view holder
    class ViewHolder extends RecyclerView.ViewHolder {


        private CircleImageView imgicon;
        private TextView tvloaidanhmuc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgicon = (CircleImageView) itemView.findViewById(R.id.imgicon);
            tvloaidanhmuc = (TextView) itemView.findViewById(R.id.tvloaidanhmuc);
        }
    }


    // Khai báo một phương thức  để ta có thể gọi nó bên ngoài để lấy được dữ liệu
    public interface OnItemClickedListener {
        void onItemClick(int idFunction);

    }

    // Khai báo một biến interface
    private OnItemClickedListener onItemClickedListener;

    // Tạo setter cho biến interface ta vừa tạo
    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener) {

        this.onItemClickedListener = onItemClickedListener;
    }
}
