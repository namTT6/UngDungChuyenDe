package vn.edu.tdc.fit.chuyende2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import vn.edu.tdc.fit.chuyende2.Activity.chiTietSanPham;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.danhMuc;
import vn.edu.tdc.fit.chuyende2.model.sanPham;

public class sanPhamAdapter extends RecyclerView.Adapter<sanPhamAdapter.ViewHolder> {

    // Các thuộc tính
    private ArrayList<sanPham> listFunction;  // Danh sách
    private Context context;   // Màn hình hiện tại
    private LayoutInflater inflater;


    // Phương thức khởi tạo
    public sanPhamAdapter(Context context, ArrayList<sanPham> list) {
        this.context = context;
        this.listFunction = list;
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        // Liên kết với giao diện item
        View itemView = inflater.inflate(R.layout.list_item_sanphamtapluyen, viewGroup, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        // Lấy từ hiện tại
        final sanPham sp = listFunction.get(i);


        // Set từng giá trị lên item

        viewHolder.imgicon.setImageResource(sp.getHinhAnh());
        viewHolder.tvtensanpham.setText(sp.getTenSanPham());
        viewHolder.tvgiasanpham.setText("Giá: " + sp.getGiaTien());
        viewHolder.tvmota.setMaxLines(2);
        viewHolder.tvmota.setEllipsize(TextUtils.TruncateAt.END);
        viewHolder.tvmota.setText(sp.getMoTa());


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
        private TextView tvmota;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            tvtensanpham = (TextView) itemView.findViewById(R.id.tvtensanpham);
            tvgiasanpham = (TextView) itemView.findViewById(R.id.tvgiasanpham);
            tvmota = (TextView) itemView.findViewById(R.id.tvmota);
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
