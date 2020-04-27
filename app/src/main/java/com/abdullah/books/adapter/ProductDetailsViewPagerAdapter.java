package com.abdullah.books.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.abdullah.books.R;

import com.abdullah.books.ui.home.fragment.ProductDescriptionFragment;
import com.abdullah.books.ui.home.fragment.ProductSpecificationFragment;

public class ProductDetailsViewPagerAdapter extends FragmentPagerAdapter {


    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3};

    private final Context mContext;

    public ProductDetailsViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                ProductSpecificationFragment productSpecificationFragment1 = new ProductSpecificationFragment();
                return productSpecificationFragment1;
            case 1:
                ProductSpecificationFragment productSpecificationFragment = new ProductSpecificationFragment();
                return productSpecificationFragment;
            case 2:
                ProductDescriptionFragment productDescriptionFragment2 = new ProductDescriptionFragment();
                return productDescriptionFragment2;
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 3;

    }
}
