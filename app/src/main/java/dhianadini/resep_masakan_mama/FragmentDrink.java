package dhianadini.resep_masakan_mama;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 26/12/2018.
 */

public class FragmentDrink extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<Drink> lstDrink;

    public FragmentDrink(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      v = inflater.inflate(R.layout.fragment_drink,container,false);
      recyclerView = (RecyclerView) v.findViewById(R.id.drink_recview);
      DrinkAdapter drinkAdapter = new DrinkAdapter(getContext(),lstDrink);
      recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
      recyclerView.setAdapter(drinkAdapter);
      return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      lstDrink = new ArrayList<>();

      lstDrink.add(new Drink("Bajigur","Bajigur adalah minuman tradisional khas masyarakat Sunda dari daerah Jawa Barat, Indonesia." +
              " Bahan utamanya adalah gula aren dan santan. " +
              " Untuk menambah kenikmatan dicampurkan pula sedikit jahe, garam, dan bubuk vanili.","","",R.drawable.bajigur));
      lstDrink.add(new Drink("Jus Alpukat","Jus Alpukat adalah air buah alpukat yang diambil dari buah alpukat yang diblender. ",
              "","",R.drawable.jusalpukat));
      lstDrink.add(new Drink("Jus Jambu","Buah jambu biji merah yang dibuat jus memiliki manfaat bagi kesehatan yang luar biasa berkat kandungan vitamin C berlimpah.n " +
              "Manfaat jus jambu biji merah adalah meningkatkan kekebalan tubuh, menurunkan kolesterol, menyembuhkan demam berdarah, menambah fertilitas, menyehatkan jantung, baik untuk diet dan ibu hamil.",
              "","",R.drawable.jusjambu));
      lstDrink.add(new Drink("Teh Tarik","Untuk menambah kenikmatan dicampurkan pula sedikit jahe, garam, dan bubuk vanili." +
              "Minuman ini biasanya dijual oleh para mamak di Malaysia dan Singapura, yang menjadikannya sebagai minuman nasional negara tersebut.",
              "","",R.drawable.tehtarik));
      lstDrink.add(new Drink("Wedang Jahe","Wedang jahe adalah hidangan minuman sari jahe tradisional dari daerah Jawa Tengah dan Timur, Indonesia yang umumnya disajikan hangat atau panas." +
              " Wedang jahe juga kadang disebut sebagai teh jahe, meskipun sama sekali tidak mengandung daun teh."
              ,"","",R.drawable.wedangjahe));
      lstDrink.add(new Drink("Jus Stroberi","Stroberi adalah salah satu jenis buah-buahan yang mempunyai banyak penggemar. Stroberi mempunyai rasa yang sebagus dengan penampilannya. Selain itu buah ini juga mudah diolah " +
              "menjadi berbagai macam jenis olahan. Mulai dari untuk puding, bahan kue, es krim, hingga jus.",
              "","",R.drawable.jusstrawberi));
      lstDrink.add(new Drink("Lemon Tea","Lemon tea membantu menghilangkan gejala flu. Ini juga meningkatkan sistem kekebalan tubuh dan membuat tubuh tetap hangat selama musim dingin. " +
              " Lemon tea menghilangkan racun dari dalam tubuh, memberi energi, menyegarkan pikiran, dan meningkatkan kesehatan mental. Inilah salah satu manfaat minum teh lemon.",
              "","",R.drawable.lemontea));
    }
}