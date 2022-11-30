package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class signup extends AppCompatActivity {

    //Button identifer

    Button signup;
    Button signin;
    Button signin2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_signup);

        //find button

        signup=findViewById(R.id.Signup);
        signin=findViewById(R.id.Singin);

        //change activity

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,MainActivity.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,signin.class);
                startActivity(intent);
            }
        });
    }
}