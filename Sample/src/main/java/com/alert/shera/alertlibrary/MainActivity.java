package com.alert.shera.alertlibrary;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alert.shera.alertdialoglib.AlertLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertLibrary pDialog = new AlertLibrary(this);
        pDialog.changeAlertType(AlertLibrary.PROGRESS_TYPE);
        pDialog.setTitleText("Initializing morpho device...");
        pDialog.show();
    }
}
