package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txt_ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt_ketqua=findViewById(R.id.txt_ketqua);


        Intent intent =getIntent();
        Bundle bundle =intent.getExtras();

        String soa=bundle.getString("soa");
        String sob=bundle.getString("sob");

        int ketqua=Integer.parseInt(soa)+Integer.parseInt(sob);

            txt_ketqua.setText(String.valueOf(ketqua));

    }

}