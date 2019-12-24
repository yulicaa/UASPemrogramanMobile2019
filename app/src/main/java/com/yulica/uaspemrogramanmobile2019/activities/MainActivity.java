package com.yulica.uaspemrogramanmobile2019.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.yulica.uaspemrogramanmobile2019.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickFilmFragment(View view) {
        Intent intent = new Intent(this, FilmActivity.class);
        startActivity(intent);
    }

    public void handlerClickDramaFragment(View view) {
        Intent intent = new Intent(this, DramaActivity.class);
        startActivity(intent);
    }

    public void handlerClickRateFragment(View view) {
        Intent intent = new Intent(this, RateActivity.class);
        startActivity(intent);
    }
}
