package com.example.demo.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public 
interface StudentRepository extends  CrudRepository<Student, Long>{    
    Student findById(long number);
  
}
