package com.gkv.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gkv.app.R;
import com.gkv.app.Utility.BaseActivity;

/**
 * Created by GOKUL on 31-08-2017.
 */
public class SendActivity extends BaseActivity implements View.OnClickListener {
    private ImageView back;
    private TextView title;

    @Override
    public void initialize(Bundle save) {

        title = (TextView) findViewById(R.id.title);
        back = (ImageView) findViewById(R.id.back);

        back.setOnClickListener(this);

        title.setText("Send");
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_send;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
        }
    }
}
