package com.gayatri.jobapplication.repo;

import com.gayatri.jobapplication.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class StudentRepo {

    List<Student> students=new ArrayList<>(Arrays.asList(
            new Student(1,"Gayatri","pune"),
            new Student(2,"Pooja","Sangamner"),
            new Student(3,"Neha","mumbai")
    ));
    public List<Student> allstudents(){
        return students;
    }
    public void addstudent(Student s){
        students.add(s);
        System.out.println(students);
    }
}
