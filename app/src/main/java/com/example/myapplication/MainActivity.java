package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            BlankFragment myFragment = new BlankFragment();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, myFragment)
                    .commit();
        }
    }

    @Override
    public void onButtonOneClicked() {
        openNewActivity();
    }

    @Override
    public void onButtonTwoClicked() {
        openAnotherActivity();
    }

    private void openNewActivity() {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    private void openAnotherActivity() {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }
}