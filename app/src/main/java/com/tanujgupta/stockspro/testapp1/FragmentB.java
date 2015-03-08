package com.tanujgupta.stockspro.testapp1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

   TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.tv_details);
    }

    public void setLayoutColor(String list_item) {

        int color;

        switch (list_item.length()) {

            case 3  : color = getResources().getColor(R.color.red);
                break;
            case 4  : color = getResources().getColor(R.color.yellow);
                break;
            case 5  : color = getResources().getColor(R.color.blue);
                break;
            default:  color = getResources().getColor(R.color.red);

        }

        textView.setBackgroundColor(color);

    }

}
