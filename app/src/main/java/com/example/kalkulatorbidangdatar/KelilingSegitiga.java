package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelilingSegitiga extends AppCompatActivity {

    private EditText atxt;
    private EditText ttxt;
    private EditText btxt;
    private EditText ctxt;
    private EditText hasil;
    private Button Keliling;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);
        atxt = (EditText) findViewById(R.id.atxt);
        btxt = (EditText)findViewById(R.id.btxt);
        ctxt = (EditText) findViewById(R.id.ctxt) ;
        hasil = (EditText) findViewById(R.id.hasil);
        Keliling = (Button) findViewById(R.id.keliling);
    }

    public void keliling3(View view) {
        try {

            int a = Integer.parseInt(atxt.getText().toString());
            int b = Integer.parseInt(btxt.getText().toString());
            int c = Integer.parseInt(ctxt.getText().toString());
            int keliling = a+b+c;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kembali3(View view){
        finish();
    }

}