package com.gayatri.jobapplication;

import com.gayatri.jobapplication.models.Student;
import com.gayatri.jobapplication.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private Studentservice service;

    @GetMapping({"/","/home"})
    public String home(){
        return "Home";
    }
    @GetMapping("/allstudents")
    public String allstudents(Model m){
        List<Student>  students=service.getallstudents();
        m.addAttribute("students",students);
        return "Allstudents";
    }

    @GetMapping("/studentform")
    public String studentForm() {
        return "Studentform";
    }

    @PostMapping("/handleform")
    public String addstudent( Student s ){
        service.addstudent(s);
        return "redirect:/allstudents";
    }


}
