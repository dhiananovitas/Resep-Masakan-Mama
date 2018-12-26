package dhianadini.resep_masakan_mama;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import dhianadini.resep_masakan_mama.model.dessert;

/**
 * Created by LENOVO on 25/12/2018.
 */

public class DetailActivityDessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dessert);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        dessert dessert = (dessert) getIntent().getSerializableExtra(MainActivityDessert.CAKE);
        setTitle(dessert.judul);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageURI(Uri.parse(dessert.foto));
        TextView tvDeskripsi = (TextView) findViewById(R.id.desc_cake);
        tvDeskripsi.setText(dessert.deskripsi);
        TextView tvBahan = (TextView) findViewById(R.id.bahan_cake);
        tvBahan.setText(dessert.bahan);
        TextView tvCara = (TextView) findViewById(R.id.cara_cake);
        tvCara.setText(dessert.cara);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
