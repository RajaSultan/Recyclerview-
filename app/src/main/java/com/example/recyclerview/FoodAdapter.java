package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.viewHolder> {
    ArrayList<FoodClass> foods = new ArrayList<>();
    Context context;

    public FoodAdapter(ArrayList<FoodClass> foods, Context context) {
        this.foods = foods;
        this.context = context;
    }


    @NonNull
    @Override
    public FoodAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.viewHolder holder, int position) {
        FoodClass foodClass = foods.get(position);
        holder.imageView.setImageResource(foodClass.getImages());
        holder.t1.setText(foodClass.getName());

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView t1;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView2);
            t1 = itemView.findViewById(R.id.textView);
        }
    }
}
