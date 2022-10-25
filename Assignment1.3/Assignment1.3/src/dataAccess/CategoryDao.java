package dataAccess;

import entities.Category;

public interface CategoryDao {
    void save(Category category);
    void delete(Category category);

    Category findByName(String categoryName);
}
