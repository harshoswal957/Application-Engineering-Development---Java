/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

//import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
class Person {
    String fName;
    String lName;
    String VitalSignsID;
    String address;
    
    //ArrayList<VitalSigns> arraylist = new ArrayList<VitalSigns>();

//    @Override
//    public String toString() {
//        return "Patient{" + "arraylist=" + arraylist + '}';
//    }

    //Getters and Setters
    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getVitalSignsID() {
        return VitalSignsID;
    }

    public void setVitalSignsID(String VitalSignsID) {
        this.VitalSignsID = VitalSignsID;
    }

//    public ArrayList<VitalSigns> getArraylist() {
//        return arraylist;
//    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    
}
