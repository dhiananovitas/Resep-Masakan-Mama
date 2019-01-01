package dhianadini.resep_masakan_mama;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
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
              " Untuk menambah kenikmatan dicampurkan pula sedikit jahe, garam, dan bubuk vanili.","2 keping gula merah\n" +
              "1 bungkus santan kara 65ml\n" +
              "1 sachet kental manis\n" +
              "1 ruas jahe, geprek\n" +
              "1 helai daun pandan, ikat simpul\n" +
              "800 ml air","Campur semua bahan dalam panci kmd rebus sampai mendidih sambil diaduk pelan agar santan tdk pecah. " +
              "Setelah mendidih matikan api. Tuang dalam gelas. Sajikan selagi panas",R.drawable.bajigur));
      lstDrink.add(new Drink("Jus Alpukat","Jus Alpukat adalah air buah alpukat yang diambil dari buah alpukat yang diblender. ",
              "1 bh buah alpukat mentega matang\n" +
                      "1 saset susu kental manis coklat\n" +
                      "1 saset milo\n" +
                      "secukupnya Es batu","Blender alpukat dg es batu sampai lembut\n" +
              "Siapkan gelas saji\n" +
              "Tuang bergantian susu kental manis, alpukat dan milo sampai gelas saji penuh\n" +
              "Siap tuk di nikmati",R.drawable.jusalpukat));
      lstDrink.add(new Drink("Jus Jambu","Buah jambu biji merah yang dibuat jus memiliki manfaat bagi kesehatan yang luar biasa berkat kandungan vitamin C berlimpah.n " +
              "Manfaat jus jambu biji merah adalah meningkatkan kekebalan tubuh, menurunkan kolesterol, menyembuhkan demam berdarah, menambah fertilitas, menyehatkan jantung, baik untuk diet dan ibu hamil.",
              "1/2 kg jambu biji merah yg udah matang\n" +
                      "2 sdm gula pasir\n" +
                      "1 sachet krimer\n" +
                      "1 sachet madurasa\n" +
                      "Syrup jambu (boleh skip)\n" +
                      "250 ml air matang","Campur semua bahan jadi satu\n" +
              "Dan di blender sampai lumat\n" +
              "Lalu saring jus nya supaya bijinya ga ikut tertelan\n" +
              "Tuang ke wadah...\n" +
              "Siap dikonsumsi",R.drawable.jusjambu));
      lstDrink.add(new Drink("Teh Tarik","Untuk menambah kenikmatan dicampurkan pula sedikit jahe, garam, dan bubuk vanili." +
              "Minuman ini biasanya dijual oleh para mamak di Malaysia dan Singapura, yang menjadikannya sebagai minuman nasional negara tersebut.",
              "800 ml Air\n" +
                      "2 sdm Teh Tubruk\n" +
                      "2 batang Kayu Manis\n" +
                      "10 sdm Susu Kental Manis\n" +
                      "4 sdm Gula Aren, iris tipis","Campurkan semua bahan kedalam panci. Aduk rata.\n" +
              "Panaskan dengan api kecil sedang sambil terus diaduk hingga mendidih dan warna susunya mulai kecoklatan. Tes rasa. Bila kurang manis tambahkan skm sesuai selera.\n" +
              "Matikan api lalu tuang kedalam gelas saji sambil disaring agar bubuk teh tidak ikut terbawa.\n" +
              "Sajikan hangat.",R.drawable.tehtarik));
      lstDrink.add(new Drink("Wedang Jahe","Wedang jahe adalah hidangan minuman sari jahe tradisional dari daerah Jawa Tengah dan Timur, Indonesia yang umumnya disajikan hangat atau panas." +
              " Wedang jahe juga kadang disebut sebagai teh jahe, meskipun sama sekali tidak mengandung daun teh."
              ,"3 sdm sirup jahe rempah\n" +
              "2 sdm madu\n" +
              "1 gelas Air panas","Seduh dengan air panas..sajikan..",R.drawable.wedangjahe));
      lstDrink.add(new Drink("Jus Stroberi","Stroberi adalah salah satu jenis buah-buahan yang mempunyai banyak penggemar. Stroberi mempunyai rasa yang sebagus dengan penampilannya. Selain itu buah ini juga mudah diolah " +
              "menjadi berbagai macam jenis olahan. Mulai dari untuk puding, bahan kue, es krim, hingga jus.",
              "300 gr strawberry\n" +
                      "1 1/2 cangkir air\n" +
                      "1 sachet SKM putih\n" +
                      "2 atau 3 sdm gula pasir, sesuai kebutuha","Cuci strawberry, lalu belah jd 4jk srtawberry nya besar. Masukkan k blender, tambahkan air dan SKM. Blender himgga halus.\n" +
              "Siap tuk disajikan. Boleh ditambah es batu kalau suka dingin. Selamat mencoba.",R.drawable.jusstrawberi));
      lstDrink.add(new Drink("Lemon Tea","Lemon tea membantu menghilangkan gejala flu. Ini juga meningkatkan sistem kekebalan tubuh dan membuat tubuh tetap hangat selama musim dingin. " +
              " Lemon tea menghilangkan racun dari dalam tubuh, memberi energi, menyegarkan pikiran, dan meningkatkan kesehatan mental. Inilah salah satu manfaat minum teh lemon.",
              "1 kantong teh\n" +
                      "800 ml Air\n" +
                      "7 sendok gula putih\n" +
                      "1 atau 1/2 buat lemoh sesuai selera","Rebus air, gula dan kantong tehnya. Mendidih angkat\n" +
              "Potong2 atau peras jeruk lemonnya. Kalau diperas asamnya lebih keluar.\n" +
              "Masukkan ke tehnya. Cek tingkat keasaman dan manisnya.\n" +
              "Enak disajikan dingin yaa. Taruh di kulkas.",R.drawable.lemontea));
    }


}