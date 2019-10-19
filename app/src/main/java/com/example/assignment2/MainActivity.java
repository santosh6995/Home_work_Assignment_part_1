package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.assignment2.Model.Course;
import com.example.assignment2.Model.Student;
import com.example.assignment2.Model.StudentDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.student_list);


        root = findViewById(R.id.student_list);

        createStudentobject();
        ArrayList<Student> studentlist = StudentDB.getInstance().getstudentList();

        for (int i=0;i<studentlist.size();i++){
            System.out.println(i);
            Student s = studentlist.get(i);

            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, root, false);

            ((TextView) row_view.findViewById(R.id.first_name)).setText(s.getFirstname());
            ((TextView) row_view.findViewById(R.id.last_name)).setText(s.getLastname());
            ((TextView) row_view.findViewById(R.id.cwid)).setText(String.valueOf(s.getCwid()));
            root.addView(row_view);




        }



    }

    protected void createStudentobject(){



        Student student = new Student("santosh","Mandava",893236);
        ArrayList<Course> course = new ArrayList<Course>();
        course.add(new Course("CPSC411","A"));
        course.add(new Course("CPSC589","A"));
        student.setCourseid(course);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);

        student = new Student("Vinay", "Manikyam",888933);
        course = new ArrayList<Course>();
        course.add(new Course("CPSC411","A"));
        course.add(new Course("CPSC546","A"));
        student.setCourseid(course);


        students.add(student);

        StudentDB.getInstance().setstudentist(students);


    }
}
