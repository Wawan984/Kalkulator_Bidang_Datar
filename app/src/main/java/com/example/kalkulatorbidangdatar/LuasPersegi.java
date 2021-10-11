package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LuasPersegi extends AppCompatActivity {

    private EditText stxt;
    private EditText hasil;
    private Button luas;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);
        stxt = (EditText) findViewById(R.id.stxt);
        hasil = (EditText) findViewById(R.id.hasil);
        luas = (Button) findViewById(R.id.luas);
    }

    public void luas4(View view) {
        try {

            int s = Integer.parseInt(stxt.getText().toString());
            double luas =  s * s;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali4(View view){
        finish();
    }

}