/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class PatientDirectory extends PersonDirectory{
    ArrayList<Patient> patientlist  = new ArrayList<Patient>();
    
    public void addPat(Patient pat1)
    {
        this.patientlist.add(pat1);
        this.personlist.add(pat1);
    }
}