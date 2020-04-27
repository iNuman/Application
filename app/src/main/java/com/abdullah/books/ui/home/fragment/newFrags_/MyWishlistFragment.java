package com.abdullah.books.ui.home.fragment.newFrags_;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.newAdapters_.WishlistAdapter;
import com.abdullah.books.model.WishlistModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyWishlistFragment extends Fragment {

    public MyWishlistFragment() {
        // Required empty public constructor
    }

    private RecyclerView wishlistRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_wishlist, container, false);
        wishlistRecyclerView = view.findViewById(R.id.my_wishlist_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        wishlistRecyclerView.setLayoutManager(linearLayoutManager);

        List<WishlistModel> wishlistModelList = new ArrayList<>();

        wishlistModelList.add(new WishlistModel(R.drawable.phone3,"Pixel 3X",0, "3",145,"Rs.45000","Rs.55000","COD"));
        wishlistModelList.add(new WishlistModel(R.drawable.phone3,"Pixel 3X",1, "7",145,"Rs.45000","Rs.55000","COD"));
        wishlistModelList.add(new WishlistModel(R.drawable.phone3,"Pixel 3X",2, "7",145,"Rs.45000","Rs.55000","COD"));
        wishlistModelList.add(new WishlistModel(R.drawable.phone3,"Pixel 3X",2, "5",145,"Rs.45000","Rs.55000","COD"));
        wishlistModelList.add(new WishlistModel(R.drawable.phone3,"Pixel 3X",4, "4",145,"Rs.45000","Rs.55000","COD"));

        WishlistAdapter wishlistAdapter = new WishlistAdapter(wishlistModelList);
        wishlistRecyclerView.setAdapter(wishlistAdapter);
        wishlistAdapter.notifyDataSetChanged();

        return view;

    }
}

