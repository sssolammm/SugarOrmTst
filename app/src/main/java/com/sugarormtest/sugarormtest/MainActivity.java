package com.sugarormtest.sugarormtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.orm.SugarApp;
import com.orm.SugarContext;
import com.sugarormtest.sugarormtest.CategoryModel.Category;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Category category  = new Category("ES", "Primero");
        category.save();

        Category category2 = Category.findById(Category.class, 1l);
        Toast.makeText(getApplicationContext(), category2.getName(), Toast.LENGTH_LONG).show();
    }
}
