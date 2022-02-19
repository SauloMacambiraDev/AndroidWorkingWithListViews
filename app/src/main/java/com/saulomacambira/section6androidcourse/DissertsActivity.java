package com.saulomacambira.section6androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DissertsActivity extends AppCompatActivity {
    ListView listViewMainDisserts;
    ListView listViewSweetDisserts;

    String [] mainDishesArray = {"Cuscuz & Ground Beef", "Tapioca with Ground Beef and Cheese", "Omelete followed with GroundBeef, Cheese, and Tomatoes"};
    String [] sweetDishesArray = {"Milkshake with Black Coffe and Whey Protein", "Cupcake with Whey Protein, Coffe and Banana", "Cake made by Hypercaloric"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disserts);
        initializingFields();
        fillUpListViews();

    }

    private void initializingFields(){
        listViewMainDisserts = findViewById(R.id.list_view_main_disserts);
        listViewSweetDisserts = findViewById(R.id.list_view_sweet_disserts);
    }

    private void fillUpListViews(){
        listViewMainDisserts.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainDishesArray));
        listViewSweetDisserts.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sweetDishesArray));
    }
}