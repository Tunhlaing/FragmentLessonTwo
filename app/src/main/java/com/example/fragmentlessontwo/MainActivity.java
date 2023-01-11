package com.example.fragmentlessontwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btOne, btTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btOne = findViewById(R.id.btOne);
        btTwo = findViewById(R.id.btTwo);
        handleClick();
    }

    private void handleClick() {
        btOne.setOnClickListener(view -> {
            replaceFragment(new FragmentOne());

        });
        btTwo.setOnClickListener(view -> {
            replaceFragment(new FragmentTwo());

        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment).addToBackStack("");
        fragmentTransaction.commit();



    }
}