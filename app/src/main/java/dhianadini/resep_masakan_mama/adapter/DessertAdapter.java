package dhianadini.resep_masakan_mama.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import dhianadini.resep_masakan_mama.Dessert;
import dhianadini.resep_masakan_mama.model.dessert;
import dhianadini.resep_masakan_mama.R;

/**
 * Created by LENOVO on 25/12/2018.
 */

public class DessertAdapter extends RecyclerView.Adapter<DessertAdapter.ViewHolder> {
   List<Dessert> dessertlist;
    ICakeAdapter mICakeAdapter;

    public DessertAdapter(Context context, List<Dessert> dessertlist) {
        this.dessertlist = dessertlist;
        mICakeAdapter = (ICakeAdapter) context;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_dessert, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dessert dessert = dessertlist.get(position);
        holder.tvJudul.setText(dessert.judul);
        holder.tvDeskripsi.setText(dessert.deskripsi);
        holder.ivfoto.setImageResource(dessert.foto);
    }

    @Override
    public int getItemCount() {
        if (dessertlist != null)
            return dessertlist.size();
        return 0;
    }

    public interface ICakeAdapter {
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
                    mICakeAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }
}
