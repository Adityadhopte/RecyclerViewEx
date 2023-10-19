package com.example.recyclerviewex.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewex.R;
import com.example.recyclerviewex.model.CarModel;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.CarViewHolder> {

    List<CarModel> carModelList;

    public MyCustomAdapter(List<CarModel> carModelList) {
        this.carModelList = carModelList;
    }


    @NonNull
    @Override
    public MyCustomAdapter.CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new CarViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.CarViewHolder holder, int position) {

        CarModel carModel = carModelList.get(position);

        holder.textView.setText(carModel.getCarName());
        holder.imageView.setImageResource(carModel.getCarImage());

    }

    @Override
    public int getItemCount() {
        return carModelList.size();
    }


    public  static  class CarViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
