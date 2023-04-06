package com.yogeshaswar.androidnavigationframework;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button btnLogin;


        btnLogin = view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener((v) -> {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_loginFragment);
        });



        return view;
    }
}