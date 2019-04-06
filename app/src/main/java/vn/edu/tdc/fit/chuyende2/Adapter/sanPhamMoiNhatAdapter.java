package vn.edu.tdc.fit.chuyende2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import vn.edu.tdc.fit.chuyende2.Activity.chiTietSanPham;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.danhMuc;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class sanPhamMoiNhatAdapter extends RecyclerView.Adapter<sanPhamMoiNhatAdapter.ViewHolder> {

    // Các thuộc tính
    private ArrayList<sanPham> listFunction;  // Danh sách
    private Context context;   // Màn hình hiện tại
    private LayoutInflater inflater;


    // Phương thức khởi tạo
    public sanPhamMoiNhatAdapter(Context context, ArrayList<sanPham> list) {
        this.context = context;
        this.listFunction = list;
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // Liên kết với giao diện item
        View itemView = inflater.inflate(R.layout.list_item_sanphammoinhat, viewGroup, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        // Lấy từ hiện tại
        final sanPham sp = listFunction.get(i);


        // Set từng giá trị lên item

        viewHolder.imgicon.setImageResource(sp.getHinhAnh());
        viewHolder.tvtensanpham.setText(sp.getTenSanPham());
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        viewHolder.tvgiasanpham.setText("Giá: " + decimalFormat.format(sp.getGiaTien()) + "VNĐ");

    }


    @Override
    public int getItemCount() {
        return listFunction.size();
    }


    // Tạo ra một view holder
    class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView imgicon;
        private TextView tvtensanpham;
        private TextView tvgiasanpham;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            tvtensanpham = (TextView) itemView.findViewById(R.id.tvtensanpham);
            tvgiasanpham = (TextView) itemView.findViewById(R.id.tvgiasanpham);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, chiTietSanPham.class);
                    intent.putExtra("thongtinsanpham",listFunction.get(getPosition()));
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    Toast.makeText(context,listFunction.get(getPosition()).getTenSanPham(),Toast.LENGTH_SHORT).show();
                    context.startActivity(intent);
                }
            });
        }
    }

}
