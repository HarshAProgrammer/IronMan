package com.android.stark;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private final Context mContext;
    private final List<ProductData> myProductList;
    private int lastPosition = -1;


    public MyAdapter(Context mContext, List<ProductData> myProductList) {
        this.mContext = mContext;
        this.myProductList = myProductList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_item,viewGroup,false);
        return new ProductViewHolder(mView);


    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder productViewHolder, int i) {
        productViewHolder.imageView.setImageResource(myProductList.get(i).getProductImage());
        productViewHolder.mTitle.setText(myProductList.get(i).getProductName());
        productViewHolder.mDescription.setText(myProductList.get(i).getProductDescription());
        productViewHolder.mPrice.setText(myProductList.get(i).getProductPrice());

        productViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDetailActivityFromMContext = new Intent(mContext, DetailActivity.class);
                openDetailActivityFromMContext.putExtra("Image", myProductList.get(productViewHolder.getAdapterPosition()).getProductImage());
                openDetailActivityFromMContext.putExtra("Description", myProductList.get(productViewHolder.getAdapterPosition()).getProductDescription());
                mContext.startActivity(openDetailActivityFromMContext);
            }
        });

        setAnimation(productViewHolder.itemView,i);
    }
    public void setAnimation(View viewToAnimate,int position){
        if(position>lastPosition){
            ScaleAnimation MainActivityAnimation = new ScaleAnimation(0.0f,1.0f,0.0f,1.0f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            MainActivityAnimation.setDuration(350);
            viewToAnimate.startAnimation(MainActivityAnimation);
            lastPosition = position;
        }


    }

    @Override
    public int getItemCount() {
        return myProductList.size();
    }
}

class ProductViewHolder extends RecyclerView.ViewHolder {
    final ImageView imageView;
    final TextView mTitle;
    final TextView mDescription;
    final TextView mPrice;
    final CardView mCardView;

    public ProductViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivRecyclerRowItemImage);
        mTitle = itemView.findViewById(R.id.tvRecyclerRowItemTitle);
        mDescription = itemView.findViewById(R.id.tvRecyclerRowItemDescription);
        mPrice = itemView.findViewById(R.id.tvRecyclerRowItemPrice);
        mCardView = itemView.findViewById(R.id.cvRecyclerRowItemCard);


    }
}
