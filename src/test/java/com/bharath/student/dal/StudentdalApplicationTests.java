package com.bharath.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repos.StudentRepository;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCreateStudent() {

        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Web Services");
        student.setFee(30d);

        studentRepository.save(student);

    }


    @Test
    public void testFindStudentById(){

        Optional<Student> student = studentRepository.findById(2l);
        System.out.println(student);
    }

    @Test
    public void testUpdateStudent(){

        Student student = studentRepository.findById(3l).get();
        student.setFee(40d);
        studentRepository.save(student);

    }

    @Test
    public void testDeleteStudent(){

        Student student= new Student();
        student.setId(3l);
        studentRepository.delete(student);


    }


}








