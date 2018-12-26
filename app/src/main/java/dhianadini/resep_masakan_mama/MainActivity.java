package dhianadini.resep_masakan_mama;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentDessert(),"Dessert");
        adapter.AddFragment(new FragmentDrink(),"Beverages");
        adapter.AddFragment(new FragmentFood(),"Food");

//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_cake);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_drink);
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_restaurant_black_24dp);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    //    ImageButton food, drink, cake;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        food = (ImageButton) findViewById(R.id.ImageButtonFood);
//        drink = (ImageButton) findViewById(R.id.ImageButtonDrink);
//        cake = (ImageButton) findViewById(R.id.ImageButtonCake);
//
//        View.OnClickListener listenerfood = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, MainActivityMakanan.class));
//                Toast.makeText(MainActivity.this,
//                        "Makanan telah dipilih",
//                        Toast.LENGTH_SHORT).show();
//            }
//        };
//        food.setOnClickListener(listenerfood);
//
//        View.OnClickListener listenerdrink = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, MainActivityMinuman.class));
//                Toast.makeText(MainActivity.this,
//                        "Minuman telah dipilih",
//                        Toast.LENGTH_SHORT).show();
//            }
//        };
//        drink.setOnClickListener(listenerdrink);
//
//
//        View.OnClickListener listenercake = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, MainActivityDessert.class));
//                Toast.makeText(MainActivity.this,
//                        "Dessert telah terpilih",
//                        Toast.LENGTH_SHORT).show();
//            }
//        };
//        cake.setOnClickListener(listenercake);
//    }
}
