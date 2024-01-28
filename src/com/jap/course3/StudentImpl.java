package com.jap.course3;

import java.util.Scanner;
import java.util.Random;
public class StudentImpl {
    private static  Scanner sc;
    private static Random rand;
    private String subject_stream;
    private int studentId;
    private String studentName;
    private static StudentMarks sm;
    private int studentTotal;
    static {
        sc=new Scanner(System.in);
        rand=new Random();
        sm=new StudentMarks();
    }
    StudentImpl(){
        this(Math.abs(rand.nextInt(100)),"",0,"");
    }
    StudentImpl(int id,String name,int total,String stream){
        studentId=id;
        studentName=name;
        studentTotal=total;
        subject_stream=stream;
    }
    public void setstream(String s) {
        subject_stream=s;
    }
    public String getstream() {
        return subject_stream;
    }
    public void setid() {
        studentId=Math.abs(rand.nextInt(100));
    }
    public int getid() {
        return studentId;
    }
    public void setname(String name) {
        studentName=name;
    }
    public String getname() {
        return studentName;
    }
    public void settotal(int total) {
        studentTotal=total;
    }
    public int gettotal() {
        return studentTotal;
    }

    public void calculateTotal(String s) {
        int maths;
        int physics;
        int chemistry;
        int biology;
        int business_studies;
        int finance;
        int accounting;
        switch(s) {
            case "computerScience":
                System.out.println("Please enter maths,physics,chemistry marks : ");
                maths=sc.nextInt();
                physics=sc.nextInt();
                chemistry=sc.nextInt();
                settotal(sm.calculateMarks(maths, physics, chemistry));
                break;
            case "biology":
                System.out.println("Please enter maths,physics,chemistry and biology marks : ");
                maths=sc.nextInt();
                physics=sc.nextInt();
                chemistry=sc.nextInt();
                biology=sc.nextInt();
                settotal(sm.calculateMarks(maths, physics, chemistry, biology));
                break;
            case "business":
                System.out.println("Please enter business studies,finance and accounting marks : ");
                business_studies=sc.nextInt();
                finance=sc.nextInt();
                accounting=sc.nextInt();
                settotal(sm.calculateMarks(business_studies, finance, accounting));
                break;
        }
    }
    public String toString() {
        return "Student ID : "+getid()+"\n Student Name : "+getname()+"\n Student Total : "+gettotal()+"\n Student stream : "+getstream();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		StudentMarks sm=new StudentMarks();
        StudentImpl s1=new StudentImpl();
        s1.setid();
        s1.setname("Aarti");
        s1.setstream("ComputerScience");
        String s=s1.getstream().toLowerCase();
        s1.calculateTotal(s);
        System.out.println(s1);


    }

}
