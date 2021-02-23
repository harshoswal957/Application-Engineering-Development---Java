/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Harsh
 */
public class Patient {

    String fName;
    String lName;
    String VitalSignsID;
    ArrayList<VitalSigns> arraylist = new ArrayList<VitalSigns>();

    @Override
    public String toString() {
        return "Patient{" + "arraylist=" + arraylist + '}';
    }

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

    public ArrayList<VitalSigns> getArraylist() {
        return arraylist;
    }


    
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Patient pat1 = new Patient();
        String fName;
        String lName;
        String vitalSignsID;

        VitalSigns vs = new VitalSigns();
        VitalSigns cvs = new VitalSigns();

        String menu;
        
            System.out.println("Enter the patient's first name:");
            fName = sc.next();
            pat1.setFName(fName);

            System.out.println("Enter the patient's last name:");
            lName = sc.next();
            pat1.setLName(lName);

            System.out.println("Enter the patient's ID:");
            vitalSignsID = sc.next();
            //pat1.setVitalSignsID(vitalSignsID);
        do {

            System.out.println("Enter the patient's age:");
            float age = sc.nextFloat();
            vs.setAge(age);

            System.out.println("Enter the patient's respiratory rate:");
            int rr = sc.nextInt();
            vs.setRespiratoryRate(rr);

            System.out.println("Enter the patient's heart rate:");
            int hr = sc.nextInt();
            vs.setHeartRate(hr);

            System.out.println("Enter the patient's blood pressure:");
            int bp = sc.nextInt();
            vs.setBloodPressure(bp);

            System.out.println("Enter the patient's weight in kilos:");
            float wt = sc.nextFloat();
            vs.setWeightInKilos(wt);

            System.out.println("Enter the patient's weight in pounds:");
            float wtp = sc.nextFloat();
            vs.setWeightInPounds(wtp);

            boolean checking= false;///////
            checking = vs.checkTest();

            if (checking == true) {
                System.out.println("\nPatient vitals are normal");
            } else {
                System.out.println("\nPatient vitals are not normal");
            }

            //calling addNew method
            pat1.arraylist.add(vs);
            vs=cvs;
            System.out.println("\nEnter 'add' to add more patients");
            System.out.println("Enter 'view' to view patient's vital sign details");
            menu = sc.next();
            
        } while (menu.equalsIgnoreCase("add"));
        
        System.out.println("\nVital signs history of patient with First name:" +pat1.getFName() +" | Last name: "+ pat1.getLName() +" | " /*+pat1.getVitalSignsID() +"|" */ +pat1.toString());
    
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        
        String vts = sc.next();
        boolean chk = false; 
        chk = vs.isPatientNormal(vts);
        
        if (chk==true)
        {
            System.out.println("The patient named "+pat1.getFName()+ " "+pat1.getLName()+" "+"has the vital-sign "+vts+" , in normal range.");
        }
        else
            System.out.println("The patient named "+pat1.getFName()+" "+pat1.getLName()+" "+"has the vital-sign "+vts+" , not in normal range.");
    }
    }
