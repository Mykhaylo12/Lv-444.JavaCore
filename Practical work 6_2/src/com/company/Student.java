package com.company;

public class Student extends Person{
    private  String TYPE_PERSON;
    public void print(){
        System.out.println("I am a "+ TYPE_PERSON);}

    public Student(String TYPE_PERSON) {
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    public void setTYPE_PERSON(String TYPE_PERSON) {
        this.TYPE_PERSON = TYPE_PERSON;
    }
    public void salary(){
        System.out.println("I have ");
}}
