package dhianadini.resep_masakan_mama;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

  private TabLayout tabLayout;
  private ViewPager viewPager;
  private ViewPagerAdapter adapter;
  private Button btn;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);



//    btn = (Button) findViewById(R.id.action_feedback);
    tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
    viewPager = (ViewPager) findViewById(R.id.viewpager_id);
    adapter = new ViewPagerAdapter(getSupportFragmentManager());

    adapter.AddFragment(new FragmentDessert(),"Dessert");
    adapter.AddFragment(new FragmentDrink(),"Beverages");
    adapter.AddFragment(new FragmentFood(),"Food");

    viewPager.setAdapter(adapter);
    tabLayout.setupWithViewPager(viewPager);

  }

//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//          // Inflate the menu; this adds items to the action bar if it is present.
//          getMenuInflater().inflate(R.menu.menu_detail, menu);
//          return true;
//        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
          // Handle action bar item clicks here. The action bar will
          // automatically handle clicks on the Home/Up button, so long
          // as you specify a parent activity in AndroidManifest.xml.
          int id = item.getItemId();

          //noinspection SimplifiableIfStatement
          if (id == R.id.action_feedback) {
            doClick();

            Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
            return true;
          }

          return super.onOptionsItemSelected(item);
        }

        public void doClick(){
          Intent intent = new Intent(Intent.ACTION_MAIN);
          intent.setComponent(new ComponentName("dhianadini.feedbackresep","dhianadini.feedbackresep.Feedback"));
          startActivity(intent);

        }


}