package com.example.iamph.ibsg;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.iamph.ibsg.SurveyActivity.Q1Activity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    DatabaseReference databaseUser;
    private Button surveyBtn;
    private Button alrdyBtn;
    User nonRegUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nonRegUser = User.getInstance();
        databaseUser = FirebaseDatabase.getInstance().getReference("users");



        surveyBtn = (Button) findViewById(R.id.surveyBtn);
        alrdyBtn = (Button) findViewById(R.id.btnAlrdy);
        final Intent intent = new Intent(MainActivity.this, Q1Activity.class);

        surveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        alrdyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUserToFbase();
            }
        });

    }


    void addUserToFbase()
    {
        String id = databaseUser.push().getKey();

        // Write a message to the database
        databaseUser.child(id).setValue(nonRegUser);

    }



}
