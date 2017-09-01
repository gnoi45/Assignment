package com.gkv.app.Utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by GOKUL on 31-08-2017.
 */
public abstract class BaseActivity extends Activity {
    public void onCreate(Bundle save) {
        super.onCreate(save);
        setContentView(getActivityLayout());
        initialize(save);
    }

    public abstract void initialize(Bundle save);

    public abstract int getActivityLayout();

    public void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void alertMessage(String title, String message) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setPositiveButton("OK", null);
        alertDialog.show();
    }

    public void sendToActivity(Class className) {
        Intent intent = new Intent(this, className);
        startActivity(intent);
    }
}
