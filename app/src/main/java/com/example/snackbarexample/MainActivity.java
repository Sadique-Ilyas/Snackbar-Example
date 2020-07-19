package com.example.snackbarexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaySnackbar(View view)
    {
        Snackbar.make(findViewById(R.id.coordinator_layout),"You Are Awesome",Snackbar.LENGTH_SHORT).show();
    }

    public void displaySnackbarButton(View view)
    {
        Snackbar.make(findViewById(R.id.coordinator_layout),"Are You Awesome?",Snackbar.LENGTH_SHORT).setAction("Yes", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hey Awesome",Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
}
