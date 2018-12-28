package dhianadini.resep_masakan_mama;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import dhianadini.resep_masakan_mama.model.makanan;
/**
 * Created by LENOVO on 25/12/2018.
 */

public class DetailActivityMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Your FAB click action here...
                Toast.makeText(getBaseContext(), "FAB Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        makanan makanan = (makanan) getIntent().getSerializableExtra(MainActivityMakanan.FOOD);
        setTitle(makanan.judul);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageURI(Uri.parse(makanan.foto));
        TextView tvDeskripsi = (TextView) findViewById(R.id.desc_food);
        tvDeskripsi.setText(makanan.deskripsi);
        TextView tvBahan = (TextView) findViewById(R.id.bahan_food);
        tvBahan.setText(makanan.bahan);
        TextView tvCara = (TextView) findViewById(R.id.cara_food);
        tvCara.setText(makanan.cara);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
