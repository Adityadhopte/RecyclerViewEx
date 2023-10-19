package com.example.recyclerviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewex.adapter.MyCustomAdapter;
import com.example.recyclerviewex.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<CarModel> carModelList;

    MyCustomAdapter myCustomAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);

        carModelList = new ArrayList<>();


        CarModel c1 = new CarModel("Audi" ,R.drawable.b);
        CarModel c2 = new CarModel("Audi" ,R.drawable.f);
        CarModel c3 = new CarModel("Audi" ,R.drawable.d);
        CarModel c4 = new CarModel("Audi" ,R.drawable.j);
        CarModel c5 = new CarModel("Audi" ,R.drawable.d);
        CarModel c6 = new CarModel("Audi" ,R.drawable.j);
        CarModel c7 = new CarModel("Audi" ,R.drawable.b);
        CarModel c8 = new CarModel("Audi" ,R.drawable.f);

        carModelList.add(c1);
        carModelList.add(c2);
        carModelList.add(c3);
        carModelList.add(c4);
        carModelList.add(c5);
        carModelList.add(c6);
        carModelList.add(c7);
        carModelList.add(c8);

        myCustomAdapter = new MyCustomAdapter(carModelList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);


    }
}