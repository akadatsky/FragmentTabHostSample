package com.andreykadatsky;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends FragmentTab {

    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentTabHost mTabHost = new FragmentTabHost(getActivity());
		mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.menu_settings);

		mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("Simple"), FragmentTab.class, null);
		mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("Contacts"), Fragment2.class, null);
		return mTabHost;
	}
}
