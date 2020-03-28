package com.xiaochen.beatles.pojo;

import lombok.ToString;

import javax.persistence.*;

/**
 * 课程表
 */
@ToString
@Entity
@Table(name = "course")
public class Course {
    private int courseid;
    private String coursename;
    private String coursehours;
    private String coursecredit;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Column(name = "course_name")
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Column(name = "course_hours")
    public String getCoursehours() {
        return coursehours;
    }

    public void setCoursehours(String coursehours) {
        this.coursehours = coursehours;
    }

    @Column(name = "course_credit")
    public String getCoursecredit() {
        return coursecredit;
    }

    public void setCoursecredit(String coursecredit) {
        this.coursecredit = coursecredit;
    }

}
