/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class FacultyProfile {
    Person person;
    ArrayList <FacultyAssignment> facultyassignments;
    int facultyReview;
    int facultyIndustryReview;

    public FacultyProfile(Person p) {
        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<FacultyAssignment> getFacultyassignments() {
        return facultyassignments;
    }

    public void setFacultyassignments(ArrayList<FacultyAssignment> facultyassignments) {
        this.facultyassignments = facultyassignments;
    }

    public int getFacultyReview() {
        return facultyReview;
    }

    public void setFacultyReview(int facultyReview) {
        this.facultyReview = facultyReview;
    }
    
    public int getFacultyIndustryReview() {
        return facultyIndustryReview;
    }

    public void setFacultyIndustryReview(int facultyIndustryReview) {
        this.facultyIndustryReview = facultyIndustryReview;
    }
    
}
