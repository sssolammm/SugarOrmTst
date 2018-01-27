package com.sugarormtest.sugarormtest.CategoryModel;

import com.orm.SugarRecord;
import com.orm.dsl.Column;
import com.orm.dsl.Table;

/**
 * Created by david.benito on 25/01/2018.
 */

@Table(name="category")
public class Category extends SugarRecord {

    @Column(name="lang")
    private String language;

    @Column(name="name_category")
    private String name_category;

    public Category(){

    }

    public Category(String language, String name_category) {
        this.name_category = name_category;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }
}
