package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.JdbcCategoryDao;
import entities.Category;
import entities.Course;

public class CategoryManager{
    private CategoryDao categoryDao;
    private Logger[] loggers;
    public CategoryManager(CategoryDao categoryDao, Logger[] loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void save(Category category) throws Exception{
        if(categoryDao.findByName(category.getCategoryName())!=null){
            throw new Exception("Kategori ismi tekrar edemez") ;
        }

        categoryDao.save(category);

        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }

    public void delete(Category category) {

        categoryDao.delete(category);

        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }
}
