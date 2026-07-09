package com.shaheer;

import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter student name: ");
String name=scanner.nextLine();
int[] marks=new int[5];
String[] subjects={"Math","Physics","English","CS","Urdu"};
for(int i=0;i<subjects.length;i++){System.out.print("Enter marks for "+subjects[i]+": "); marks[i]=scanner.nextInt();}
Student student=new Student(name,marks);
int total=GradeCalculator.calculateTotal(marks);
double percentage=GradeCalculator.calculatePercentage(total,marks.length);
String grade=GradeCalculator.calculateGrade(percentage);
boolean pass=GradeCalculator.isPass(percentage);
System.out.println("\nStudent: "+student.getName());
for(int i=0;i<subjects.length;i++) System.out.println(subjects[i]+"\t"+marks[i]);
System.out.println("Total: "+total);
System.out.printf("Percentage: %.2f%%%n",percentage);
System.out.println("Grade: "+grade);
System.out.println("Status: "+(pass?"PASS":"FAIL"));
scanner.close();
}}