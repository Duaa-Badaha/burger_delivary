package com.example.projectburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button firstButton;
Button secondButton;
Button thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        thirdButton = findViewById(R.id.button3);

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent(MainActivity.this, delivery.class);
                startActivity(intent_one);
            }
        });



        firstButton = findViewById(R.id.button1);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent(MainActivity.this, AdminActivity.class);
                startActivity(intent_one);
            }
        });




        secondButton = findViewById(R.id.button2);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent_one);
            }
        });





    }
}