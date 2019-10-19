package com.example.assignment2;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.assignment2.Model.Course;
import com.example.assignment2.Model.Student;
import com.example.assignment2.Model.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDetails extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details);

        int studentIndx = getIntent().getIntExtra("StudentIndex", 0);
        Student s = StudentDB.getInstance().getstudentList().get(studentIndx);

        TextView tv = findViewById(R.id.display_string_id);
        // Display the Person Index
        int s1=studentIndx+1;
        String origStr = (String) tv.getText();
        tv.setText(origStr + s1);
        tv.setTextSize(20);
        TextView fn = findViewById(R.id.fname);

        String orgStr = (String) fn.getText();
        fn.setText(orgStr + s.getFirstname());
        fn.setTextSize(18);

        TextView ln = findViewById(R.id.lname);

        String orglStr = (String) ln.getText();
        ln.setText(orglStr + s.getLastname());
        ln.setTextSize(18);

        TextView cw = findViewById(R.id.cwid);

        String orgcStr = (String) cw.getText();
        cw.setText(orgcStr + s.getCwid());
        cw.setTextSize(18);

        for(int i=0;i<s.getCourseid().size();i++) {

            Course c = s.getCourseid().get(i);

            TextView cid = findViewById(R.id.cid);
            String cis = (String) cid.getText();
            cid.setText(cis + "\n"+ c.getcid());

            cid.setTextSize(18);

            TextView gr = findViewById(R.id.grade);
            String grs = (String) gr.getText();
            gr.setText(grs + "\n" + c.getgrades());
            gr.setTextSize(18);
        }


    }
}
