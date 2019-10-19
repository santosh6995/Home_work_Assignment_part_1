package com.example.assignment2.Model;

import java.util.ArrayList;

public class StudentDB {

    private static final StudentDB myinstance = new StudentDB();

    private ArrayList<Student> mStudent;

    static public StudentDB getInstance(){
        return myinstance;
    }

    private StudentDB(){

    }

    public ArrayList<Student> getstudentList() {
        return mStudent;
    }

    public void setstudentist(ArrayList<Student> StudentList) {
        mStudent  = StudentList;
    }


}
