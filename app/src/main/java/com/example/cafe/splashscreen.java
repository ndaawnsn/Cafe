package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    private int waktu_load = 3000;
    //3000 = 3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading pindah ke Main Activity
                Intent home = new Intent(splashscreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, waktu_load);
    }
}