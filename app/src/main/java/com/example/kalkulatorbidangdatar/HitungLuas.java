package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HitungLuas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas);
    }

    public void luaspersegi(View view) {
        Intent intent=new Intent(HitungLuas.this,LuasPersegi.class);
        startActivity(intent);
    }

    public void luassegitiga(View view) {
        Intent intent=new Intent(HitungLuas.this,LuasSegitiga.class);
        startActivity(intent);
    }

    public void luaslingkaran(View view) {
        Intent intent=new Intent(HitungLuas.this,LuasLingkaran.class);
        startActivity(intent);
    }

    public void kembali4(View view){
        finish();
    }

}