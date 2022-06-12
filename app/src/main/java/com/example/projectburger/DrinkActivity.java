package com.example.projectburger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DrinkActivity extends AppCompatActivity {

//    private Burger burger;
//
//    RecyclerView recycler = findViewById ( R.id.burger_recycler );
//
//    String[] captions = new String[burger.burgers.length];
//    int[] ids = new int[burger.burgers.length];
//
//        for (int ii = 0; ii < captions.length; ii++) {
//        captions[ii] = burger.burgers[ii].getName ();
//        ids[ii] = burger.burgers[ii].getImageID ();
//    }
//        recycler.setLayoutManager ( new LinearLayoutManager ( this ) );
//    CaptionedImagesAdapter adapter = new CaptionedImagesAdapter ( captions, ids );
//        recycler.setAdapter ( adapter );
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}