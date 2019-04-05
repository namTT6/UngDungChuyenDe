package vn.edu.tdc.fit.chuyende2.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import vn.edu.tdc.fit.chuyende2.R;
import vn.edu.tdc.fit.chuyende2.model.danhMucAll;

public class DaDepAdapter extends RecyclerView.Adapter<DaDepAdapter.ViewHolder> {
    private ArrayList<danhMucAll> listFunction;  // Danh sách
    private Context context;   // Màn hình hiện tại
    private LayoutInflater inflater;

    // Phương thức khởi tạo
    public DaDepAdapter(Context context, ArrayList<danhMucAll> list) {
        this.context = context;
        this.listFunction = list;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DaDepAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Liên kết với giao diện item
        View itemView = inflater.inflate(R.layout.list_item_danhmuc, viewGroup, false);
        return new DaDepAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DaDepAdapter.ViewHolder viewHolder, int i) {
        // Lấy từ hiện tại
        final danhMucAll dm = listFunction.get(i);


        // Set từng giá trị lên item

        viewHolder.imgicon.setImageResource(dm.getHinhAnh());
        viewHolder.tvdanhmuc.setText(dm.getTenDanhMuc());


        // Bắt sự kiện nhấn vào một item
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickedListener.onItemClick(dm.getIdDanhMuc());
            }
        });

    }

    @Override
    public int getItemCount() {
        return listFunction.size();
    }

    //Tao viewholder
    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgicon;
        private TextView tvdanhmuc;
        private TextView tvtonghop;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            tvdanhmuc = (TextView) itemView.findViewById(R.id.tvdanhmuc);
        }
    }
    // Khai báo một phương thức  để ta có thể gọi nó bên ngoài để lấy được dữ liệu
    public interface OnItemClickedListener {
        void onItemClick(int idFunction);

    }

    // Khai báo một biến interface
    private DaDepAdapter.OnItemClickedListener onItemClickedListener;

    // Tạo setter cho biến interface ta vừa tạo
    public void setOnItemClickedListener(DaDepAdapter.OnItemClickedListener onItemClickedListener) {

        this.onItemClickedListener = onItemClickedListener;
    }

}
