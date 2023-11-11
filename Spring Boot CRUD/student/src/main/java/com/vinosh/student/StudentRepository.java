package com.vinosh.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  List<Student> findByName(String name); //Query DSL
  List<Student> findByNameOrderByIdDesc(String name);
  List<Student> findByNameOrderByIdAsc(String name);
}
