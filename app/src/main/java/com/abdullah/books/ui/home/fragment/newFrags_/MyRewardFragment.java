package com.abdullah.books.ui.home.fragment.newFrags_;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.adapter.newAdapters_.MyRewardsAdapter;
import com.abdullah.books.model.RewardModel;

import java.util.ArrayList;
import java.util.List;

public class MyRewardFragment extends Fragment {

    public MyRewardFragment(){

    }
    private RecyclerView rewardsRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_rewards,container,false);

        rewardsRecyclerView = view.findViewById(R.id.my_reward_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rewardsRecyclerView.setLayoutManager(layoutManager);


        List<RewardModel> rewardmodelList = new ArrayList<>();
        rewardmodelList.add(new RewardModel("Cashback","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("Discount","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("Cashback","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("Offer","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("BUY1GET1","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("Cashback","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("BUY3GET6","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));
        rewardmodelList.add(new RewardModel("Cashback","Valid till 22 june, 2020","GET 20% CASHBACK on any product above Rs.1000/- and below Rs.3000/-"));


        MyRewardsAdapter myRewardsAdapter = new MyRewardsAdapter(rewardmodelList);
        rewardsRecyclerView.setAdapter(myRewardsAdapter);
        myRewardsAdapter.notifyDataSetChanged();

        return view;

    }
}
