package com.example.projectburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BurgerActivity extends AppCompatActivity {

    private Burger burger;
    Button Btnd;
    Button btnbas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_burger );

        RecyclerView recycler = findViewById ( R.id.burger_recycler );

        String[] captions = new String[burger.burgers.length];
        int[] ids = new int[burger.burgers.length];

        for (int ii = 0; ii < captions.length; ii++) {
            captions[ii] = burger.burgers[ii].getName ();
            ids[ii] = burger.burgers[ii].getImageID ();
        }
        recycler.setLayoutManager ( new LinearLayoutManager ( this ) );
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter ( captions, ids );
        recycler.setAdapter ( adapter );

        Btnd = findViewById ( R.id.btndrinks );

        Btnd.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent ( BurgerActivity.this,DrinkActivity.class );
                startActivity ( intent_one );
            }
        } );

        btnbas = findViewById ( R.id.btnBasket );
        btnbas.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent ( BurgerActivity.this,order_activity.class );
                startActivity ( intent_one );
            }
        } );

    }


}
