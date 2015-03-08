package com.tanujgupta.stockspro.testapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MyActivity extends Activity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public void respond(String list_item) {

        Intent intent  = new Intent();
        intent.setClass(this, ActivityB.class);
        intent.putExtra("index", list_item);
        startActivity(intent);

    }
}
