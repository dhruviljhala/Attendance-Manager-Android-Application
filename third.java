package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class third extends AppCompatActivity {
    Button TB1, TB2, TB3, TB4;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
        Bundle app = getIntent().getExtras();
        tv3 = (TextView) findViewById(R.id.tv3);
        TB1 = (Button) findViewById(R.id.TB1);
        TB2 = (Button) findViewById(R.id.TB2);
        TB3 = (Button) findViewById(R.id.TB3);
        TB4 = (Button) findViewById(R.id.TB4);
        try {
            TB1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(getApplicationContext(), test.class);
                    startActivity(a);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
