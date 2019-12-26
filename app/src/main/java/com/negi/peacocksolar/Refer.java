package com.negi.peacocksolar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;

import android.view.View;
import android.widget.TextView;


public class Refer extends AppCompatActivity {
Toolbar tv;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer);
        View v= getLayoutInflater().inflate(R.layout.toolbar,null);
        tv=v.findViewById(R.id.custool);
        textView=v.findViewById(R.id.texttop);
        textView.setText("REFER a Friend");
       setSupportActionBar(tv);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
