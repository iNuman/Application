package com.abdullah.books.ui.home.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.abdullah.books.R;
import com.abdullah.books.adapter.ProductDetailsViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class ProductDetailsActivity extends AppCompatActivity {

    ProductDetailsViewPagerAdapter sectionsPagerAdapter;
    TabLayout tabs;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_description_layout);

        sectionsPagerAdapter = new ProductDetailsViewPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.product_details_viewpager);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);



    }
}
