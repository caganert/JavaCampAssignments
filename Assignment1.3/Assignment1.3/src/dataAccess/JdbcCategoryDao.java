package dataAccess;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements CategoryDao{
    private List<Category> categories  = new ArrayList<>();//Veri tabanı simülasyonu
    @Override
    public void save(Category category) {
        System.out.println("Kategori JDBC ile veritabanına kaydedildi");
        categories.add(category);
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori JDBC ile veritabanından silindi");
        categories.removeIf(c -> c.getId()==(category.getId()));
    }

    @Override
    public Category findByName(String categoryName) {
        if(categories.size()>0){
            for (Category category : categories) {
                if (category.getCategoryName().equals(categoryName)) {
                    return category;
                }
            }
        }
        return null;
    }
}
