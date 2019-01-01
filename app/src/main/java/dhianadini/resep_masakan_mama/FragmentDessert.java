package dhianadini.resep_masakan_mama;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by LENOVO on 25/12/2018.
 */

public class FragmentDessert extends Fragment{
  View v;
  private RecyclerView recyclerView;
  private List<Dessert> lstDessert;
  String mQuery;

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
  public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    inflater.inflate(R.menu.menu_main,menu);
    super.onCreateOptionsMenu(menu, inflater);
  }


  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    lstDessert = new ArrayList<>();

    lstDessert.add(new Dessert("Es Teler","Es teler adalah koktail buah asli Indonesia." +
            " Alpukat, kelapa muda, cincau, nangka, dan buah-buahan lainnya disajikan dengan santan," +
            " susu kental manis, daun Pandanus amaryllifolius (biasanya dalam bentuk sirup rasa" +
            " kelapa dan pandan), gula, dan sedikit garam","Avokad\n" +
            "Nangka\n" +
            "Kelapa muda\n" +
            "Es batu\n" +
            "Santan cair\n" +
            "1 lembar daun pandan\n" +
            "skm","Didihkan santan cair dengan daun pandan.\n" +
            "\n" +
            "  \n" +
            "Potong2 buah. Masukkan ke dalam mangkok. Tambahkan es batu dan skm. " +
            "Masukkan santan.klo dirasa kurang manis,silahkan tambah gula cair.." +
            "cocok bgt dah di cuaca yg panassss..",R.drawable.esteler));
    lstDessert.add(new Dessert("Donat","Donat (doughnut atau donut dalam bahasa Inggris) " +
            "adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur dan mentega",
            "500 g tepung terigu\n" +
                    "100 g gula pasir)\n" +
                    "11 g ragi instan\n" +
                    "3 butir telur\n" +
                    "30 g susu bubuk\n" +
                    "250 ml air\n" +
                    "100 g margarin\n" +
                    "1/4 sdt garam","Campur tepung terigu, ragi instan, kuning telur, susu bubuk, dan air. Aduk sampai tercampur rata. Tambahkan margarin dan garam, aduk dan uleni hingga adonan kalis. Bulatkan adonan, lalu diamkan selama 25 menit\n" +
            "\n" +
            "  \n" +
            "Ketika sudah mengembang, giling adonan, lalu cetak. Diamkan selama 15 menit. Goreng donat hingga matang, angkat, tiriskan.\n" +
            "\n" +
            "  \n" +
            "Ketika sudang agak dingin, taburi dengan gula halus. Bisa di ganti dengan toping lain",R.drawable.donat));
    lstDessert.add(new Dessert("Es Buah","Es buah atau sop buah merupakan salah satu minuman " +
            "nikmat yang terbuat dari bermacam-macam buah yang kaya akan vitamin",
            "1 buah alpukat di kerok\n" +
                    "1 Buah naga potong2\n" +
                    "1/4 buah melon kerok boleh dipotong2 boleh\n" +
                    "1 buah Apel di potong dadu\n" +
                    "Kelapa saya beli di tukang es kelapa sengaja pakai gula putih\n" +
                    "Agar2 swalow warna merah\n" +
                    "8 buah anggur masing2 belah 2\n" +
                    "Nangka potong dadu kecil2, supaya wanginya nanti keluar\n" +
                    "secukupnya Susu kental manis\n" +
                    "secukupnya Gula pasir yang sudah dicairkan\n" +
                    "Es batu","Siapkan wadah,campur gula cair dan susu kental manis aduk2, tambahkan es batu.\n" +
            "Masukan semua buah2an yg sudah di kerok dan dipotong2 kedalam campuran gula dan susu,, es buah siap dinikmati. Happy cooking",R.drawable.esbuah));
    lstDessert.add(new Dessert("Es Krim","Es krim adalah sebuah makanan beku dibuat dari produk " +
            "susu seperti krim (atau sejenisnya), digabungkan dengan perasa dan pemanis",
            "600 ml air\n" +
                    "3 sachet Kental manis\n" +
                    "3 sdm maizena\n" +
                    "5 sdm gula pasir\n" +
                    "1 sdt SP/Ovalet di tim","Masukkan semua bahan ke dalam panci kecuali SP/Ovalet\n" +
            "Aduk hingga rata dan tidak ada gerindil\n" +
            "Gunakan api kecil sambil terus diaduk2 hingga meletup2.\n" +
            "Angkat dan biarkan uap panas berkurang lalu masukkan ke dalam mangkuk. Setelah suhu ruang tutup rapat dan masukkan ke dalam freezer 10 jam\n" +
            "Kerok adonan yang telah beku lalu masukkan SP/Ovalet yang telah ditim.\n" +
            "Mixer dengan kecapatan tinggi 10-15 menit hingga ringan. Ma\n" +
            "Masukkan lagi ke dalam freezer\n" +
            "Siap dihidangkan",R.drawable.eskrim));
    lstDessert.add(new Dessert("Pancake","Panekuk adalah kue dadar yang dibuat dari terigu" +
            " telur ayam, gula dan susu." +
            " Bahan-bahan dicampur dengan air membentuk adonan kental yang digoreng di atas wajan datar yang diolesi sedikit minyak." +
            " Setelah matang, panekuk bisa dihidangkan sewaktu masih hangat atau setelah dingin","7 sdm munjung terigu segitiga\n" +
            "1 butir telur\n" +
            "1 sdm gula\n" +
            "2 sdm susu bubuk\n" +
            "3 sdm mentega\n" +
            "Sejumput garam\n" +
            "1 sdt baking soda\n" +
            "3/4 gelas air (bisa dikurangi atau ditambah kan)\n" +
            "3 tetes pasta strawberry\n" +
            "Topping : suka-suka\n" +
            "Meses","Didihkan air. Dalam wadah. Campur terigu, mentega, garam, susu, gula, baking soda. Masukkan air yang sudah matang kedalam wadah tadi dan pasta strawberry. " +
            "Aduk rata dengan whisk. (Untuk air beri sedikit demi sedikit. Lihat adonan. Jangan sampai terlalu kental atau encer. " +
            "Jika sudah pas dan agak berbuih/ bergelembung. Sisihkan.\n" +
            "\n" +
            "  \n" +
            "Siapkan teflon. Jika sudah panas. Tuang satu sendok adonan pancake. Jika sudah terlihat berongga dan bagian bawah " +
            "kecoklatan balik. Jangan sampai gosong. Lakukan sampai adonan habis. Pancake strawberry siap dihidangkan dengan topping " +
            "meses dan SKM.",R.drawable.pancake));
    lstDessert.add(new Dessert("Es Pisang Ijo","Setelah matang, panekuk bisa dihidangkan sewaktu masih hangat atau setelah dingin " +
            "Makanan ini terbuat dari bahan utama pisang yang dibalut dengan adonan tepung berwarna hijau.",
            "Bahan kulit :\n" +
                    "260 ml Santan instant\n" +
                    "260 ml Air\n" +
                    "200 gr Tepung beras\n" +
                    "50 gr Gula pasir\n" +
                    "1/2 sdt Garam\n" +
                    "3 tetes pewarna hijau\n" +
                    "Bahan bubur:\n" +
                    "750 ml Santan encer\n" +
                    "65 gr Tepung beras\n" +
                    "150 gr Gula pasir\n" +
                    "1/2 sdt Garam\n" +
                    "2 lbr Daun pandan\n" +
                    "Bahan lainnya :\n" +
                    "Pisang raja\n" +
                    "Sirup\n" +
                    "serut Es\n" +
                    "Susu kental manis","Campur semua bahan kulit, masak diatas api kecil sambil terus diaduk sampai kalis. Biarkan suhu ruang\n" +
            "Pipihkan adonan diatas daun pisang, beri pisang yang sudah dikukus sebelumnya, gulung sampai pisang tertutup. Lakukan sampai habis\n" +
            "Kukus adonan pisang ±15menit sampai matang. Biarkan suhu ruang, lalu potong2\n" +
            "Campur bahan bubur, aduk hingga rata dan masak diatas api kecil sampai mengental. Matikan\n" +
            "Cara penyajian: Taruh dalam mangkuk, pisang ijo yang sudah dipotong, bubur, beri es serut dan sirup cocopandan.",R.drawable.pisangijo));
    lstDessert.add(new Dessert("Es Durian","Es duren memang selalu menjadi favorit. Meskipun baunya menyengat, " +
            "tapi fakta-nya banyak orang selalu menyukai duren sebagai buah yang disebut paling enak.",
            "20-25 biji duren (pisahkan dr bijinya)\n" +
                    "65 ml santan (1 bungkus kecil kara)\n" +
                    "2 sdm maizena (larutkan dgn sedikit air)\n" +
                    "3-4 sachet SKM\n" +
                    "Secukupnya garam","Didihkan semua bahan, kecuali larutan maizena, cek rasa, jika kurang manis bisa tambahkan SKM atau gula sesuai selera\n" +
            "Tuangkan maizena sambil diaduk-aduk agar tdk menggumpal, masak hingga meletup-letup, matikan api\n" +
            "Dinginkan, tuang kedalam wadah/cup eskrim\n" +
            "Bekukan dalam freezer kurang lebih seharian, siap dinikmati",R.drawable.esdurian));
    lstDessert.add(new Dessert("Angsle","Angsle atau wedang angsle adalah minuman khas Jawa Timur yang menyerupai kolak. " +
            "Penjual angsle tradisional dulu berkeliling kampung hanya pada malam hari, " +
            "karena angsle yang hangat pas disajikan saat malam hari atau saat hujan.",
            "100 gr kacang hijau\n" +
                    "1/2 bungkus bubur sagu mutiara\n" +
                    "5 lembar roti tawar potong2 sesuka hati\n" +
                    "2 lembar daun pandan\n" +
                    "2 bungkus santan (kara ato cocomax)\n" +
                    "700 ml air (utk sagu mutiara)\n" +
                    "500-600 ml utk santan\n" +
                    "Seruas jahe potong2\n" +
                    "Gula\n" +
                    "2 sdm maizena\n" +
                    "Garam\n" +
                    "Vanili\n" +
                    "3-4 sdm gula merah (brown sugar)","Masak 1/2 kemasan bubur sagu mutiara hingga bening, lalu masukkan gula aduk rata lalu angkat\n" +
            "\n" +

            "Masak kacang hijau hingga mekar dan empuk, beri gula pasir 2sdm dan gula merah 3-4 sdm aduk rata lalu msukkan maizena yg sdh terlebih dulu di larutan dlm air, aduk hingga mengental....lalu angkat\n" +

            "  \n" +
            "Potong2 roti kotak2 sisihkan dlm wadah tepak\n" +
            "  \n" +
            "Masak santan dg air 600-700ml, masukkan swjumput garam, 2sdm gula ato sesuai selera, masukkan irisan jahe dan daun pandan lalu masak smpe matang\n" +
            "\n" +
            "  \n" +
            "Lalu siram dg santan yg msh panas ato hangat td\n" +
            "  \n" +
            "Tata dlm mangkok bahan2 yg mateng td\n" +
            "  \n" +
            "Angse siap disantap",R.drawable.angsle));

    setHasOptionsMenu(true);


  }


}