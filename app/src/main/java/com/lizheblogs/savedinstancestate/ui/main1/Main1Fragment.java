package com.lizheblogs.savedinstancestate.ui.main1;

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
import android.widget.TextView;

import com.lizheblogs.savedinstancestate.Main1Activity;
import com.lizheblogs.savedinstancestate.Main2Activity;
import com.lizheblogs.savedinstancestate.R;

public class Main1Fragment extends Fragment {

    private Main1ViewModel mViewModel;
    private TextView message;

    public static Main1Fragment newInstance() {
        return new Main1Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.e("=============", "Main1Fragment +++onCreateView+++ savedInstanceState=" + (savedInstanceState == null));
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        message = view.findViewById(R.id.message);
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
        view.findViewById(R.id.but3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText("1===message");
            }
        });
        if (savedInstanceState != null) {
            String mes = savedInstanceState.getString("key");
            Log.e("---------", mes);
            message.setText(mes);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(Main1ViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.e("=============", "Main1Fragment +++onSaveInstanceState+++ savedInstanceState");
        outState.putString("key", message.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e("=============", "Main1Fragment +++onViewStateRestored+++ savedInstanceState");
    }

}
