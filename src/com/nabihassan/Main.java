package com.nabihassan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Teacher asad = new Teacher(001, "Asad", 20000);
        Teacher jessica = new Teacher(002, "Jessica", 22000);
        Teacher ragnar = new Teacher(003,"Ragnar", 15000);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(asad);
        teachers.add(jessica);
        teachers.add(ragnar);


        Student ali = new Student(001,"Ali");
        Student omer = new Student(003,"Omer");
        Student rida = new Student(007,"Rida");

        List<Student> students = new ArrayList<>();
        students.add(ali);
        students.add(omer);
        students.add(rida);



    }
}
