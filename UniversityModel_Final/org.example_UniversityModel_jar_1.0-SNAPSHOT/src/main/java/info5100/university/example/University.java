/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.Department.Department;
import info5100.university.example.analytics.CourseAnalytic;
import info5100.university.example.analytics.FacultyAnalytic;
import info5100.university.example.faker.FakerFactoryDemo;

/**
 *
 * @author mananshah
 */
public class University {

    public static void main(String[] args) {
       Department dept = FakerFactoryDemo.getDepartment();
       CourseAnalytic ca = new CourseAnalytic(dept);

       String CourseName = dept.getCourseCatalog().getCourseList().get(0).getName();
       int rating = ca.getJobCourseRating(CourseName);
       System.out.println("Analytics of University Model: ");
       System.out.println("***************************************");
       System.out.println("Course rating as per Industry Standards is: " + rating);

       FacultyAnalytic fa = new FacultyAnalytic(dept);
       int facultyrating = fa.getFacultyRating(dept.getFacultydirectory().getTeacherlist().get(0));
       System.out.println("***************************************");
       System.out.println("Analytics for the faculty: ");
       System.out.println("***************************************");
       System.out.println("Faculty rating is: " + facultyrating);

       double cgpa = ca.getAverageGPA(CourseName);
       System.out.println("***************************************");
       System.out.println("Analytics for the GPA of a particular course: ");
       System.out.println("***************************************");
       System.out.println("Average GPA is: " + cgpa);

       double growthSalary = ca.getCourseSalaryGrowthRatingForCourse(CourseName);
       System.out.println("***************************************");
       System.out.println("Analytics as per the salary growth: ");
       System.out.println("***************************************");
       System.out.println("Average Salary Growth is: " + growthSalary);


    }
}
