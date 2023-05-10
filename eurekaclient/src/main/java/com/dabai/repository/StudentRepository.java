package com.dabai.repository;

import com.dabai.entity.Student;

import java.util.Collection;


public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
