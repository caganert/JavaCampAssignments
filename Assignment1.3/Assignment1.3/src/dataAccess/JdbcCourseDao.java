package dataAccess;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    private List<Course> courses = new ArrayList<>();
    @Override
    public void save(Course course) {
        System.out.println("Kurs JDBC ile veritabanına kaydedildi");
        courses.add(course);
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs JDBC ile veritabanından silindi");
        courses.removeIf(c -> c.getId()==(course.getId()));
    }

    @Override
    public Course findByName(String courseName) {
        if(courses.size()>0){
            for (Course course : courses) {
                if (course.getCourseName().equals(courseName)) {
                    return course;
                }
            }
        }
        return null;
    }
}
