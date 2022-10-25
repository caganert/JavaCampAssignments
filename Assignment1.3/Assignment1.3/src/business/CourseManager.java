package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import javax.swing.*;
import java.util.function.Predicate;

public class CourseManager{
    private CourseDao courseDao;
    private Logger[] loggers;
    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void save(Course course)throws Exception{
        if(courseDao.findByName(course.getCourseName())!=null){
            throw new Exception("Kurs ismi tekrar edemez") ;
        }

        courseDao.save(course);

        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

    public void delete(Course course) {

        courseDao.delete(course);

        for (Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }
}
