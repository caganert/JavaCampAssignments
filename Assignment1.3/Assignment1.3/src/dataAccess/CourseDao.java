package dataAccess;

import entities.Course;

public interface CourseDao {
    void save(Course course);
    void delete(Course course);

    Course findByName(String courseName);
}
