package com.example.iamph.ibsg.SurveyActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.iamph.ibsg.R;
import com.example.iamph.ibsg.User;

/**
 * Created by iamph on 20/09/2017.
 */

public class Q2Activity extends AppCompatActivity{
    //declare items
    private RatingBar ratingBar;
    private Button backBtn;

    User nonRegUser;
    //toast debugging declaration
    int duration = Toast.LENGTH_SHORT;
    Context context;
    CharSequence text;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        nonRegUser = User.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        //Toast
        context = getApplicationContext();
        //toast = Toast.makeText(context, "Question 2", duration);
        //toast.show();
        final Intent intent = new Intent(Q2Activity.this, Q3Activity.class);
        final Intent currIntent = getIntent();
        //text = nonRegUser.religion;
        //toast = Toast.makeText(context, text, duration);
        //toast.show();
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                nonRegUser.knowledge = (int)ratingBar.getRating();
                startActivity(intent);
            }
        });

    }

}
