package com.sugarormtest.sugarormtest;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.orm.SugarApp;
import com.orm.SugarContext;
import com.sugarormtest.sugarormtest.CategoryModel.Category;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Category category  = new Category("ES", "Primero");
        category.save();
//        Category category2 = Category.findById(Category.class, 1l);
        List<Category> categoryList = Category.listAll(Category.class);
        Log.d("sugar", "-->");
//        Toast.makeText(getApplicationContext(), category2.getName(), Toast.LENGTH_LONG).show();
//        Log.d("sugar", category2.getName().toString());
    }
}
