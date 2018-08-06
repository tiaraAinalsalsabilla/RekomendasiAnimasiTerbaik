package com.tiara.kumpulanrekomendasianimasi;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by idn on 1/27/2017.
 */

public class Adapter extends ArrayAdapter {
    private final Activity context;
    private final int gambar[];
    private final String[]nama;
    private final String[]isi;


    public Adapter(Activity context, String[] nama, int[] gambar, String[] isi) {
        super(context, R.layout.list_item,nama);
        this.context = context;
        this.gambar = gambar;
        this.nama = nama;
        this.isi = isi;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflanter = context.getLayoutInflater();
        View v = layoutInflanter.inflate(R.layout.list_item, null,true);
        TextView txt = (TextView) v.findViewById(R.id.textView3);
        ImageView img = (ImageView) v.findViewById(R.id.imageView2);


        txt.setText(nama[position]);
        img.setImageResource(gambar[position]);
        return v;
    }
}
