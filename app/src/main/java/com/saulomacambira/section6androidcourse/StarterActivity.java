package com.saulomacambira.section6androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    ListView listViewStarters;

    Dish [] dishes = {
            new Dish("Mushroom and tofu maki", "O que temos que ter sempre em mente é que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas.", 999),
            new Dish("Bean and courgette soup", "O que temos que ter sempre em mente é que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas.", 999),
            new Dish("Tamarillo and scallop salad", "O que temos que ter sempre em mente é que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas.", 999),
            new Dish("Paprika and beetroot frittersPaprika and beetroot fritters", "O que temos que ter sempre em mente é que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas.", 999),
            new Dish("Onion and olive salad", "O que temos que ter sempre em mente é que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas.", 999),
            new Dish("Squash and black pepper", "O que temos que ter sempre em mente é que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas.", 999)
    };


    String[] fakeDishes = {"Bresaola and mandarine salad",
                            "Tamarillo and scallop salad",
                            "Bean and courgette soup",
                            "Beef and fish stew",
                            "Buttermilk and raisin bread",
                            "Raisin and treacle cookies",
                            "Yoghurt and cocoa cake",
                            "Pepper and parsley bread",
                            "Paprika and beetroot fritters",
                            "Banana and sesame crepes",
                            "Pheasant and kidney casserole",
                            "Squash and black pepper",
                            "Sweetcorn and mustard seed",
                            "Banana and egg bagel",
                            "Salmon and tofu uramaki",
                            "Bean and spinach risotto",
                            "Strawberry and mushroom pancake",
                            "Onion and olive salad",
                            "Cheese and squash lasagne",
                            "Flaxseed and cardamom salad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        attachingWidgetsToFields();
        fillUpListOfDishes();
    }

    private void attachingWidgetsToFields() {
        listViewStarters = findViewById(R.id.list_view_starters);
    }

    private void fillUpListOfDishes(){
//        android.R.layout.simple_list_item_1 Already made layout from Android Native Resources
//        --> <String> is uncecessary, since last paremeter (fakeDishes) indicates the type of <T> generic type
//        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fakeDishes);
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        listViewStarters.setAdapter(dishesAdapter);
    }

}