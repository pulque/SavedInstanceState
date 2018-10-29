package com.lizheblogs.savedinstancestate.ui.main2;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lizheblogs.savedinstancestate.Main1Activity;
import com.lizheblogs.savedinstancestate.Main2Activity;
import com.lizheblogs.savedinstancestate.R;

public class Main2Fragment extends Fragment {

    private Main2ViewModel mViewModel;

    public static Main2Fragment newInstance() {
        return new Main2Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.e("=============", "Main2Fragment +++onCreateView+++ savedInstanceState=" + (savedInstanceState == null));
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        view.findViewById(R.id.butCrash).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 1 / 0;
            }
        });
        view.findViewById(R.id.but1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Main1Activity.class));
            }
        });
        view.findViewById(R.id.but2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Main2Activity.class));
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Main2ViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.e("=============", "Main2Fragment +++onSaveInstanceState+++ savedInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e("=============", "Main2Fragment +++onViewStateRestored+++ savedInstanceState");
    }

}
