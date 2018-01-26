package com.sugarormtest.sugarormtest.CategoryModel;

import com.orm.SugarRecord;

/**
 * Created by david.benito on 25/01/2018.
 */

public class Category extends SugarRecord {

    private String language;
    private String name;

    public Category(){

    }

    public Category(String language, String primero) {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
