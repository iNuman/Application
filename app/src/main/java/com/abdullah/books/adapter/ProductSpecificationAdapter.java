package com.abdullah.books.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abdullah.books.R;
import com.abdullah.books.model.ProductSpecificationModel;

import java.util.List;

public class ProductSpecificationAdapter extends RecyclerView.Adapter<ProductSpecificationAdapter.productViewHolder> {

    private List<ProductSpecificationModel> productSpecificationModelList;
    private Context context;

    public ProductSpecificationAdapter(Context context, List<ProductSpecificationModel> productSpecificationModelList) {
        this.productSpecificationModelList = productSpecificationModelList;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        switch (productSpecificationModelList.get(position).getType()) {
            case 0:
                return ProductSpecificationModel.SPECIFICATION_TITLE;
            case 1:
                return ProductSpecificationModel.SPECIFICATION_BODY;
            default:
                return -1;
        }
    }

    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        switch (viewType) {
            case ProductSpecificationModel.SPECIFICATION_TITLE:
                TextView title = new TextView(viewGroup.getContext());
                title.setTypeface(null, Typeface.BOLD);
                title.setTextColor(Color.parseColor("#FFFFFF"));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(setDP(16, viewGroup.getContext())
                        , setDP(16, viewGroup.getContext()),
                        setDP(16, viewGroup.getContext()),
                        setDP(8, viewGroup.getContext()));

                title.setLayoutParams(layoutParams);
                return new productViewHolder(title);

            case ProductSpecificationModel.SPECIFICATION_BODY:
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_specification_item_layout, viewGroup, false);
                return new productViewHolder(view);
            default:
                return null;

        }

    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder productViewHolder, int position) {

        switch (productSpecificationModelList.get(position).getType()) {
            case ProductSpecificationModel.SPECIFICATION_TITLE:
                productViewHolder.setTitle(productSpecificationModelList.get(position).getTitle());

            case ProductSpecificationModel.SPECIFICATION_BODY:
                String featureTitle = productSpecificationModelList.get(position).getFeatureName();
                String featureDetail = productSpecificationModelList.get(position).getFeatureValue();
                productViewHolder.setFeatures(featureTitle, featureDetail);

        }


    }


    @Override
    public int getItemCount() {
        return productSpecificationModelList.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {

        private TextView featureName;
        private TextView featureValue;
        private TextView title;


        public productViewHolder(@NonNull View itemView) {
            super(itemView);


        }

        private void setTitle(String titleText) {
            title = (TextView) itemView;
            title.setText(titleText);
        }

        private void setFeatures(String featureTitle, String featureDetail) {

            featureName = itemView.findViewById(R.id.f_name);
            featureValue = itemView.findViewById(R.id.f_value);
            try {
                featureName.setText(featureTitle);
                featureValue.setText(featureDetail);
            } catch (Exception e) {
                /*
                * Whenever 0 ViewType call then at that time
                * this method starts adding values to add that view which is not
                * part of the current layout Row
                * To avoid this Exception did a little hack of try catch there'll be
                * solutions but for now it did work
                 */
                Log.d("TAG", "productViewHolder: " + e.getLocalizedMessage());
            }

        }
    }

    private int setDP(int dp, Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());

    }

}
