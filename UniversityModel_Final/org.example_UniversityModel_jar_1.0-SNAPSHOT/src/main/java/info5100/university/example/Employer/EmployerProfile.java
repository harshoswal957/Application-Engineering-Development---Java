/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sujay
 */
public class EmployerProfile {

    String name;
    ArrayList<Employment> employments;

    public EmployerProfile(String n) {  //could be company instead of just a name as a string
        name = n;
        employments = new ArrayList<>();
    }

    public boolean isMatch(String id) {
        if (name.equals(id)) {
            return true;             //String is an object and can do equal matach
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<Employment> employments) {
        this.employments = employments;
    }

    public Employment newEmployement(String name, ArrayList<CourseOffer> relevantcourseoffers, double salary, int year) {
        Employment e = new Employment(name, salary, year);
        employments.add(e);
        e.setRelevantcourseoffers(relevantcourseoffers);
        return e;
    }

}
