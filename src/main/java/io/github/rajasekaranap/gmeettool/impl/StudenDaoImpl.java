package io.github.rajasekaranap.gmeettool.impl;

import io.github.rajasekaranap.gmeettool.dao.StudentDao;
import io.github.rajasekaranap.gmeettool.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudenDaoImpl implements StudentDao {
    List<Student> students = new ArrayList<>();


    @Override
    public Student getStudentByRollNo(String rollNo) {
        for(Student student:students){
            if(student.getRollNo()==rollNo)
                return student;
        }
        return null;
    }

    @Override
    public Student getStudentByName(String name) {
        for(Student student:students){
            if(student.getName()==name)
                return student;
        }
        return null;
    }

    @Override
    public List<String> getGmeetNamesByName(String name) {
        Student student = getStudentByName(name);
        if(student!=null){
            return student.getGmeetNames();
        }
        return null;
    }

    @Override
    public List<String> getGmeetNamesByRollNo(String rollNo) {
        Student student = getStudentByRollNo(rollNo);
        if(student!=null){
            return student.getGmeetNames();
        }
        return null;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addStudent(String rollNo, String name, List<String> gmeetNames) {
        Student student = new Student(rollNo,name);
        student.setGmeetNames(gmeetNames);
        this.addStudent(student);
    }

    @Override
    public void addStudent(String rollNo, String name) {
        students.add(new Student(rollNo,name));
    }

    @Override
    public void addStudents(Map<String, String> rollNoNameMap) {
        //Need to implement
    }

    public boolean addGmeetName(String name, String gmeetName){
        Student student = getStudentByName(name);
        if(student!=null){
            student.addGmeetName(gmeetName);
            return true;
        }
        return false;
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
