package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //1. khai báo biến
    EditText ed_soa, ed_sob;
    Button tinh,tinh2;
    TextView ketqua,kq1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. Ánh xạ
        ed_soa = findViewById(R.id.ed_soa);
        ed_sob = findViewById(R.id.ed_sob);
        tinh = findViewById(R.id.tinh);
        tinh2=findViewById(R.id.tinh2);
        kq1=findViewById(R.id.kq1);
        //3. Xử lý sự kiện
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String soa = ed_soa.getText().toString();
                String sob = ed_sob.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("soa", soa);
                bundle.putString("sob", sob);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        tinh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soa=ed_soa.getText().toString();
                String sob=ed_sob.getText().toString();

                double a=Double.parseDouble(soa);
                double b=Double.parseDouble(sob);
                double c= a+b;

                kq1.setText(String.valueOf(c));
            }
        });

    }
}
