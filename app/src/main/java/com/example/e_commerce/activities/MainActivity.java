package com.example.e_commerce.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import android.os.Bundle;
import com.example.e_commerce.adapters.CategoryAdapter;
import com.example.e_commerce.adapters.ProductAdapter;
import com.example.e_commerce.databinding.ActivityMainBinding;
import com.example.e_commerce.model.Category;
import com.example.e_commerce.model.Product;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;


    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();
        initProducts();
        initSlider();
    }

    private void initSlider() {
        binding.carousel.addData(new CarouselItem("",""));
        binding.carousel.addData(new CarouselItem("",""));
        binding.carousel.addData(new CarouselItem("",""));

    }

    void initCategories(){
        categories = new ArrayList<>();
        categories.add(new Category("Organic Vegetables","","","Some Palak and Methi",1));
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

    void initProducts(){
        products = new ArrayList<>();
        products.add(new Product("Methi From Surat","","",12,12,1,1));
        products.add(new Product("Methi From Surat","","",12,12,1,1));
        products.add(new Product("Methi From Surat","","",12,12,1,1));
        products.add(new Product("Methi From Surat","","",12,12,1,1));
        productAdapter = new ProductAdapter(this, products);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);




    }
}