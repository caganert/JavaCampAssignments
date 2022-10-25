package dataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
    @Override
    public void save(Teacher teacher) {
        System.out.println("Eğitmen JDBC ile veritabanına kaydedildi");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Eğitmen JDBC ile veritabanından silindi");
    }
}
