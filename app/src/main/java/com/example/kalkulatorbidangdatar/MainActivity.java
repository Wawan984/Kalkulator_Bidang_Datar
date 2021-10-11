package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitungkeliling(View view) {
        Intent intent=new Intent(MainActivity.this,HitungKeliling.class);
        startActivity(intent);
    }

    public void hitungluas(View view) {
        Intent intent=new Intent(MainActivity.this,HitungLuas.class);
        startActivity(intent);
    }

}