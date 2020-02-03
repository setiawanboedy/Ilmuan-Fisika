package com.ilmuanfisika;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;

public class detaililmuanfisik extends AppCompatActivity {

    private CardView animeup;
    Animation animationup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detaililmuan);

        //getActionBar().setDisplayHomeAsUpEnabled(true);
        ilmuan ilmuanfis = getIntent().getParcelableExtra("key");

        ImageView gambarfisik = (ImageView)findViewById(R.id.fisik);
        TextView namafisik = (TextView)findViewById(R.id.namailmuan);
        TextView pendait = (TextView)findViewById(R.id.penemuan);
        TextView deskripfisik = (TextView)findViewById(R.id.deskrip);
        TextView refer = (TextView)findViewById(R.id.refrensi);

        Glide.with(this).load(ilmuanfis.getPhoto()).override(100,100).into(gambarfisik);
        namafisik.setText(ilmuanfis.getNama());
        deskripfisik.setText(ilmuanfis.getDeskripsi());
        pendait.setText(ilmuanfis.getPenemuan());
        refer.setText(ilmuanfis.getRefrensi());

        animeup = findViewById(R.id.card);
        animationup = AnimationUtils.loadAnimation(this,R.anim.animeup);

        animeup.animate().translationX(0);
        animeup.startAnimation(animationup);

        LinearLayout desdown = findViewById(R.id.desdown);
        Animation animdown = AnimationUtils.loadAnimation(this,R.anim.anime);

        desdown.animate().translationX(0);
        desdown.startAnimation(animdown);

    }
}
