package io.github.rajasekaranap.gmeettool.utils;

import io.github.rajasekaranap.gmeettool.dao.StudentDao;
import io.github.rajasekaranap.gmeettool.impl.StudenDaoImpl;
import io.github.rajasekaranap.gmeettool.model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class StudentUtils {
    public static StudentDao getStudentDao(String fileName) {
        try {
            StudentDao studentDao = new StudenDaoImpl();
            List<String> lines = Files.readAllLines(Path.of(fileName), StandardCharsets.UTF_8);
            for(String line:lines){
                List<String> data= Arrays.asList(line.split(","));
                //CSV format 0-sno 1-rollno 2-student name 3-N-gmeetnames
                studentDao.addStudent(data.get(1),data.get(2),data.subList(3,data.size()));
            }
            return studentDao;
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem in Reading File");
            return null;
        }
    }
}
