package com.gayatri.jobapplication.service;

import com.gayatri.jobapplication.models.Student;
import com.gayatri.jobapplication.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Studentservice {
    @Autowired
    private StudentRepo repo;

    public void addstudent(Student s){
        repo.addstudent(s);

    }
    public List<Student> getallstudents(){

        return repo.allstudents();

    }
}
