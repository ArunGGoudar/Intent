package com.example.arun.intentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CreateContact extends AppCompatActivity {

    EditText etName,etNumber,etWeb,etLocation;
    ImageView ivHappy,ivOk,ivSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);

        etName = (EditText) findViewById(R.id.etName);
        etNumber =(EditText) findViewById(R.id.etNumber);
        etWeb = (EditText) findViewById(R.id.etWeb);
        etLocation = (EditText) findViewById(R.id.etLocation);

        ivHappy =(ImageView) findViewById(R.id.ivHappy);
        ivOk =(ImageView) findViewById(R.id.ivOk);
        ivSad=(ImageView)findViewById(R.id.ivSad);





    }
}
