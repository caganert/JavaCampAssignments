package dataAccess;

import entities.Teacher;

public interface TeacherDao {
    void save(Teacher teacher);
    void delete(Teacher teacher);
}
