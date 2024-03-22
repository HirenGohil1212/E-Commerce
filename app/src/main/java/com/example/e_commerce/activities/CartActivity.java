package com.example.e_commerce.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.e_commerce.R;
import com.example.e_commerce.databinding.ActivityCartBinding;
import com.example.e_commerce.databinding.ActivityMainBinding;

public class CartActivity extends AppCompatActivity {


    ActivityCartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}