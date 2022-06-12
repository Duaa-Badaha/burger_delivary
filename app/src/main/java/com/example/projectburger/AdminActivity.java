package com.example.projectburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends AppCompatActivity {

    Button userbutton;
    Button comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_admin );



        userbutton = findViewById(R.id.button4);

        userbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent(AdminActivity.this, UserList .class);
                startActivity(intent_one);
            }
        });



        comment = findViewById(R.id.button5);

        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent(AdminActivity.this, comments .class);
                startActivity(intent_one);
            }
        });


    }

}