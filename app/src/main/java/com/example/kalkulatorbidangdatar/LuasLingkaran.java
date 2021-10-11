package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LuasLingkaran extends AppCompatActivity {

    private EditText rtxt;
    private EditText hasil;
    private Button luas;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);
        rtxt = (EditText) findViewById(R.id.rtxt);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
    }

    public void luas1(View view) {
        try {

            int r = Integer.parseInt(rtxt.getText().toString());
            double phi = 3.14;
            double luas =  phi * r * r;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali1(View view){
        finish();
    }

}