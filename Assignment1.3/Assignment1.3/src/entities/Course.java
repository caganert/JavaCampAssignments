package entities;

import java.util.List;

public class Course {

    public static List<String> courses;
    private int id;
    private String courseName;
    private int coursePrice;
    private int categoryId;

    public Course(int id, String courseName, int coursePrice, int categoryId){
        this.id = id;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.categoryId = categoryId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }
    public String getCourseName() {
        return courseName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }





}
