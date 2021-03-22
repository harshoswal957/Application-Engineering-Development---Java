/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;

  
    String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();

    }

    public CourseOffer newCourseOffer(String n, FacultyProfile facultyProfile) {
        Course c = coursecatalog.getCourseByNumber(n);
        CourseOffer co = new CourseOffer(c, facultyProfile);
        schedule.add(co);
        return co;
    }
    
    public CourseOffer newCourseOffer(Course course, FacultyProfile facultyFacultyProfile) {
        CourseOffer co = new CourseOffer(course, facultyFacultyProfile);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }

      public ArrayList<CourseOffer> getSchedule() {
        return schedule;
    }
}
