package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelilingPersegi extends AppCompatActivity {

    private EditText stxt;
    private EditText hasil;
    private Button keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);
        stxt = (EditText) findViewById(R.id.stxt);
        hasil = (EditText) findViewById(R.id.hasil);
        keliling = (Button) findViewById(R.id.keliling);
    }

    public void keliling4(View view) {
        try {

            int s = Integer.parseInt(stxt.getText().toString());
            double keliling =  4 * s;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali4(View view){
        finish();
    }

}