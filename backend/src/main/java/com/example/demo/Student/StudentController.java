package com.example.demo.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.Date;
import java.time.LocalDate;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
    @Autowired     private StudentRepository studentRepository;


    StudentController(StudentRepository studentRepository){

        this.studentRepository = studentRepository;
    }

   
    @GetMapping("/student")
    public List<Student> getStudent(){
        return (List<Student>) studentRepository.findAll();
    }

}

