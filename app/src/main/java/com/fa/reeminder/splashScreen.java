package com.fa.reeminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {
    private int waktu_loading = 3000;
    //3000 = 3 second
    TextView teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Font();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },waktu_loading);
    }

    public void Font() {
        teks = findViewById(R.id.txt_Reminder);
        Typeface customFont = Typeface.createFromAsset(getAssets(),"Font/veryyou.ttf");
        teks.setTypeface(customFont);
    }
}
