package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HitungKeliling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_keliling);
    }

    public void kelilingpersegi(View view) {
        Intent intent=new Intent(HitungKeliling.this,KelilingPersegi.class);
        startActivity(intent);
    }

    public void kelilingsegitiga(View view) {
        Intent intent=new Intent(HitungKeliling.this,KelilingSegitiga.class);
        startActivity(intent);
    }

    public void kelilinglingkaran(View view) {
        Intent intent=new Intent(HitungKeliling.this,KelilingLingkaran.class);
        startActivity(intent);
    }

    public void kembali4(View view){
        finish();
    }

}