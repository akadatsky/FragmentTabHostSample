package com.andreykadatsky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends FragmentTab {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_layout, container, false);
        TextView text = (TextView) v.findViewById(R.id.text);
        text.setText("Current Tab is: Fragment2");
        return v;
    }

}
