package com.abdullah.books.ui.home.activity_;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.newAdapters_.AddressesAdapter;
import com.abdullah.books.model.AddressesModel;

import java.util.ArrayList;
import java.util.List;

public class MyAddressesActivity extends AppCompatActivity {

    private RecyclerView myAddressesRecyclerView;
    private TextView textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_addresses);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("My Addresses");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        List<AddressesModel> addressesModelList = new ArrayList<>();
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));
        addressesModelList.add(new AddressesModel("Abdullah Taqi", "41 Sheikhpuri Roorkee", "247667"));

        initRecyclerView(addressesModelList);

        textView22 = findViewById(R.id.textView22);
        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddAddressActivity.class));
            }
        });

    }

    private void initRecyclerView(List<AddressesModel> addressesModelList) {
        myAddressesRecyclerView = findViewById(R.id.addresses_recyclerview);
        AddressesAdapter addressesAdapter = new AddressesAdapter(addressesModelList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        myAddressesRecyclerView.setLayoutManager(layoutManager);
        myAddressesRecyclerView.setHasFixedSize(true);
        myAddressesRecyclerView.setAdapter(addressesAdapter);
        addressesAdapter.notifyDataSetChanged();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
