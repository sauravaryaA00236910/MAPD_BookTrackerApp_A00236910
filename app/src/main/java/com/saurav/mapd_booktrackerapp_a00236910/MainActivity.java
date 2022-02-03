package com.saurav.mapd_booktrackerapp_a00236910;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.saurav.mapd_booktrackerapp_a00236910.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    view binding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}