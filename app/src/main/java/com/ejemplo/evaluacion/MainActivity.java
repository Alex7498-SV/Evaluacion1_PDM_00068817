package com.ejemplo.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mProd1, mProd2, mProd3, mProd4, mProd5, mProd6, mProd7, mProd8, mProd9;

    LinearLayout mL1, mL2, mL3, mL4, mL5, mL6, mL7, mL8, mL9;

    EditText mUsername, mUsermail;

    Button mEnviar;

    Array data;

    int c1, c2, c3, c4, c5, c6, c7, c8, c9, cTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProd1 = findViewById(R.id.prod1);
        mProd2 = findViewById(R.id.prod2);
        mProd3 = findViewById(R.id.prod3);
        mProd4 = findViewById(R.id.prod4);
        mProd5 = findViewById(R.id.prod5);
        mProd6 = findViewById(R.id.prod6);
        mProd7 = findViewById(R.id.prod7);
        mProd8 = findViewById(R.id.prod8);
        mProd9 = findViewById(R.id.prod9);

        mL1 = findViewById(R.id.l1);
        mL2 = findViewById(R.id.l2);
        mL3= findViewById(R.id.l3);
        mL4 =findViewById(R.id.l4);
        mL5= findViewById(R.id.l5);
        mL6= findViewById(R.id.l6);
        mL7 = findViewById(R.id.l7);
        mL8 = findViewById(R.id.l8);
        mL9 = findViewById(R.id.l9);

        mUsername = findViewById(R.id.username);
        mUsermail = findViewById(R.id.usermail);

        mEnviar = findViewById(R.id.sendinfo);

        mL1.setOnClickListener(this);
        mL2.setOnClickListener(this);
        mL3.setOnClickListener(this);
        mL4.setOnClickListener(this);
        mL5.setOnClickListener(this);
        mL6.setOnClickListener(this);
        mL7.setOnClickListener(this);
        mL8.setOnClickListener(this);
        mL9.setOnClickListener(this);


        mEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            }
        });
    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId){
            case R.id.l1:
                c1 ++;
                mProd1.setText(Integer.toString(c1));
                break;
            case R.id.l2:
                c2 ++;
                mProd2.setText(Integer.toString(c2));
                break;
            case R.id.l3:
                c3 ++;
                mProd3.setText(Integer.toString(c3));
                break;


            case R.id.l4:
                c4 ++;
                mProd4.setText(Integer.toString(c4));
                break;
            case R.id.l5:
                c5 ++;
                mProd5.setText(Integer.toString(c5));
                break;
            case R.id.l6:
                c6 ++;
                mProd6.setText(Integer.toString(c6));
                break;


            case R.id.l7:
                c7 ++;
                mProd7.setText(Integer.toString(c7));
                break;
            case R.id.l8:
                c8 ++;
                mProd8.setText(Integer.toString(c8));
                break;
            case R.id.l9:
                c9 ++;
                mProd9.setText(Integer.toString(c9));
                break;
        }

    }
}
