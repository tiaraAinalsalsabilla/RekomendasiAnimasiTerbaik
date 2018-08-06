package com.tiara.kumpulanrekomendasianimasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by idn on 1/27/2017.
 */

public class Detail extends AppCompatActivity {
    ImageView img;
    TextView txt1;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView img = (ImageView) findViewById(R.id.imageview);
        TextView txt1 = (TextView) findViewById(R.id.textview);
        TextView txt2 = (TextView) findViewById(R.id.isi);
        //get data dari list
        Intent a = getIntent();
        String nama = a.getStringExtra("nama");
        int image = a.getIntExtra("gambar", 0);
        String isi = a.getStringExtra("isi");


        img.setImageResource(image);
        txt1.setText(nama);
        txt2.setText(getString(Integer.parseInt(isi)));
    }
}
