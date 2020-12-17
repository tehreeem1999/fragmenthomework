package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btntwo(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        SecondFragment secondFragment=new SecondFragment();
        fragmentTransaction.replace(R.id.firstfragment,secondFragment);
        fragmentTransaction.commit();
    }

    public void btnone(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        FirstFragment firstFragment=new FirstFragment();
        fragmentTransaction.replace(R.id.firstfragment,firstFragment);
        fragmentTransaction.commit();
    }
}