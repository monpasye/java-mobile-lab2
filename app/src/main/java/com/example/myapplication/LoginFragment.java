package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    public interface OnLoginFragmentListener {
        void onLoginSuccess();
        void onCancel();
    }

    private OnLoginFragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnLogin = view.findViewById(R.id.btn_login);
        Button btnCancel = view.findViewById(R.id.btn_cancel);

        btnLogin.setOnClickListener(v -> {
            if (listener != null) listener.onLoginSuccess();
        });

        btnCancel.setOnClickListener(v -> {
            if (listener != null) listener.onCancel();
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnLoginFragmentListener) {
            listener = (OnLoginFragmentListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}