package com.example.practica;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class Principal extends Fragment {



    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        View view = inflater.inflate(R.layout.principal, container, false);

        MaterialButton entrar = view.findViewById(R.id.entrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((NavigationHost) getActivity()).navigateTo(new Home(),false);
            }
        });

        return view;

    }
}
