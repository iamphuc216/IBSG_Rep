package com.example.iamph.ibsg.SurveyActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.iamph.ibsg.R;
import com.example.iamph.ibsg.Survey;

/**
 * Created by iamph on 20/09/2017.
 */

public class Q2Activity extends AppCompatActivity{
    //declare items
    private RatingBar ratingBar;
    private Button backBtn;

<<<<<<< HEAD
    User nonRegUser;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        nonRegUser = User.getInstance();
=======
    Survey nonRegUserSurvey;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        nonRegUserSurvey = Survey.getInstance();
>>>>>>> 9f38b8e818aebb5ea45fd45d6c719c2eea10c5ff

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b)
            {
<<<<<<< HEAD
                nonRegUser.knowledge = (int)ratingBar.getRating();
=======
                nonRegUserSurvey.knowledge = (int)ratingBar.getRating();
>>>>>>> 9f38b8e818aebb5ea45fd45d6c719c2eea10c5ff
                startActivity(new Intent(Q2Activity.this, Q3Activity.class));
            }
        });

    /*
        if (nonRegUser.religion == "no") {
            ratingBar.setVisibility(View.GONE);
        }
    */

    }

}
