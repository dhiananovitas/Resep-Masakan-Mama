package dhianadini.resep_masakan_mama.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import dhianadini.resep_masakan_mama.model.makanan;
import dhianadini.resep_masakan_mama.R;
/**
 * Created by LENOVO on 25/12/2018.
 */

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    ArrayList<makanan> makananlist;
    IMakananAdapter mIMakananAdapter;

    public MakananAdapter(Context context, ArrayList<makanan> minumenlist) {
        this.makananlist = makananlist;
        mIMakananAdapter = (IMakananAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_makanan, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        makanan makanan = makananlist.get(position);
        holder.tvJudul.setText(makanan.judul);
        holder.tvDeskripsi.setText(makanan.deskripsi);
        holder.ivfoto.setImageURI(Uri.parse(makanan.foto));
    }

    @Override
    public int getItemCount() {
        if (makananlist != null)
            return makananlist.size();
        return 0;
    }

    public interface IMakananAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivfoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivfoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mIMakananAdapter.doClick(getAdapterPosition());
                }
            });

        }
    }
}
