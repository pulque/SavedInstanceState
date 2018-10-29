package com.lizheblogs.savedinstancestate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lizheblogs.savedinstancestate.ui.main2.Main2Fragment;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("=============","Main2Activity +++onCreateView+++ savedInstanceState="+(savedInstanceState == null));
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Main2Fragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("=============","Main2Activity +++onSaveInstanceState+++ savedInstanceState="+(outState == null));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("=============","Main2Activity +++onRestoreInstanceState+++ savedInstanceState="+(savedInstanceState == null));
    }
}
