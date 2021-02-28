/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Harsh
 */
public class Encounter {
//    private doctorName;
//    private previousVisit;
      VitalSigns vs;

    public Encounter(VitalSigns vs) {
        this.vs = vs;
    }

    @Override
    public String toString() {
        return "Encounter{" + "vs=" + vs + '}';
    }
      
}
