package com.example.praktika15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDialog(View view){
        setContentView(R.layout.dialog);
    }

    public void onMain(View view){
        setContentView(R.layout.activity_main);
    }


}