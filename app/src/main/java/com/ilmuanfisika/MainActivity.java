package com.ilmuanfisika;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView ilmuanfisika;

    //private LinearLayout anime;
    Animation animasi;

    private ArrayList<ilmuan> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ilmuanfisika = (RecyclerView) findViewById(R.id.ilmuanfisika);

        //anime = findViewById(R.id.anime);
        animasi = AnimationUtils.loadAnimation(this,R.anim.anime);

        //animeup detail

        //animedown home
        ilmuanfisika.animate().translationX(0);
        ilmuanfisika.startAnimation(animasi);

        ilmuanfisika.setHasFixedSize(true);

        list.addAll(DataIlmuan.listdata());
        panggilrecycler();

    }
    private void panggilrecycler(){
        ilmuanfisika.setLayoutManager(new LinearLayoutManager(this));
        formatAdapter FormatAdapter = new formatAdapter(this);
        FormatAdapter.setListIlmuan(list);
        ilmuanfisika.setAdapter(FormatAdapter);
    }

 //Membuat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    //Membuat pilihan menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.about)
        {
            startActivity(new Intent(MainActivity.this, About.class));
        }
        return true;
    }

}

