package dhianadini.resep_masakan_mama;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import dhianadini.resep_masakan_mama.adapter.MakananAdapter;
import dhianadini.resep_masakan_mama.model.makanan;
/**
 * Created by LENOVO on 25/12/2018.
 */

public class MainActivityMakanan extends AppCompatActivity implements MakananAdapter.IMakananAdapter {


    public static final String FOOD = "makanan";
    ArrayList<makanan> mlist = new ArrayList<>();
    MakananAdapter madapter;

    ArrayList<makanan> mListAll = new ArrayList<>();
    boolean isFiltered;
    ArrayList<Integer> mListMapFilter = new ArrayList<>();
    String mQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_makanan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewFood);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        madapter = new MakananAdapter(this, mlist);
        recyclerView.setAdapter(madapter);

        fillData();

        setTitle("Makanan");
    }

    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.makanan);
        String[] arDeskripsi = resources.getStringArray(R.array.desc_makanan);
        String[] arBahan = resources.getStringArray(R.array.bahan_makanan);
        String[] arCara = resources.getStringArray(R.array.cara_makanan);
        TypedArray a = resources.obtainTypedArray(R.array.picture_makanan);
        String[] arFoto = new String[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            int id = a.getResourceId(i, 0);
            arFoto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mlist.add(new makanan(arJudul[i], arDeskripsi[i], arBahan[i], arCara[i], arFoto[i]));
        }
        madapter.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailActivityMakanan.class);
        intent.putExtra(FOOD, mlist.get(pos));
        startActivity(intent);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//
//        MenuItem searchItem = menu.findItem(R.id.action_search);
//        SearchView serView = (SearchView)
//                MenuItemCompat.getActionView(searchItem);
//
//        serView.setOnQueryTextListener(
//                new SearchView.OnQueryTextListener() {
//                    @Override
//                    public boolean onQueryTextSubmit(String query) {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean onQueryTextChange(String newText) {
//                        mQuery = newText.toLowerCase();
//                        doFilter(mQuery);
//                        return true;
//                    }
//                }
//        );
//        return true;
//    }

    private void doFilter(String query) {
        if (!isFiltered) {
            mListAll.clear();
            mListAll.addAll(mlist);
            isFiltered = true;
        }

        mlist.clear();
        if (query == null || query.isEmpty()) {
            mlist.addAll(mListAll);
            isFiltered = false;
        } else {
            mListMapFilter.clear();
            for (int i = 0; i < mListAll.size(); i++) {
                makanan makanan = mListAll.get(i);
                if (makanan.judul.toLowerCase().contains(query) ||
                        makanan.deskripsi.toLowerCase().contains(query) ||
                        makanan.cara.toLowerCase().contains(query)) {
                    mlist.add(makanan);
                    mListMapFilter.add(i);
                }
            }
        }
        madapter.notifyDataSetChanged();
    }

}
