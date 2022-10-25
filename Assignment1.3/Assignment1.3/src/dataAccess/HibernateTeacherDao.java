package dataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
    @Override
    public void save(Teacher teacher) {
        System.out.println("Eğitmen Hibernate ile veritabanına kaydedildi");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Eğitmen Hibernate ile veritabanından silindi");
    }
}
