package com.abdullah.books.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.CategoryAdapter;
import com.abdullah.books.adapter.HomePageAdapter;
import com.abdullah.books.model.CategoryModel;
import com.abdullah.books.model.HomePageModel;
import com.abdullah.books.model.HorizontalProductScrollModel;
import com.abdullah.books.model.SliderModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        categoryRecyclerView = view.findViewById(R.id.category_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        final List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link", "Home"));
        categoryModelList.add(new CategoryModel("link", "Electronics"));
        categoryModelList.add(new CategoryModel("link", "Appliances"));
        categoryModelList.add(new CategoryModel("link", "Furniture"));
        categoryModelList.add(new CategoryModel("link", "Fashion"));
        categoryModelList.add(new CategoryModel("link", "Toys"));
        categoryModelList.add(new CategoryModel("link", "Sports"));
        categoryModelList.add(new CategoryModel("link", "Wall Arts"));
        categoryModelList.add(new CategoryModel("link", "Books"));
        categoryModelList.add(new CategoryModel("link", "Shoes"));

        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();


        ////////////////////////Banner Slider

        List<SliderModel> sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel((R.mipmap.banner1)));//l t c i s
        sliderModelList.add(new SliderModel((R.mipmap.banner2)));//last two copied including shift
        sliderModelList.add(new SliderModel((R.mipmap.banner3)));//shifted above

        sliderModelList.add(new SliderModel((R.mipmap.banner4)));
        sliderModelList.add(new SliderModel((R.mipmap.banner2)));
        sliderModelList.add(new SliderModel((R.mipmap.banner1)));
        sliderModelList.add(new SliderModel((R.mipmap.banner3)));
        sliderModelList.add(new SliderModel((R.mipmap.banner4)));
        sliderModelList.add(new SliderModel((R.mipmap.banner1)));

        sliderModelList.add(new SliderModel((R.mipmap.banner2)));//shifted below
        sliderModelList.add(new SliderModel((R.mipmap.banner3)));//first two copied inccluding shifted
        sliderModelList.add(new SliderModel((R.mipmap.banner4)));//                "


        ///////////////////////Banner Slider


        /////////////////////Horizontal Product Layout


        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();

        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone1, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone2, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone3, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone4, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone1, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone2, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone3, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone4, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.phone4, "Redmi 5A", "SP 625 Processor", "Rs. 5999/-"));

        /////////////////////Horizontal Product Layout


        //---//--------///
        testing = view.findViewById(R.id.home_page_recyclerView);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        //---//--------///
        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.donut, "#000000"));
        homePageModelList.add(new HomePageModel(2, "Deals of the day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "Deals of the day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.donut, "#ffff00"));
        homePageModelList.add(new HomePageModel(3, "Deals of the day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "Deals of the day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.mipmap.banner5, "#ffff00"));
        homePageModelList.add(new HomePageModel(0, sliderModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList, getContext());
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        return view;
    }
}