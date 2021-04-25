package com.cybertek.lambda.course;

public class CourseTest {
    public static void main(String[] args) {
        System.out.println("//*********** basic   ******** //");
        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();

        System.out.println("//************ inner class  ******** //");
        Course java2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        java2.study();

        Course selenium2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Selenium");
            }
        };
        selenium2.study();

        System.out.println("//************* lambda expression   ******** //");

        //We can use lambda expression only with FUNCTIONAL INTERFACE
        //If your interface has only one abstract method it is FUNCTIONAL INTERFACE

        Course javaCourse = () -> System.out.println("Studying Java");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Studying Selenium");
        seleniumCourse.study();




    }
}
