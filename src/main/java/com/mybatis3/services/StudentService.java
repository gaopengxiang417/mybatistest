package com.mybatis3.services;

import com.mybatis3.domain.Student;
import com.mybatis3.mappers.StudentMapper;
import com.mybatis3.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * User: wangchen
 * Date: 15/7/11
 * Time: 15:49
 */
public class StudentService {

    private Logger logger = LoggerFactory.getLogger(getClass());


    public List<Student> findAllStudents() {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {

            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            return studentMapper.findAllStudents();
        } finally {
            sqlSession.close();
        }
    }

    public Student findStudentById(Integer id) {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {

            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            return studentMapper.findStudentById(id);
        } finally {
            sqlSession.close();
        }
    }

    public void insertStudent(Student student) {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {

            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            studentMapper.insertStudent(student);
        } finally {
            sqlSession.close();
        }
    }
}
