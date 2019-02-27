package com.hand.springboot_demo02.controller;

import com.hand.springboot_demo02.mapper.StudentMapper;
import com.hand.springboot_demo02.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model) {
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students",students);
        return "listStudent";
    }

}
