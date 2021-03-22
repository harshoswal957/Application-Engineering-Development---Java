/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class AlumniDirectory {
    ArrayList<AlumniProfile> alumni;
    Department department;

    public ArrayList<AlumniProfile> getAlumni() {
        return alumni;
    }

    public void setAlumni(ArrayList<AlumniProfile> alumni) {
        this.alumni = alumni;
    }
    
    public AlumniDirectory(Department d) {

        department = d;
        alumni = new ArrayList();

    }
      public AlumniProfile newAlumniProfile(StudentProfile sp, int GraduationYear) {
        AlumniProfile ap = new AlumniProfile(sp,GraduationYear);
        alumni.add(ap);
        return ap;
    }
    
}
