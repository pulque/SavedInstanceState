package com.lizheblogs.savedinstancestate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lizheblogs.savedinstancestate.ui.main.MainFragment;
import com.lizheblogs.savedinstancestate.ui.main1.Main1Fragment;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("=============","Main1Activity +++onCreateView+++ savedInstanceState="+(savedInstanceState == null));
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Main1Fragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("=============","Main1Activity +++onSaveInstanceState+++ savedInstanceState="+(outState == null));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("=============","Main1Activity +++onRestoreInstanceState+++ savedInstanceState="+(savedInstanceState == null));
    }
}
