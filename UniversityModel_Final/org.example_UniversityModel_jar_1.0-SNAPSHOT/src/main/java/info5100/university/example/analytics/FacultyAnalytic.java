/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.analytics;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class FacultyAnalytic {

    Department dept;

    public FacultyAnalytic(Department dept) {
        this.dept = dept;
    }

    public int getFacultyRating(FacultyProfile faculty) {
        ArrayList<FacultyAssignment> facultyassignments = faculty.getFacultyassignments();

        int globalRating = 0;
        for (FacultyAssignment assignment : facultyassignments) {
            CourseOffer courseoffer = assignment.getCourseoffer();
            int rating = getFacultyRatingByCourseName(faculty, courseoffer.getCourse().getName());
            assignment.setReview(rating);
            globalRating += rating;
        }
        faculty.setFacultyReview(globalRating);
        return globalRating / facultyassignments.size();
    }

    public int getFacultyRatingByCourseName(FacultyProfile faculty, String courseName) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<FacultyAssignment> facultyassignments = faculty.getFacultyassignments();
        int rating = 0;
        for (FacultyAssignment assignment : facultyassignments) {
            CourseOffer courseoffer = assignment.getCourseoffer();
            if (courseoffer.getCourse().getName().equalsIgnoreCase(courseName)) {
                ArrayList<Seat> seatlist = courseoffer.getSeatlist();
                int sum = 0;

                for (Seat seat : seatlist) {
                    int review = seat.getStudentReview();
                    sum += review;
                }

                rating = sum / seatlist.size();
            }
        }
        return rating;
    }

}
