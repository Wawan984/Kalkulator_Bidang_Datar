package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LuasSegitiga extends AppCompatActivity {

    private EditText atxt;
    private EditText ttxt;
    private EditText hasil;
    private Button Luas;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);
        atxt = (EditText) findViewById(R.id.atxt);
        ttxt = (EditText) findViewById(R.id.ttxt);
        hasil = (EditText) findViewById(R.id.hasil);
        Luas = (Button) findViewById(R.id.luas);
    }

    public void luas3(View view) {
        try {

            int a = Integer.parseInt(atxt.getText().toString());
            int t = Integer.parseInt(ttxt.getText().toString());
            int luas = (a * t) / 2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali3(View view){
        finish();
    }

}