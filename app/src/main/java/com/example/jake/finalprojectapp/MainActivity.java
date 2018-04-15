package com.example.jake.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import java.sql.DatabaseMetaData;

public class MainActivity extends AppCompatActivity{
    private Button button;
    private Button button2;
    private Button button3;
    private String Gym;
    //private String GymSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gym = "TUF";
                openDatenTime();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gym = "IBC";
                openDatenTime();
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gym = "Star";
                openDatenTime();
            }
        });

    }
    public void openDatenTime() {
        Intent myintent = new Intent(this, DatenTime.class);
        myintent.putExtra("gymselect", Gym);
        startActivity(myintent);

    }




}

