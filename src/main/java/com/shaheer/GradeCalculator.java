package com.shaheer;

public class GradeCalculator {
    public static int calculateTotal(int[] marks){int total=0; for(int mark:marks) total+=mark; return total;}
    public static double calculatePercentage(int total,int numberOfSubjects){return (double)total/numberOfSubjects;}
    public static String calculateGrade(double percentage){
        if(percentage>=90) return "A+";
        else if(percentage>=80) return "A";
        else if(percentage>=70) return "B";
        else if(percentage>=60) return "C";
        else return "F";
    }
    public static boolean isPass(double percentage){return percentage>=50;}
}
