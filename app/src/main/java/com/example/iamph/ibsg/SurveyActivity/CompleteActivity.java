package com.example.iamph.ibsg.SurveyActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.iamph.ibsg.R;
import com.example.iamph.ibsg.User;

/**
 * Created by iamph on 5/10/2017.
 */

public class CompleteActivity extends AppCompatActivity {

    //declare items
    Button regmemberBtn;
    Button returnBtn;

    User nonRegUser;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qcomplete);
        nonRegUser = User.getInstance();

        regmemberBtn = (Button)findViewById(R.id.regmemberBtn);

        regmemberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CompleteActivity.this, EnterDetailActivity.class));
            }
        });
    }
}
