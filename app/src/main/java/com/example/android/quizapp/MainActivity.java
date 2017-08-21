package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int lastScore = 0, score, score1, score2, score3, score4, score5, score6, score7, score8;
    public void checkbox(View view) {
        CheckBox validate = (CheckBox) findViewById(R.id.check_right);
        CheckBox validate1 = (CheckBox) findViewById(R.id.check_right1);
        CheckBox validate2 = (CheckBox) findViewById(R.id.check_right2);
        CheckBox validate3 = (CheckBox) findViewById(R.id.check_right3);
        if (validate.isChecked() && validate1.isChecked() && !validate2.isChecked() && !validate3.isChecked()) {
            score = score + 1;
        }
    }
    public void plusScore1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked1:
                if (checked) {
                    score1 = score1 + 1;
                }
        }

    }
    public void wrongOption(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_option:
                if (checked) {
                    score1 = 0;
                }
        }
    }
    public void wrongOption1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_option1:
                if (checked) {
                    score1 = 0;
                }
        }
    }
    public void wrongOption2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.wrong_option2:
                if (checked) {
                    score1 = 0;
                }
        }
    }
    public void plusScore2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked2:
                if (checked) {
                    score2 = score2 + 1;
                }
        }
    }
    public void decrementScore(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.decrement_score:
                if (checked) {
                    score2 = 0;
                }
        }
    }
    public void decrementScore1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.decrement_score1:
                if (checked) {
                    score2 = 0;
                }
        }
    }
    public void decrementScore2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.decrement_score2:
                if (checked) {
                    score2 = 0;
                }
        }
    }
    public void plusScore3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked3:
                if (checked) {
                    score3 = score3 + 1;
                }
        }
    }
    public void question3option2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Question3_option2:
                if (checked) {
                    score3 = 0;
                }
        }
    }
    public void question3option3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Question3_option3:
                if (checked) {
                    score3 = 0;
                }
        }
    }
    public void question3option4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Question3_option4:
                if (checked) {
                    score3 = 0;
                }
        }
    }
    public void plusScore4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked4:
                if (checked) {
                    score4 = score4 + 1;
                }
        }
    }
    public void question4Option2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question4_option2:
                if (checked) {
                    score4 = 0;
                }
        }
    }
    public void question4Option3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question4_option3:
                if (checked) {
                    score4 = 0;
                }
        }
    }
    public void question4Option4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question4_option4:
                if (checked) {
                    score4 = 0;
                }
        }
    }
    public void plusScore5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked5:
                if (checked) {
                    score5 = score5 + 1;
                }
        }
    }
    public void question5Option2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question5_option2:
                if (checked) {
                    score5 = 0;
                }
        }
    }
    public void question5Option3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question5_option3:
                if (checked) {
                    score5 = 0;
                }
        }
    }
    public void question5Option4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question5_option4:
                if (checked) {
                    score5 = 0;
                }
        }
    }
    public void plusScore6(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked6:
                if (checked) {
                    score6 = score6 + 1;
                }
        }
    }
    public void question6Option2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question6_option2:
                if (checked) {
                    score6 = 0;
                }
        }
    }
    public void question6Option3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question6_option3:
                if (checked) {
                    score6 = 0;
                }
        }
    }
    public void question6Option4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question6_option4:
                if (checked) {
                    score6 = 0;
                }
        }
    }
    public void plusScore7(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked7:
                if (checked) {
                    score7 = score + 1;
                }
        }
    }
    public void question7Option2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question7_option2:
                if (checked) {
                    score7 = 0;
                }
        }
    }
    public void question7Option3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question7_option3:
                if (checked) {
                    score7 = 0;
                }
        }
    }
    public void question7Option4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question7_option4:
                if (checked) {
                    score7 = 0;
                }
        }
    }
    public void plusScore8(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.is_Clicked8:
                if (checked) {
                    score8 = score8 + 1;
                }
        }
    }
    public void question8Option2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question8_option2:
                if (checked) {
                    score8 = 0;
                }
        }
    }
    public void question8Option3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question8_option3:
                if (checked) {
                    score8 = 0;
                }
        }
    }
    public void question8Option4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question8_option4:
                if (checked) {
                    score8 = 0;
                }
        }
    }
    public void getAns(View view) {
        EditText msText = (EditText) findViewById(R.id.check_answer);
        String mText = msText.getText().toString();
        if (mText.equalsIgnoreCase("Mahendra Singh Dhoni")) {
            score = score + 1;
        }
    }
    public void submitScore(View view) {
        lastScore = score + score1 + score2 + score2 + score4 + score5 + score6 + score7 + score8;
        getAns(view);
        checkbox(view);
        if (lastScore >= 7) {
            Toast.makeText(getApplicationContext(), "Your score is:" + lastScore + "YOU ARE FAN OF DHONI", Toast.LENGTH_LONG).show();
        } else if (lastScore <= 6) {
            TextView last = (TextView) findViewById(R.id.final_score);
            Toast.makeText(getApplicationContext(), "Your score is:" + lastScore + "YOU NEED TO KNOW DHONI MORE", Toast.LENGTH_LONG).show();
        }
    }
    public void RESET(View view) {
        lastScore = 0;
        score = 0;
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        score6 = 0;
        score7 = 0;
        score7 = 0;
        score8 = 0;
        RadioGroup firstRadioGroup = (RadioGroup) findViewById(R.id.radio1);
        firstRadioGroup.clearCheck();
        RadioGroup secondRadioGroup = (RadioGroup) findViewById(R.id.radio2);
        secondRadioGroup.clearCheck();
        RadioGroup thirdRadioGroup = (RadioGroup) findViewById(R.id.radio3);
        thirdRadioGroup.clearCheck();
        RadioGroup fourthRadioGroup = (RadioGroup) findViewById(R.id.radio4);
        fourthRadioGroup.clearCheck();
        RadioGroup fifthRadioGroup = (RadioGroup) findViewById(R.id.radio5);
        fifthRadioGroup.clearCheck();
        RadioGroup sixthRadioGroup = (RadioGroup) findViewById(R.id.radio6);
        sixthRadioGroup.clearCheck();
        RadioGroup seventhRadioGroup = (RadioGroup) findViewById(R.id.radio7);
        seventhRadioGroup.clearCheck();
        RadioGroup eithRadioGroup = (RadioGroup) findViewById(R.id.radio8);
        eithRadioGroup.clearCheck();
        EditText msText = (EditText) findViewById(R.id.check_answer);
        msText.setText("");
        CheckBox validate = (CheckBox) findViewById(R.id.check_right);
        validate.setChecked(false);
        CheckBox validate1 = (CheckBox) findViewById(R.id.check_right1);
        validate1.setChecked(false);
        CheckBox validate2 = (CheckBox) findViewById(R.id.check_right2);
        validate2.setChecked(false);
        CheckBox validate3 = (CheckBox) findViewById(R.id.check_right3);
        validate3.setChecked(false);
    }
}
