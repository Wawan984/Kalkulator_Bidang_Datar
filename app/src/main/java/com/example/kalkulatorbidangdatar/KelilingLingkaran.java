package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelilingLingkaran extends AppCompatActivity {

    private EditText rtxt;
    private EditText hasil;
    private Button keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);
        rtxt = (EditText) findViewById(R.id.rtxt);
        hasil = (EditText) findViewById(R.id.hasil);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void keliling1(View view) {
        try {

            int r = Integer.parseInt(rtxt.getText().toString());
            double phi = 3.14;
            double keliling =  2 * phi * r;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali1(View view){
        finish();
    }

}