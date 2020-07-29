package com.nabihassan;

import java.util.List;

public class School {

    /**
     * we use list because there can be multiple teachers and students
     * we are using an Arraylist instead of an array because there is no fixed amount of teachers and students
     *
     */

    private List<Teacher>  teachers;
    private List<Student> students;
    private int totalmoneyearned; /**  total money earned by school from student's fee  **/
    private int totalmoneyspent;


    /**  total money spent by school on teacher's fee  **/

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalmoneyearned = 0;
        totalmoneyspent = 0;
    }


    /**
     * returns a list of teachers in school
     *
     **/
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to school
     *
     **/
    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /**
     * returns a list of student in school
     *
     **/
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to school
     *
     **/
    public void addStudents(Student student) {
        this.students.add(student);
    }

    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    public void setTotalmoneyearned(int totalmoneyearned) {
        this.totalmoneyearned += totalmoneyearned;
    }

    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    public void setTotalmoneyspent(int totalmoneyspent) {
        this.totalmoneyspent += totalmoneyspent;
    }

}
