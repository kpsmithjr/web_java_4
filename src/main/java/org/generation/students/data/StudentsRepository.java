package org.generation.students.data;

import org.generation.students.data.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Student, Integer> {

    Student findById(int id);

}
