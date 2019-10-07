package com.company;

public class Teacher extends Staff {

private int salary;
    private  String TYPE_PERSON;

    public Teacher(int salary, String TYPE_PERSON) {
        this.salary = salary;
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public void print(){
        System.out.println("I am a "+ TYPE_PERSON);}
    public void salary(){
        System.out.println("I am a  and I have " +salary);


}

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    public void setTYPE_PERSON(String TYPE_PERSON) {
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }}
