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

public class FragmentFood extends Fragment {
  View v;
  private RecyclerView recyclerView;
  private List<Food> lstFood;

  public FragmentFood(){

  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    v = inflater.inflate(R.layout.fragment_food,container,false);
    recyclerView = (RecyclerView) v.findViewById(R.id.food_recview);
    FoodAdapter foodAdapter = new FoodAdapter(getContext(),lstFood);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    recyclerView.setAdapter(foodAdapter);
    return v;

  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    lstFood = new ArrayList<>();

    lstFood.add(new Food("Ayam Pedas","Cara membuat: Lumuri ayam dengan air perasan jeruk nipis, garam, bawang putih dan lada. " +
            "Marinasi selama 15 menit. Campur semua bahan tepung bumbu dan aduk hingga rata.","","",R.drawable.ayampedas));
    lstFood.add(new Food("Ayam Penyet","Meski keduanya adalah hidangan ayam goreng dan sama sama diberi " +
            "sambal, ayam geprek dan penyet adalah dua hidangan yang berbeda. ","","",R.drawable.ayampenyet));
    lstFood.add(new Food("Bakso","Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. " +
            "Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada " +
            "juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.","","",R.drawable.bakso));
    lstFood.add(new Food("Capcay","Capcai (pinyin: zasui) adalah dialek Hokkian yang berarti harfiah “aneka ragam sayur”." +
            "Pengertian lainnya mengenai capcay adalah masakan sederhana yang terdiri dari aneka sayuran dipotong kecil-kecil " +
            "dan kadangkala dimasak dengan baso ikan, baso sapi, udang, dan daging ayam.","","",R.drawable.capcayjamur));
    lstFood.add(new Food("Mie Pedas","Mi (atau juga sering ditulis mie) adalah adonan tipis dan panjang yang telah digulung, " +
            "dikeringkan, dan dimasak dalam air mendidih. Istilah ini juga merujuk kepada mi kering " +
            "yang harus dimasak kembali dengan dicelupkan dalam air.","","",R.drawable.miepedas));
    lstFood.add(new Food("Nasi Uduk","Nasi uduk adalah nama sejenis makanan terbuat dari bahan dasar nasi putih" +
            " yang diaron dan dikukus dengan santan dari kelapa yang di parut, " +
            "serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica. " +
            "Makanan ini kemudian dihidangkan dengan emping goreng, tahu goreng, telur dadar/telur goreng yang sudah diiris-iris, " +
            "abon, kering tempe, bawang goreng, ayam goreng, timun dan sambal dari kacang. " +
            "Makanan ini biasanya lebih sering dijual di pagi hari untuk sarapan dan malam hari untuk makan malam." +
            "Pada malam hari,biasanya nasi uduk dijual di warung pecel lele, yaitu warung yang menjual nasi uduk beserta lauknya, " +
            "seperti lele, ikan mas, ayam bakar dan goreng, dan lain lain.","","",R.drawable.nasiuduk));
    lstFood.add(new Food("Soto","Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia" +
            "seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering " +
            "digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing.","","",R.drawable.soto));
  }
}