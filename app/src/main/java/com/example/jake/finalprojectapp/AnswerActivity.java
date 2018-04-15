package com.example.jake.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private Button button7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        button7 = findViewById(R.id.button7);

        Intent getintent = getIntent();
        String gymselect = getintent.getStringExtra("gymselect");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(gymselect);


       button7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent2 = new Intent(AnswerActivity.this, MainActivity.class);
               intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
               startActivity(intent2);
           }
       });
    }
}
