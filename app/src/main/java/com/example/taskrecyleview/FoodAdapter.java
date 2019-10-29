package com.example.taskrecyleview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private ArrayList<Food> foods;
    private Context context;

    public FoodAdapter(ArrayList<Food> foods, Context context) {
        this.foods = foods;
        this.context = context;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.food_item, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final FoodViewHolder holder, final int position) {
        holder.tv_name.setText(foods.get(position).getName());
        holder.tv_desctiption.setText(foods.get(position).getDescription());
        holder.tv_price.setText(foods.get(position).getPrice().toString());
        holder.iv_photo.setImageResource(foods.get(position).getPhoto());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(context, FoodActivity.class);

                bundle.putString("name", foods.get(position).getName());
                bundle.putString("price", foods.get(position).getPrice().toString());
                bundle.putString("description", foods.get(position).getDescription());
                bundle.putInt("photo", foods.get(position).getPhoto());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (foods != null) ? foods.size() : 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_desctiption, tv_price;
        private ImageView iv_photo;
        private View view;

        public FoodViewHolder(View view) {
            super(view);
            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_desctiption = (TextView) view.findViewById(R.id.tv_description);
            tv_price = (TextView) view.findViewById(R.id.tv_price);
            iv_photo = (ImageView) view.findViewById(R.id.iv_photo);
            this.view = view;
        }
    }
}
