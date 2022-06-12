package com.example.projectburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {
    Button bugbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_user );


        bugbutton = findViewById ( R.id.button7 );

        bugbutton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent ( UserActivity.this, BurgerActivity.class );
                startActivity ( intent_one );
            }
        } );


    }
}