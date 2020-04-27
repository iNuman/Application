package com.abdullah.books.ui.home.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.ProductSpecificationAdapter;
import com.abdullah.books.model.ProductSpecificationModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductSpecificationFragment extends Fragment {

    public ProductSpecificationFragment() {
        // Required empty public constructor
    }

    private List<ProductSpecificationModel> productSpecificationModelList;
    private RecyclerView productSpecificationRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_specification, container, false);

        initViews(view);
        initList();
        initRecyclerView(view, productSpecificationModelList);


        return view;
    }

    private void initViews(View view) {

        productSpecificationRecyclerView = view.findViewById(R.id.product_specification_recyclerview);


    }

    private void initList() {

        productSpecificationModelList = new ArrayList<>();
        productSpecificationModelList.add(new ProductSpecificationModel(0, "General"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "Color", "Red"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "Color", "Black"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(0, "First Class"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "Color", "Green"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "Color", "Rose Gold"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(0, "New Check"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "Color", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "Color", "8 GB"));
        productSpecificationModelList.add(new ProductSpecificationModel(1, "RAM", "8 GB"));

    }

    private void initRecyclerView(View view, List<ProductSpecificationModel> productSpecificationModelList) {
        ProductSpecificationAdapter productSpecificationAdapter = new ProductSpecificationAdapter(getContext(),productSpecificationModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        productSpecificationRecyclerView.setLayoutManager(linearLayoutManager);
        productSpecificationRecyclerView.setHasFixedSize(true);
        productSpecificationRecyclerView.setAdapter(productSpecificationAdapter);
        productSpecificationAdapter.notifyDataSetChanged();

    }
}
