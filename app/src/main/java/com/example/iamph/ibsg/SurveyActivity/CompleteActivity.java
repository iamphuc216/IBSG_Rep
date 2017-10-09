package com.example.iamph.ibsg.SurveyActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.iamph.ibsg.R;
<<<<<<< HEAD
import com.example.iamph.ibsg.User;
=======
import com.example.iamph.ibsg.Survey;
>>>>>>> 9f38b8e818aebb5ea45fd45d6c719c2eea10c5ff

/**
 * Created by iamph on 5/10/2017.
 */

public class CompleteActivity extends AppCompatActivity {

    //declare items
    Button regmemberBtn;
    Button returnBtn;

<<<<<<< HEAD
    User nonRegUser;
=======
    Survey nonRegUserSurvey;
>>>>>>> 9f38b8e818aebb5ea45fd45d6c719c2eea10c5ff
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qcomplete);
<<<<<<< HEAD
        nonRegUser = User.getInstance();
=======
        nonRegUserSurvey                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 = Survey.getInstance();
>>>>>>> 9f38b8e818aebb5ea45fd45d6c719c2eea10c5ff

        regmemberBtn = (Button)findViewById(R.id.regmemberBtn);

        regmemberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CompleteActivity.this, EnterDetailActivity.class));
            }
        });
    }
}
