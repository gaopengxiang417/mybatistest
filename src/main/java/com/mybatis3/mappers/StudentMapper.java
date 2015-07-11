package com.mybatis3.mappers;

import com.mybatis3.domain.Student;

import java.util.List;

/**
 * User: wangchen
 * Date: 15/7/11
 * Time: 15:47
 */
public interface StudentMapper {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);
}
