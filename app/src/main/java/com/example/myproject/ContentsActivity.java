package com.example.myproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class ContentsActivity extends AppCompatActivity {

    private String TAG = "ContentsActivity";

    private int LoginActivityRequestCode = 1;

    EditText searchEditText;
    ImageView searchBtn;
    ImageView loginBtn;
    RecyclerView contentsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        searchEditText = findViewById(R.id.contentsActivityEditText);
        searchBtn = findViewById(R.id.contentsActivitySearchButton);
        loginBtn = findViewById(R.id.contentsActivityLoginButton);
        contentsRecyclerView = findViewById(R.id.contentsActivityRecyclerView);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContentsActivity.this, LoginActivity.class);
                startActivityForResult(intent, LoginActivityRequestCode);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == LoginActivityRequestCode){
            if(resultCode == RESULT_OK){

            }
        }
    }
}