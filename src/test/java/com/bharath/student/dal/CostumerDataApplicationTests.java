package com.bharath.student.dal;

import com.bharath.student.dal.entities.Costumer;
import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repos.CostumerRepository;
import com.bharath.student.dal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CostumerDataApplicationTests {

    @Autowired
    private CostumerRepository costumerRepository;

    @Test
    public void testCreateCostumer() {

        Costumer costumer = new Costumer();
        costumer.setName("John");
        costumer.setEmail("aaa@hotmail.com");
        costumerRepository.save(costumer);

    }


    @Test
    public void testFindCostumertById(){

        Optional<Costumer> costumer = costumerRepository.findById(1l);
        System.out.println(costumer);
    }

    @Test
    public void testUpdateCostumer(){
        Costumer costumer = costumerRepository.findById(1l).get();
        costumer.setEmail("newmail@yahoo.com");
    }



}








