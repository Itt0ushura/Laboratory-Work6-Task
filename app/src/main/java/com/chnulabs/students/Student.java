package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;
    public Student(String name, String groupNumber){
        this.name = name;
        this.groupNumber = groupNumber;
    }
    public String getName(){
        return name;
    }
    public String getGroupNumber(){
        return groupNumber;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Александр Геращенко", "301"),
                    new Student("Олексій Прудько", "301"),
                    new Student("Сергій Блінович", "302"),
                    new Student("Валерій Коробецький", "308"),
                    new Student("Амелія Аббасова", "309"),
                    new Student("Георгій Кантуєв", "309"),
                    new Student("Кирило Смірнов", "302"),
                    new Student("Владислав Балашов", "309")
            )
    );
    public static ArrayList<Student> getStudents(){
        return getStudents("");
    }

    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stList=new ArrayList<>();
        for(Student s: students){
            if(s.getGroupNumber().equals(groupNumber)|| (groupNumber == "")){
                stList.add(s);
            }
        }
        return stList;
    }
    @Override
    public String toString() {
        return name;
    }
}

