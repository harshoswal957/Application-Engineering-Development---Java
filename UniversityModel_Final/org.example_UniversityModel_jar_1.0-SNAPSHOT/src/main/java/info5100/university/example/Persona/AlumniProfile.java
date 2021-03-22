/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;

/**
 *
 * @author sujayghodke
 */
public class AlumniProfile {
    StudentProfile studnetProfile;
    int graduationYear;
    EmploymentHistroy emphistory;

    public EmploymentHistroy getEmphistory() {
        return emphistory;
    }

    public void setEmphistory(EmploymentHistroy emphistory) {
        this.emphistory = emphistory;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public AlumniProfile(StudentProfile studnetProfile, int graduationYear) {
        this.studnetProfile = studnetProfile;
        this.graduationYear = graduationYear;
        emphistory = new EmploymentHistroy();
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public StudentProfile getStudnetProfile() {
        return studnetProfile;
    }

    public void setStudnetProfile(StudentProfile studnetProfile) {
        this.studnetProfile = studnetProfile;
    }

    public void newEmployment(Employment emp) {
       emphistory.newEmployment(emp);
    }

}
