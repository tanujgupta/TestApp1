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

    // implementing the interface method which is called when a list item is clicked on the fragment
    @Override
    public void respond(String list_item) {

        // start the second activity which shows details section coloured according to which list item is selected
        Intent intent  = new Intent();
        intent.setClass(this, ActivityB.class);
        intent.putExtra("index", list_item);
        startActivity(intent);

    }
}
