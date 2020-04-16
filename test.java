package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test extends AppCompatActivity {

    Button button,osb;
    TextView ostv, tcstv,cntv,adctv,em4tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        osb=(Button)findViewById(R.id.osb);
        button = findViewById(R.id.button);
        ostv = findViewById(R.id.ostv);
        tcstv = findViewById(R.id.tcstv);
        cntv = findViewById(R.id.cntv);
        adctv = findViewById(R.id.adctv);
        em4tv = findViewById(R.id.em4tv);
        osb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(test.this,os.class);
                startActivity(a);
            }
        });
      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Values.class);
                startActivity(intent);
            }
        });*/

      //  Intent intent1 = getIntent();

      /*  ostv.setText(intent1.getStringExtra("val1"));
        tcstv.setText(intent1.getStringExtra("val2"));
        cntv.setText(intent1.getStringExtra("val3"));
        adctv.setText(intent1.getStringExtra("val4"));
        em4tv.setText(intent1.getStringExtra("val5"));*/
    }
}
