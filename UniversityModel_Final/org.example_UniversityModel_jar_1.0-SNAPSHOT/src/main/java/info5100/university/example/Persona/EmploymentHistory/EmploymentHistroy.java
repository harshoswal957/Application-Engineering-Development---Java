/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import java.util.ArrayList;

/**
 *
 * @author mananshah
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public void newEmployment(Employment emp){
        employments.add(emp);
    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<Employment> employments) {
        this.employments = employments;
    }
    
    
}
