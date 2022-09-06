package org.generation.students.service;

import org.generation.students.data.entity.Student;

public interface StudentService {

    Iterable<Student> all();

    Student get(int studentId);

    void save(Student student);

    void delete(int studentId);
}
