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
            "Marinasi selama 15 menit. Campur semua bahan tepung bumbu dan aduk hingga rata.","5 buah cabe merah\n" +
            "3 buah cabe hijau\n" +
            "3 buah cabe rawit merah\n" +
            "1 lembar daun jeruk\n" +
            "1 batang sereh\n" +
            "3 cm lengkuas geprek\n" +
            "1 lembar daun salam\n" +
            "1/2 buah tomat\n" +
            "1 batan daun bawang\n" +
            "secukupnya Daun kemangi\n" +
            "secukupnya Gula, garam, merica, kaldu jamur\n" +
            "5 potong ayam\n" +
            "secukupnya Air jeruk nipis","Cuci bersih ayam, kemudian lumuri dengan air jeruk nipis dan garam, diamkan 30 menit.\n" +
            "\n" +
            "Didihkan air, masukkan ayam kurang lebih 10 menit dengan api besar untuk membuang kotoran. Setelah itu tiriskan.\n" +
            "\n" +
            "Panaskan sedikit minyak, kemudian tumis bawang yang sudah diiris hingga harum, masukkan cabe yang sudah diiris juga (boleh juga diulek kasar), masukkan daun " +
            "bawang,daun salam, daun jeruk, sereh, lengkuas, tomat, tumis hingga bumbu layu dan matang. Goreng ayam hingga matang.\n" +
            "\n" +
            "  \n" +
            "Masukkan ayam, beri sedikit.air, gula, garam, merica, kaldu jamur,dan daun kemanhi masak hingga kuah meresap " +
            "dan daun kemangi matang. Cicipi sebelum disajikan. Selamat mencoba.",R.drawable.ayampedas));
    lstFood.add(new Food("Ayam Penyet","Meski keduanya adalah hidangan ayam goreng dan sama sama diberi " +
            "sambal, ayam geprek dan penyet adalah dua hidangan yang berbeda. ","1 buah ayam goreng\n" +
            "Bahan sambal\n" +
            "6 buah cabe merah\n" +
            "3 buah cabe rawit\n" +
            "3 siung bawang merah\n" +
            "1 buah tomat\n" +
            "1/2 saset terasi abc\n" +
            "Sejumput garam\n" +
            "1 sdt gula pasir","Goreng ayamnya dulu\n" +
            "  \n" +
            "Lalu bikin sambal penyetnya goreng sebentar bahan sambal lalu ulek sambil di koreksi rasa setelah ok masukan ayam nya lalu penyet di atas sambalnya\n" +
            "  \n" +
            "Sajikan dengan nasi hangat",R.drawable.ayampenyet));
    lstFood.add(new Food("Bakso","Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. " +
            "Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada " +
            "juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.","Bahan bakso\n" +
            "1/2 kg Daging sapi\n" +
            "250 gram tepung tapioka\n" +
            "1 butir telur\n" +
            "8 siung Bawang putih\n" +
            "4 Sdm Bawang merah goreng\n" +
            "1 bungkus Ladaku\n" +
            "secukupnya Garam\n" +
            "Kaldu bubuk\n" +
            "secukupnya Es batu\n" +
            "1 batang bawang daun\n" +
            "Bahan kuah\n" +
            "250 gram Iga sapi\n" +
            "Bawang merah\n" +
            "Bawang putih\n" +
            "Lada\n" +
            "Pala\n" +
            "Daun bawang (rajang kasar)","Giling daging sapi hingga halus dgn choper saat menggiling tmbh batu es yg sdh di hancurkan, stlh halus masukan bumbu yg sdh di haluskan terlebih dahulu (bawang putih, bawang goreng, ladaku,garam, kaldu bubuk dan daun bawang) tambah telur lalu giling lagi dgn choper, stlh tercampur rata masukan tepung tapioka giling lagi sampek bner2 tercampur rata.\n" +
            "Panas kan air, buat bulatan2 bakso td lalu rebus klw sudah mengambang angkat pindahkan ke air es\n" +
            "Rebus iga sapi lalu buang rebusan pertama, rebus lagi iga untuk mengambil kalduny rebus sampai iga empuk (pakek presto sgt di sarankan untuk menghemat waktu)\n" +
            "Haluskan bawang merah bawang putih pala dan lada stlh it tumis bumbu sampai harum masukan daun bawang tumis sampai bumbu benar2 harum stlh itu tuang bumbu ke kaldu iga tadi, tambah kan garam dan kaldu bubuk stlh it masukan bola bakso\n" +
            "Bakso home made siap di hidangkan dgn suun, sayuran (kol atau sawi) tahu jg seledri dan bawang goreng",R.drawable.bakso));
    lstFood.add(new Food("Capcay","Capcai (pinyin: zasui) adalah dialek Hokkian yang berarti harfiah “aneka ragam sayur”." +
            "Pengertian lainnya mengenai capcay adalah masakan sederhana yang terdiri dari aneka sayuran dipotong kecil-kecil " +
            "dan kadangkala dimasak dengan baso ikan, baso sapi, udang, dan daging ayam.","10 butir bakso\n" +
            "2 Wortel\n" +
            "4 jagung muda\n" +
            "1 brokoli\n" +
            "1 butir telur\n" +
            "1 sdm maizena, larutkan\n" +
            "1 sdm saos tiram\n" +
            "3 siung bawang putih\n" +
            "1/2 siung bawang bombay iris tipis\n" +
            "Gula garam\n" +
            "Merica","Potong2 sayuran dan bakso\n" +
            "Tumis bawang putih geprek bersama bawang bombay hingga harum\n" +
            "Tambahkan telur dan sedikit air, aduk2, tambahkan bakso, kemudian sayuran\n" +
            "Setelah sayyran agak matang, masukkan saos tiram,merica dan gula garam secukupnya\n" +
            "Masukkan larutan maizena,aduk2 hingga mengental\n" +
            "Koreksi rasa, siap disajikan",R.drawable.capcayjamur));
    lstFood.add(new Food("Mie Pedas","Mi (atau juga sering ditulis mie) adalah adonan tipis dan panjang yang telah digulung, " +
            "dikeringkan, dan dimasak dalam air mendidih. Istilah ini juga merujuk kepada mi kering " +
            "yang harus dimasak kembali dengan dicelupkan dalam air.","2 siung bawang putih, iris\n" +
            "3 siung bawang merah, iris\n" +
            "2 keping mi kering\n" +
            "4 buah cabai rawit merah, iris\n" +
            "1 buah telur ayam\n" +
            "1 batang daun bawang, iris\n" +
            "1 sdt garam\n" +
            "1/2 sdt merica\n" +
            "1/2 sdt kaldu sapi bubuk non MSG\n" +
            "Secukupnya kecap manis\n" +
            "Secukupnya kecap asin\n" +
            "Secukupnya saos tiram\n" +
            "2 sdm mentega","Rebus mi terlebih dahulu. Lalu tiriskan. Sisihkan.\n" +
            "Tumis bawang merah dan bawang putih hingga harum, lalu masukkan cabe. Masukkan telur dan aduk2 hingga telur pecah. Setelah telur matang, masukkan mi dan daun bawang. Aduk. Tambahkan bumbu2. Masukkan kecapnya sesuai selera. Diamkan sebentar di atas api sedang sambil terus diaduk. Biar dapat mi warna coklat. Setelah matang dan pas rasanya, angkat, taburi dengan bawang goreng dan sajikan hangat.\n" +
            "Sajikan bersama kerupuk pedas dan timun dingin (masukkan ke dalam kulkas " +
            "selama beberapa menit). Selamat menikmati ",R.drawable.miepedas));
    lstFood.add(new Food("Nasi Uduk","Nasi uduk adalah nama sejenis makanan terbuat dari bahan dasar nasi putih" +
            " yang diaron dan dikukus dengan santan dari kelapa yang di parut, " +
            "serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica. " +
            "Makanan ini kemudian dihidangkan dengan emping goreng, tahu goreng, telur dadar/telur goreng yang sudah diiris-iris, " +
            "abon, kering tempe, bawang goreng, ayam goreng, timun dan sambal dari kacang. " +
            "Makanan ini biasanya lebih sering dijual di pagi hari untuk sarapan dan malam hari untuk makan malam." +
            "Pada malam hari,biasanya nasi uduk dijual di warung pecel lele, yaitu warung yang menjual nasi uduk beserta lauknya, " +
            "seperti lele, ikan mas, ayam bakar dan goreng, dan lain lain.","1/2 rantang beras\n" +
            "4 bungkus santan kara\n" +
            "1 batang sere\n" +
            "2 lembar daun salam\n" +
            "2 lembar daun pandan\n" +
            "1/2 sdt garam\n" +
            "1/2 sdt kaldu jamur","Cuci beras sampai bersih\n" +
            "\n" +
            "Panaskan santan hingga mendidih\n" +
            "\n" +
            "Tuangkan santan dan beras ke rice cooker\n" +
            "\n" +
            "Tambahkan garam dan kaldu jamur,masukan daun salam,sere dan pandan\n" +
            "\n" +
            "Masak di rice cooker sampai matang",R.drawable.nasiuduk));
    lstFood.add(new Food("Soto Ayam","Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia" +
            "seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering " +
            "digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing.","1/2 ekor ayam kampung potong sesuai selera\n" +
            "1000 ml air/ sesuai selera\n" +
            "4 lbr daun jeruk\n" +
            "2 btg sereh digeprek\n" +
            "Secukupnya Garam & gula\n" +
            "Secukupnya Bawang goreng\n" +
            "1 batang daun bawang, potong\n" +
            "Tauge seduh\n" +
            "Kol iris tipis\n" +
            "Soun\n" +
            "Kentang potong tipis2 lalu goreng\n" +
            "Bumbu halus:\n" +
            "6 siung bawang putih\n" +
            "4 siung bawang merah\n" +
            "Seruas kunyit\n" +
            "1/2 sdt merica/ lada bubuk","Dlm panci rebus air sampai mendidih setelah itu masukkan ayam. Masak sampai ayam mengeluarkan kaldu dan empuk.\n" +
            "Tumis bumbu halus beserta sereh, daun jeruk sampai harum dan matang. Matikan api.\n" +
            "Masukkan tumisan bumbu kedalam air rebusan ayam tambahkan garam, gula secukupnya. Masak sampai mendidih. Angkat ayam & tiriskan. Kemudian goreng ayam sampai kecoklatan dan suwir2 ayam.\n" +
            "Penyajiannya : di mangkok tata soun, tauge, kol, ayam suwir, daun bawang, dan bawang goreng siram dg kuah soto panas. Sajikan dgn sambal & kerupuk.",R.drawable.soto));
  }


}