package com.example.assignment2.Model;

public class Course {
    protected String midcourse;
    protected String mGrade;

    public Course(String cid, String gr) {
        midcourse = cid;
        mGrade = gr;
    }



    public String getcid() {
        return midcourse;
    }

    public void setcid(String c) {
        midcourse = c;
    }

    public String getgrades() {
        return mGrade;
    }

    public void setgrades(String g) {
        mGrade = g;
    }
}


