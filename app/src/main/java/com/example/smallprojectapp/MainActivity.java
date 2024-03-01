package com.example.smallprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static int test(int x){
        return x+1;
    }
    public static int test2(int x){
        return x+2;
    }

    public static int test3(int x){
        return x+3;
    }
}