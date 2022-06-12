package com.example.projectburger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class order_activity extends AppCompatActivity {

    EditText edtName, edtAddress, edtPhone;
    Button btnOrder, btnComment;

    String strName, strAddress, strPhone, text1, text2, text3;

    public static final String SHARED_PREFS = "shared_prefs";

    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order );

        edtName = (EditText) findViewById(R.id.edtName);
        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtPhone = (EditText) findViewById(R.id.edtPhone);
        btnOrder = (Button) findViewById(R.id.btnOrder);
        btnComment = (Button) findViewById(R.id.btnComment);

        sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strName = edtName.getText().toString();
                strAddress = edtAddress.getText().toString();
                strPhone = edtPhone.getText().toString();

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("name", strName);
                editor.putString("address", strAddress);
                editor.putString("phone", strPhone);
                editor.apply();

                Toast.makeText(order_activity.this, "Order Sent !", Toast.LENGTH_SHORT).show();

            }
        });

        btnComment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order_activity.this, commentActivity.class);
                startActivity(intent);
            }

        });

        loadData();

    }

//    public void saveData(){
//        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//
//        editor.putString("name", edtName.getText().toString());
//        editor.putString("address", edtAddress.getText().toString());
//        editor.putString("phone", edtPhone.getText().toString());
//
//        editor.apply();
//
//        Toast.makeText(this, "Your Order Sent!", Toast.LENGTH_SHORT).show();
//
//    }


    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text1 = sharedPreferences.getString("name", "");
        text2 = sharedPreferences.getString("address", "");
        text3 = sharedPreferences.getString("phone", "");

        edtName.setText(text1);
        edtAddress.setText(text2);
        edtPhone.setText(text3);
    }
}
