package com.tanujgupta.stockspro.testapp1;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class ActivityB extends Activity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b);



    }

    @Override
    protected void onResume() {
        super.onResume();

        Bundle bundle = getIntent().getExtras();
        String item = bundle.getString("index", "One");
         respond(item);
        Log.d("item ", item);
    }

    @Override
    public void respond(String list_item) {

        FragmentManager manager =  getFragmentManager();
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.setLayoutColor(list_item);

    }
}
