package com.example.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import com.example.assignment2.Adapter.Summaryadapter;
import com.example.assignment2.Model.Course;
import com.example.assignment2.Model.Student;
import com.example.assignment2.Model.StudentDB;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    protected ListView mSummaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.student_list_lv);
        createStudentobject();
        mSummaryView = findViewById(R.id.summary_list_id);
        Summaryadapter ad = new Summaryadapter();
        mSummaryView.setAdapter(ad);

    }

    protected void createStudentobject(){



        Student student = new Student("Santosh","Mandava",893233296);
        ArrayList<Course> course = new ArrayList<Course>();
        course.add(new Course("CPSC411","A"));
        course.add(new Course("CPSC589","A"));
        student.setCourseid(course);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);

        student = new Student("Vinay", "Manikyam",888933213);
        course = new ArrayList<Course>();
        course.add(new Course("CPSC411","A"));
        course.add(new Course("CPSC546","A"));
        student.setCourseid(course);


        students.add(student);

        StudentDB.getInstance().setstudentist(students);
        System.out.println(student.getCourseid());


    }
}
