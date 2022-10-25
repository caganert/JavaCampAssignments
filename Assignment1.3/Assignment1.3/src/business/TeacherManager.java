package business;

import core.logging.Logger;
import dataAccess.TeacherDao;
import entities.Teacher;

public class TeacherManager{
    private TeacherDao teacherDao;
    private Logger[] loggers;
    public TeacherManager(TeacherDao teacherDao, Logger[] loggers){
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }
    public void save(Teacher teacher) {
        System.out.println("Eğitmen eklendi");

        teacherDao.save(teacher);

        for (Logger logger : loggers){
            logger.log(teacher.getFirstName()+""+teacher.getLastName());
        }
    }
    public void delete(Teacher teacher) {
        System.out.println("Eğitmen silindi");

        teacherDao.delete(teacher);

        for (Logger logger : loggers){
            logger.log(teacher.getFirstName()+""+teacher.getLastName());
        }
    }
}
