package com.abdullah.books.ui.home.fragment.newFrags_;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.newAdapters_.CartAdapter;
import com.abdullah.books.model.CartItemModel;
import com.abdullah.books.ui.home.activity_.AddAddressActivity;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    public MyCartFragment() {
        // Required empty public constructor
    }

    private Button continueBtn;
    private RecyclerView cartItemsRecyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        cartItemsRecyclerView = view.findViewById(R.id.cart_items_recyclerview);
        continueBtn = view.findViewById(R.id.cart_continue_btn);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartItemsRecyclerView.setLayoutManager(layoutManager);

        List<CartItemModel> cartItemModelList = new ArrayList<>();
        cartItemModelList.add(new CartItemModel(0, R.drawable.phone1, "Pixel 21", 2, "Rs.49999/-", "Rs.59999/-", 5, 0, 0));
        cartItemModelList.add(new CartItemModel(0, R.drawable.phone3, "Pixel 21", 0, "Rs.49999/-", "Rs.59999/-", 5, 1, 0));
        cartItemModelList.add(new CartItemModel(0, R.drawable.phone4, "Pixel 21", 2, "Rs.49999/-", "Rs.59999/-", 5, 2, 0));
        cartItemModelList.add(new CartItemModel(1, "Price (3 items)", "Rs.999990/-", "Free", "Rs.169999", "You saved Rs.50000/- on this order"));

        CartAdapter cartAdapter = new CartAdapter(cartItemModelList);
        cartItemsRecyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryIntent = new Intent(getContext(), AddAddressActivity.class);
                getContext().startActivity(deliveryIntent);
            }
        });

        return view;
    }
}
