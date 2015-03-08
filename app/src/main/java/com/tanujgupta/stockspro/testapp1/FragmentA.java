package com.tanujgupta.stockspro.testapp1;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class FragmentA extends ListFragment implements AdapterView.OnItemClickListener{

    Communicator communicator;   // interface to absorb touches form the fragment and pass it on the corresponding activity

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // set the list view from resources
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.array_of_numbers, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // absorb the click and pass it to the activity to handle the click
        communicator = (Communicator) getActivity();
        communicator.respond(getListView().getItemAtPosition(position).toString());

    }
}
