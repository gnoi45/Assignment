package com.gkv.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gkv.app.Activity.SendActivity;
import com.gkv.app.R;
import com.gkv.app.Utility.BaseActivity;

/**
 * Created by GOKUL on 31-08-2017.
 */
public class EnterPinActivity extends BaseActivity implements View.OnClickListener {
    private ImageView forward;
    private TextView title;
    private ImageView back;
    private TextView one;
    private TextView two;
    private TextView three;
    private TextView four;
    private TextView five;
    private TextView six;
    private TextView seven;
    private TextView eight;
    private TextView nine;
    private TextView zero;
    private TextView dot;
    private ImageView backspace;

    private TextView circle1, circle2, circle3, circle4;
    private int count = 0;


    @Override
    public void initialize(Bundle save) {
        forward = (ImageView) findViewById(R.id.forward);
        forward.setOnClickListener(this);


        title = (TextView) findViewById(R.id.title);
        back = (ImageView) findViewById(R.id.back);
        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);

        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);

        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);

        zero = (TextView) findViewById(R.id.zero);
        dot = (TextView) findViewById(R.id.dot);
        backspace = (ImageView) findViewById(R.id.backspace);

        circle1 = (TextView) findViewById(R.id.circle1);
        circle2 = (TextView) findViewById(R.id.circle2);
        circle3 = (TextView) findViewById(R.id.circle3);
        circle4 = (TextView) findViewById(R.id.circle4);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        backspace.setOnClickListener(this);
        back.setOnClickListener(this);

        title.setText("Enter Pin");
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_enter_pin;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.forward:
                sendToActivity(LedgerActivity.class);
                break;
            case R.id.back:
                finish();
                break;
            case R.id.one:
                select();
                break;
            case R.id.two:
                select();
                break;
            case R.id.three:
                select();
                break;
            case R.id.four:
                select();
                break;
            case R.id.five:
                select();
                break;
            case R.id.six:
                select();
                break;
            case R.id.seven:
                select();
                break;
            case R.id.eight:
                select();
                break;
            case R.id.nine:
                select();
                break;
            case R.id.zero:
                select();
                break;
            case R.id.dot:
                select();
                break;
            case R.id.backspace:
                unselect();
                break;
        }
    }

    private void select() {
        if (count < 4) {
            count++;
            String circle = "circle" + (count);
            switch (circle) {
                case "circle1":
                    circle1.setBackground(getResources().getDrawable(R.drawable.circle_selected));
                    break;
                case "circle2":
                    circle2.setBackground(getResources().getDrawable(R.drawable.circle_selected));
                    break;
                case "circle3":
                    circle3.setBackground(getResources().getDrawable(R.drawable.circle_selected));
                    break;
                case "circle4":
                    circle4.setBackground(getResources().getDrawable(R.drawable.circle_selected));
                    break;
            }
        }
    }

    private void unselect() {
        if (count > 0) {
            String circle = "circle" + count;
            switch (circle) {
                case "circle1":
                    circle1.setBackground(getResources().getDrawable(R.drawable.circle));
                    break;
                case "circle2":
                    circle2.setBackground(getResources().getDrawable(R.drawable.circle));
                    break;
                case "circle3":
                    circle3.setBackground(getResources().getDrawable(R.drawable.circle));
                    break;
                case "circle4":
                    circle4.setBackground(getResources().getDrawable(R.drawable.circle));
                    break;

            }
            count--;
        }
    }
}
