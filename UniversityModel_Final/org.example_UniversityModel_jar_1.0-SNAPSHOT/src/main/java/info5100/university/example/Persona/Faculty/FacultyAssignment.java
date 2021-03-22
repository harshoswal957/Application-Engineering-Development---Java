/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;

/**
 *
 * @author harsh
 */
public class FacultyAssignment {
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    int review;
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
        facultyprofile.facultyassignments.add(this);
    }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    public FacultyProfile getFacultyprofile() {
        return facultyprofile;
    }

    public void setFacultyprofile(FacultyProfile facultyprofile) {
        this.facultyprofile = facultyprofile;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }   
    
    
}
