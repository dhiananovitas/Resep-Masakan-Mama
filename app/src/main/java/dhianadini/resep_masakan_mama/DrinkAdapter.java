package dhianadini.resep_masakan_mama;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.MyViewHolder> {
    Context mContext;
    List<Drink> mData;
    Intent intent;
    public View v;
    Dialog myDialog;
    public DrinkAdapter(Context mContext, List<Drink> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        v = LayoutInflater.from(mContext).inflate(R.layout.item_minuman,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.activity_detail_minuman);


        vHolder.item_minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageView dialog_foto = (ImageView) myDialog.findViewById(R.id.imageFoto);
                TextView dialog_jdl = (TextView) myDialog.findViewById(R.id.jdl_drink);
                TextView dialog_dsc = (TextView) myDialog.findViewById(R.id.desc_drink);
                TextView dialog_bhn = (TextView) myDialog.findViewById(R.id.bahan_drink);
                TextView dialog_cr = (TextView) myDialog.findViewById(R.id.cara_drink);

                dialog_foto.setImageResource(mData.get(vHolder.getAdapterPosition()).getFoto());
                dialog_jdl.setText(mData.get(vHolder.getAdapterPosition()).getJudul());
                dialog_dsc.setText(mData.get(vHolder.getAdapterPosition()).getDeskripsi());
                dialog_bhn.setText(mData.get(vHolder.getAdapterPosition()).getBahan());
                dialog_cr.setText(mData.get(vHolder.getAdapterPosition()).getCara());

                Toast.makeText(mContext,"Test"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvJudul.setText(mData.get(position).getJudul());
        holder.tvDeskripsi.setText(mData.get(position).getDeskripsi());
        holder.ivfoto.setImageResource(mData.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivfoto;
        private TextView tvJudul;
        private TextView tvDeskripsi;
        private TextView tvBahan;
        private TextView tvCara;
        private LinearLayout item_minuman;
        public MyViewHolder(View itemView) {
            super(itemView);
            item_minuman = (LinearLayout) itemView.findViewById(R.id.minuman_item_id);
            ivfoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);


        }
    }
}