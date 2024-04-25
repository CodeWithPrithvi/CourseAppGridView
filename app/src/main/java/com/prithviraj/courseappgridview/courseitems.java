package com.prithviraj.courseappgridview;

public class courseitems {
    String courseName;
    int courseImg;

    public courseitems(String courseName, int courseImg) {
        this.courseName = courseName;
        this.courseImg = courseImg;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(int courseImg) {
        this.courseImg = courseImg;
    }
}
