package com.lizheblogs.savedinstancestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lizheblogs.savedinstancestate.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("=============","MainActivity +++onCreateView+++ savedInstanceState="+(savedInstanceState == null));
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("=============","MainActivity +++onSaveInstanceState+++ savedInstanceState="+(outState == null));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("=============","MainActivity +++onRestoreInstanceState+++ savedInstanceState="+(savedInstanceState == null));
    }
}
