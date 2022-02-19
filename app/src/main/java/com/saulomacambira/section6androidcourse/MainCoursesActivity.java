package com.saulomacambira.section6androidcourse;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    ListView listViewMainCourses;

    String [] mainCoursesList = {"Best Eggs on City", "Miojo Express", "Vegetables and more Vegetables", "The BodyBuilder Meal", "Cake of Whey Protein"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        attachingWidgetsToFields();
        fillUpListView();
    }

    private void attachingWidgetsToFields(){
        listViewMainCourses = findViewById(R.id.list_view_main_courses);
    }

    private void fillUpListView(){
        ArrayAdapter<String> arrayAdapterMainCourses = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCoursesList);

        listViewMainCourses.setAdapter(arrayAdapterMainCourses);

    }
}
