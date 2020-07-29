package com.nabihassan;

public class Student {

    private int s_id;
    private String s_name;
    private int s_class;
    private char Grade;
    private int fees_paid;
    private int fees_total;
    private int fees_balance;

    public Student(int id, String s_name){
        this.s_id = id;
        this.s_name = s_name;
        s_class = 0;
        Grade = 'I';
        fees_paid = 0;
        fees_total = 10000;
        fees_balance = 0;
    }


    public void sets_class(char s_class){
        this.s_class = s_class;
    }


    /**
     return class in which the student is studying in
     **/
    public int gets_class(){
        return this.s_class;
    }


    public void setGrade(char Grade){
        this.Grade = Grade;
    }


    /**
     return grade of student
     **/
    public int getGrade(){
        return this.Grade;
    }


    /**
     update fees paid by student
     **/
    public void setFees_paid(int fees_paid) {
        this.fees_paid += fees_paid;
    }


    /**
     return total fees by student
     **/
    public int getFees_total() {
        return this.fees_total;
    }


    /**
     return fees paid by student
     **/
    public int getFees_paid() {
        return this.fees_paid;
    }


    /**
     return fees balance of student
     **/
    public int getFees_balance() {
        int fees_balance = fees_total - fees_paid;
        return fees_balance;
    }

}
