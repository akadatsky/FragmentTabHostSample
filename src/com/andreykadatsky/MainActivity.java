package com.andreykadatsky;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        addTab("f1", FragmentTab.class);
        addTab("f2", Fragment2.class);
        addTab("f3", Fragment3.class);
    }

    private void addTab(String tag, Class<?> fragmentClass) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab, mTabHost.getTabWidget(), false);
        TabHost.TabSpec tabSpec = mTabHost.newTabSpec(tag).setIndicator(view);
        mTabHost.addTab(tabSpec, fragmentClass, null);
    }

}
