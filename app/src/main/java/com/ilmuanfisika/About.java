package com.ilmuanfisika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class About extends AppCompatActivity {

    private CircleImageView foto;
    Animation fotonime,pronama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        foto = findViewById(R.id.foto);
        LinearLayout namapro = findViewById(R.id.pronama);

        fotonime = AnimationUtils.loadAnimation(this,R.anim.animeup);
        pronama = AnimationUtils.loadAnimation(this,R.anim.anime);

        foto.animate().translationX(0);
        namapro.animate().translationX(0);
        foto.startAnimation(fotonime);
        namapro.startAnimation(pronama);

    }
}
