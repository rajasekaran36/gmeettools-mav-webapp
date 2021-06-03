package io.github.rajasekaranap.gmeettool.model;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int id;
    private String rollNo;
    private String name;
    private List<String> gmeetNames;
    public Student(String rollNo, String name){
        this.id++;
        this.rollNo = rollNo;
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGmeetNames() {
        return gmeetNames;
    }

    public void setGmeetNames(List<String> gmeetNames) {
        this.gmeetNames = gmeetNames;
    }
    public void addGmeetName(String gmeetName){
        gmeetNames.add(gmeetName);
    }

    public boolean isContainsGmeetName(String gmeetName){
        for(String name:gmeetNames){
            if(name == gmeetName)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", gmeetNames=" + gmeetNames +
                '}';
    }
}
