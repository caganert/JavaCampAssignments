import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher1 = new Teacher(1,"Engin", "Demiroğ", new String[]{"MCT","PMP","ITIL","B sınıfı düğün şoförlüğü :D"});
        Course course1 = new Course(1,"Java Kursu 2022", 100,1);
        Course course2 = new Course(2,"Java Kursu 2022", 200,1);
        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2,"Programlama");
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
        /* Farklı servisler için farklı logger'lar istenirse ayrı kendi logger setleri gönderilebilir

           TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), new Logger[]{new DatabaseLogger()});

        */
        teacherManager.save(teacher1);
        teacherManager.delete(teacher1);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.save(course1);
        courseManager.save(course2); //output: Kurs ismi tekrar edemez
        courseManager.delete(course1);
        courseManager.save(course2); //yeniden ekleme denemesi

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.save(category1);
        categoryManager.save(category2); //output: Kurs ismi tekrar edemez
        categoryManager.delete(category1);
        categoryManager.save(category2); //yeniden ekleme denemesi
    }
}