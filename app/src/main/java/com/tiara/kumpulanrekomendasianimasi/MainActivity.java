package com.tiara.kumpulanrekomendasianimasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String nama [] = {
            "Film Ice Age:Collision Course" , "Film Kungfu Panda 3" , "Film Sheep And Wolves" , "Film Zootopia" , "Film Space Dogs" , "Film The Wild Life" , "Film Sing" , "Film Norm Of The North "
    };

    int gambar[] ={
            R.drawable.iceage , R.drawable.kungfu , R.drawable.sheep , R.drawable.zootopia , R.drawable.dogspace , R.drawable.thewildlife , R.drawable.sing , R.drawable.norm
    };
    String isi [] = {
            String.valueOf(R.string.iceage) , String.valueOf(R.string.kungfupanda) , String.valueOf(R.string.sheep) , String.valueOf(R.string.zootopia) , String.valueOf(R.string.dog) , String.valueOf(R.string.thewildlife) , String.valueOf(R.string.sing) , String.valueOf(R.string.norm)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);

        Adapter adapterListView = new Adapter(this, nama, gambar, isi);
        listView.setAdapter(adapterListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getApplicationContext(), Detail.class);
                a.putExtra("nama", nama[position]);
                int c = gambar[position];
                a.putExtra("gambar", c);
                a.putExtra("isi",isi[position]);
                startActivity(a);
            }


        });

    }
}
