package com.abdullah.books.ui.home.fragment.newFrags_;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.newAdapters_.MyOrderAdapter;
import com.abdullah.books.model.MyOrderItemModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyOrdersFragment extends Fragment {

    public MyOrdersFragment() {
        // Required empty public constructor
    }

    private RecyclerView myOrdersRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);

        myOrdersRecyclerView = view.findViewById(R.id.my_orders_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myOrdersRecyclerView.setLayoutManager(layoutManager);

        List<MyOrderItemModel> myOrderItemModelList = new ArrayList<>();
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.phone1, 2,"Pixel 2xl(Black)", "Delivered on Tue, 15 Jan 2020"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.phone2, 1, "Pixel 2xl(Black)", "Delivered on Tue, 15 Jan 2020"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.phone3, 4, "Pixel 2xl(Black)", "Delivered on Tue, 15 Jan 2020"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.phone4, 0, "Pixel 2xl(Black)", "Delivered on Tue, 15 Jan 2020"));

        MyOrderAdapter myOrderAdapter = new MyOrderAdapter(myOrderItemModelList);
        myOrdersRecyclerView.setAdapter(myOrderAdapter);
        myOrderAdapter.notifyDataSetChanged();

        return view;


    }
}