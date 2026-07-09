package com.shaheer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GradeCalculatorTest{
@Test void testCalculateTotal(){assertEquals(430,GradeCalculator.calculateTotal(new int[]{90,82,75,98,85}));}
@Test void testCalculatePercentage(){assertEquals(86.0,GradeCalculator.calculatePercentage(430,5),0.01);}
@Test void testGradeAplus(){assertEquals("A+",GradeCalculator.calculateGrade(90));assertEquals("A+",GradeCalculator.calculateGrade(95));}
@Test void testGradeA(){assertEquals("A",GradeCalculator.calculateGrade(82));assertEquals("A",GradeCalculator.calculateGrade(80));}
@Test void testGradeB(){assertEquals("B",GradeCalculator.calculateGrade(74));assertEquals("B",GradeCalculator.calculateGrade(70));}
@Test void testGradeC(){assertEquals("C",GradeCalculator.calculateGrade(61));assertEquals("C",GradeCalculator.calculateGrade(60));}
@Test void testGradeF(){assertEquals("F",GradeCalculator.calculateGrade(45));assertEquals("F",GradeCalculator.calculateGrade(59));}
@Test void testIsPass(){assertTrue(GradeCalculator.isPass(50));assertTrue(GradeCalculator.isPass(90));assertFalse(GradeCalculator.isPass(49));assertFalse(GradeCalculator.isPass(45));}
}