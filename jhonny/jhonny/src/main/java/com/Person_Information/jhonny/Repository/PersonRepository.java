package com.Person_Information.jhonny.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Person_Information.jhonny.Models.Person;

// public interface PersonRepository extends JpaRepository<Person,Long>
// {
//     List<Person> findByAge(int age);

//     List<Person> findByTitleContaining(String UserName);
    
// }
public interface PersonRepository extends JpaRepository<Person,Integer> {
    List<Person> findByAge(int age);
  
    List<Person> findByUserName(String UserName);
  }