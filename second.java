package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
Button B1,B2,B3,B4;
TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle app=getIntent().getExtras();
        tv2=(TextView)findViewById(R.id.tv2);
        B1=(Button)findViewById(R.id.B1);
        B2=(Button)findViewById(R.id.B2);
        B3=(Button)findViewById(R.id.B3);
        B4=(Button)findViewById(R.id.B4);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(second.this,third.class);
                String str3 = "";
                a.putExtra("K1",str3);
                startActivity(a);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(second.this,third.class);
                String str3 = "";
                a.putExtra("K1",str3);
                startActivity(a);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(second.this,third.class);
                String str3 = "";
                a.putExtra("K1",str3);
                startActivity(a);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(second.this,third.class);
                String str3 = "";
                a.putExtra("K1",str3);
                startActivity(a);
            }
        });
    }
}
