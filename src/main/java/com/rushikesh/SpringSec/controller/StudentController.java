package com.rushikesh.SpringSec.controller;

import com.rushikesh.SpringSec.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Rushi", 44),
            new Student(2, "Amit", 78),
            new Student(3, "Priya", 85),
            new Student(4, "Sneha", 67)
    ));
    @GetMapping("/students")
    public List<Student>getStudents(){
    return students;
    }
    @PostMapping("/students")
    public List<Student> saveStudent(@RequestBody Student request)
    {
        students.add(request);
        return students;
    }
    @GetMapping("/csrf")
    public CsrfToken getcsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
