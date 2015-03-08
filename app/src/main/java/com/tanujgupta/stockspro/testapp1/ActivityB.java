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

        //call the method of fragment b which sets the color according to item clicked on previous activity
        Bundle bundle = getIntent().getExtras();
        String item = bundle.getString("index", "One");
        respond(item);
    }

    // implementing the interface method which is called when a list item is clicked on the fragment
    @Override
    public void respond(String list_item) {

        // call the method of fragment b which sets the color according to item clicked
        FragmentManager manager =  getFragmentManager();
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.setLayoutColor(list_item);

    }
}
