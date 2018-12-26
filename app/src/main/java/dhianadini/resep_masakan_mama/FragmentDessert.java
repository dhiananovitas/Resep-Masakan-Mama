package dhianadini.resep_masakan_mama;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import dhianadini.resep_masakan_mama.DessertAdapter;
import dhianadini.resep_masakan_mama.model.dessert;

/**
 * Created by LENOVO on 25/12/2018.
 */

public class FragmentDessert extends Fragment{
    View v;
    private RecyclerView recyclerView;
    private List<Dessert> lstDessert;

    public FragmentDessert(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_dessert,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.dessert_recview);
        DessertAdapter dessertAdapter = new DessertAdapter(getContext(),lstDessert);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(dessertAdapter);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstDessert = new ArrayList<>();

        lstDessert.add(new Dessert("Es Teler","Es teler adalah koktail buah asli Indonesia." +
                " Alpukat, kelapa muda, cincau, nangka, dan buah-buahan lainnya disajikan dengan santan," +
                " susu kental manis, daun Pandanus amaryllifolius (biasanya dalam bentuk sirup rasa" +
                " kelapa dan pandan), gula, dan sedikit garam","","",R.drawable.esteler));
        lstDessert.add(new Dessert("Donat","Donat (doughnut atau donut dalam bahasa Inggris) " +
                "adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur dan mentega",
                "","",R.drawable.donat));
        lstDessert.add(new Dessert("Es Buah","Es buah atau sop buah merupakan salah satu minuman " +
                "nikmat yang terbuat dari bermacam-macam buah yang kaya akan vitamin",
                "","",R.drawable.esbuah));
        lstDessert.add(new Dessert("Es Krim","Es krim adalah sebuah makanan beku dibuat dari produk " +
                "susu seperti krim (atau sejenisnya), digabungkan dengan perasa dan pemanis",
                "","",R.drawable.eskrim));
        lstDessert.add(new Dessert("Es Teler","Es teler adalah koktail buah asli Indonesia." +
                " Alpukat, kelapa muda, cincau, nangka, dan buah-buahan lainnya disajikan dengan santan," +
                " susu kental manis, daun Pandanus amaryllifolius (biasanya dalam bentuk sirup rasa" +
                " kelapa dan pandan), gula, dan sedikit garam","","",R.drawable.esteler));
        lstDessert.add(new Dessert("Donat","Donat (doughnut atau donut dalam bahasa Inggris) " +
                "adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur dan mentega",
                "","",R.drawable.donat));
        lstDessert.add(new Dessert("Es Buah","Es buah atau sop buah merupakan salah satu minuman " +
                "nikmat yang terbuat dari bermacam-macam buah yang kaya akan vitamin",
                "","",R.drawable.esbuah));
        lstDessert.add(new Dessert("Es Krim","Es krim adalah sebuah makanan beku dibuat dari produk " +
                "susu seperti krim (atau sejenisnya), digabungkan dengan perasa dan pemanis",
                "","",R.drawable.eskrim));
    }



}
