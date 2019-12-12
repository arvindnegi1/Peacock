package com.negi.peacocksolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

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
        setActionBar(tv);

    }
}
