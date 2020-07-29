package com.nabihassan;

public class Teacher {

    private int t_id;
    private String t_name;
    private int salary;

    public Teacher(int t_id, String t_name, int salary){
        this.t_id = t_id;
        this.t_name = t_name;
        this.salary = salary;
    }

    /**
     return salary of teacher
     **/
    public int getSalary(){
        return salary;
    }


    /**
     return id of teacher
     **/
    public int getT_id(){
        return t_id;
    }


    /**
     return name of teacher
     **/
    public String getT_name(){
        return t_name;
    }


    /**
     update salary of teacher
     **/
    public void setSalary(int salary){
        this.salary += salary;
    }

}
