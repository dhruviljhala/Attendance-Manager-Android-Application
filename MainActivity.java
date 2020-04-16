package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;
public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
TextView tv1;
View v;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        v=this.getWindow().getDecorView();
        v.setBackgroundResource(R.color.colorPrimaryDark);
        tv1=(TextView)findViewById(R.id.tv1);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,second.class);
                String str3 = "";
                a.putExtra("K1",str3);
                startActivity(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,second.class);
                String str3 = "";
                a.putExtra("K1",str3);
                startActivity(a);

            }
        });


        b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,aboutus.class);
                startActivity(b);
            }
        });
    }
}
