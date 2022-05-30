package folder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.PdfAdapter;
import com.example.test.R;
import java.util.ArrayList;

public class FolderAdapter extends RecyclerView.Adapter<FolderAdapter.MyViewHolder> {
    private ArrayList<DataFolder> dataFolders;
    private Context context;

    public FolderAdapter(ArrayList<DataFolder> dataFolders, Context context) {
        this.dataFolders = dataFolders;
        this.context = context;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context  = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View folderView = inflater.inflate(R.layout.item_folder,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(folderView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DataFolder dataFolder = dataFolders.get(position);

        holder.anh.setImageResource(dataFolder.getAnh());
        holder.ten.setText(dataFolder.getTen());
        holder.Sua.setImageResource(dataFolder.getSua());
        holder.Xoa.setImageResource(dataFolder.getXoa());
    }

    @Override
    public int getItemCount() {
        return dataFolders.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView anh;
        public TextView ten;
        public ImageButton Sua;
        public ImageButton Xoa;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            anh = itemView.findViewById(R.id.anh);
            ten = itemView.findViewById(R.id.txtTen);
            Sua = itemView.findViewById(R.id.imgbtnSua);
            Xoa = itemView.findViewById(R.id.imgbtnXoa);


        }
    }
}
