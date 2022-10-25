package entities;

import java.util.List;

public class Category {
    public Category(int id, String categoryName){
        this.id = id;
        this.categoryName = categoryName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    private int id;
    private String categoryName;
}
