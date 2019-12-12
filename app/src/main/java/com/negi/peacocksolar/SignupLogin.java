package com.negi.peacocksolar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class SignupLogin extends AppCompatActivity {
View v,v1;
TextView textView;
Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_login);
        v=findViewById(R.id.toptool);
        myToolbar=v.findViewById(R.id.custool);
        setActionBar(myToolbar);
        textView=v.findViewById(R.id.texttop);
        textView.setText("testing case");
        loadfragment(new SignIn());


    }

    private void loadfragment(Fragment fragment)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }
}
