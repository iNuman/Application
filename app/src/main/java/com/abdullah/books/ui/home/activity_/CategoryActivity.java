package com.abdullah.books.ui.home.activity_;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.HomePageAdapter;
import com.abdullah.books.model.HomePageModel;
import com.abdullah.books.model.HorizontalProductScrollModel;
import com.abdullah.books.model.SliderModel;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getStringExtra("CategoryName");
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        categoryRecyclerView = findViewById(R.id.category_recyclerView);
        categoryRecyclerView = findViewById(R.id.ory_recycler_view);


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




        //---//--------///


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


        initRecyclerView(homePageModelList);


    }

    private void initRecyclerView(List<HomePageModel> homePageModelList) {
        /////////////////////Horizontal Product Layout
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList, this);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.main_search_icon) {

            //todo search
            return true;
        } else if (id == android.R.id.home) {
            finish();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
