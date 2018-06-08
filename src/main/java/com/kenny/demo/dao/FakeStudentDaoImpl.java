package com.kenny.demo.dao;


import org.springframework.stereotype.Repository;

import com.kenny.demo.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;



@Repository("fakeDao")
public class FakeStudentDaoImpl implements StudentDao {

    private final Map<UUID, Student> database;

    public FakeStudentDaoImpl() {
        database = new HashMap<>();
        UUID studentId = UUID.randomUUID();
        database.put(studentId, new Student(studentId,  14,  "Kenny",  "Brisco",  "Spring Boot"));
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        database.put(studentId, student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student newStudent) {
        database.put(studentId, newStudent);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
