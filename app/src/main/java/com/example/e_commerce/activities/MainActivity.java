package com.example.e_commerce.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import com.example.e_commerce.R;
import com.example.e_commerce.adapters.CategoryAdapter;
import com.example.e_commerce.databinding.ActivityMainBinding;
import com.example.e_commerce.model.Category;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        categories = new ArrayList<>();
        categories.add(new Category("Organic Vegetables","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fvegetable_10107601&psig=AOvVaw2_uE_mwdk_I_jLwq87mlex&ust=1711095837249000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCPDWz-j2hIUDFQAAAAAdAAAAABAE","#18ab4e","Some Palak and Methi",1));
        categories.add(new Category("Organic Vegetables","","#18ab4e","Some Palak and Methi",1));
        categories.add(new Category("Organic Vegetables","","#18ab4e","Some Palak and Methi",1));
        categories.add(new Category("OrganicVeg etables","","#18ab4e","Some Palak and Methi",1));
        categories.add(new Category("Organic Vegetables","","#18ab4e","Some Palak and Methi",1));
        categories.add(new Category("Organic Vegetables","","#18ab4e","Some Palak and Methi",1));
        categoryAdapter = new CategoryAdapter(this, categories);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 4);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);



    }
}