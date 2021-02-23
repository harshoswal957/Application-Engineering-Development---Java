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
public class Main {

    //Testing
    public static void main(String args[]) {
        Patient pat1 = new Patient();
        VitalSigns vs;
        vs = new VitalSigns();

        System.out.println("Test case 1");
        pat1.setFName("hars");
        pat1.setLName("oswa");
        pat1.setVitalSignsID("ho");

        vs.setAge(1);
        vs.setRespiratoryRate(40);
        vs.setHeartRate(130);
        vs.setBloodPressure(60);
        vs.setWeightInKilos(2);
        vs.setWeightInPounds(7);

        boolean checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        boolean ans = vs.isPatientNormal("heartrate");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "heartrate" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "heartrate" + " is abnormal");
        }
        System.out.println("end\n");

        //2 hr not normal
        System.out.println("Test case 2");
        pat1.setFName("rak");
        pat1.setLName("swa");
        pat1.setVitalSignsID("rs");

        vs.setAge(1);
        vs.setRespiratoryRate(40);
        vs.setHeartRate(170);
        vs.setBloodPressure(170);
        vs.setWeightInKilos(2);
        vs.setWeightInPounds(6);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("heartrate");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "heartrate" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "heartrate" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        
        
        System.out.println("Test case 3");
        pat1.setFName("ehd");
        pat1.setLName("dsb");
        pat1.setVitalSignsID("ed");

        vs.setAge((float) 1.5);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(90);
        vs.setBloodPressure(75);
        vs.setWeightInKilos(7);
        vs.setWeightInPounds(12);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("bloodpressure");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is abnormal");
        }
        System.out.println("end\n");

        
        System.out.println("Test case 4");
        pat1.setFName("ehd");
        pat1.setLName("dsb");
        pat1.setVitalSignsID("ed");

        vs.setAge((float) 1.5);
        vs.setRespiratoryRate(35);
        vs.setHeartRate(90);
        vs.setBloodPressure(175);
        vs.setWeightInKilos(7);
        vs.setWeightInPounds(12);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("bloodpressure");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        
        ////5 Toddler
        System.out.println("Test case 5");
        pat1.setFName("dis");
        pat1.setLName("hds");
        pat1.setVitalSignsID("dh");

        vs.setAge(2);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(85);
        vs.setBloodPressure(100);
        vs.setWeightInKilos(12);
        vs.setWeightInPounds(25);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("respiratoryrate");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "respiratoryrate" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "respiratoryrate" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        
        
        System.out.println("Test case 6");
        pat1.setFName("ehd");
        pat1.setLName("dsb");
        pat1.setVitalSignsID("ed");

        vs.setAge(2);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(85);
        vs.setBloodPressure(100);
        vs.setWeightInKilos(12);
        vs.setWeightInPounds(35);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("respiratoryrate");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "respiratoryrate" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "respiratoryrate" + " is abnormal");
        }
        System.out.println("end\n");

        
        System.out.println("Test case 7");
        pat1.setFName("kd");
        pat1.setLName("rb");
        pat1.setVitalSignsID("kr");

        vs.setAge(4);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(85);
        vs.setBloodPressure(90);
        vs.setWeightInKilos(16);
        vs.setWeightInPounds(36);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("weightinkilos");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinkilos" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinkilos" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        
        
        ////8
        System.out.println("Test case 8");
        pat1.setFName("dis");
        pat1.setLName("hds");
        pat1.setVitalSignsID("dh");

        vs.setAge(4);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(85);
        vs.setBloodPressure(90);
        vs.setWeightInKilos(20);
        vs.setWeightInPounds(36);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("weightinkilos");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinkilos" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinkilos" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        
        
        System.out.println("Test case 9");
        pat1.setFName("uea");
        pat1.setLName("did");
        pat1.setVitalSignsID("ud");

        vs.setAge(10);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(85);
        vs.setBloodPressure(90);
        vs.setWeightInKilos(36);
        vs.setWeightInPounds(45);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("weightinpounds");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinpounds" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinpounds" + " is abnormal");
        }
        System.out.println("end\n");

        
        System.out.println("Test case 10");
        pat1.setFName("hd");
        pat1.setLName("sb");
        pat1.setVitalSignsID("hs");

        vs.setAge(10);
        vs.setRespiratoryRate(25);
        vs.setHeartRate(85);
        vs.setBloodPressure(90);
        vs.setWeightInKilos(36);
        vs.setWeightInPounds(100);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("weightinpounds");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinpounds" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "weightinpounds" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        
        
        
        System.out.println("Test case 11");
        pat1.setFName("ehd");
        pat1.setLName("dsb");
        pat1.setVitalSignsID("ed");

        vs.setAge(23);
        vs.setRespiratoryRate(15);
        vs.setHeartRate(75);
        vs.setBloodPressure(115);
        vs.setWeightInKilos(90);
        vs.setWeightInPounds(120);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("bloodpressure");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is abnormal");
        }
        System.out.println("end\n");
        
        
        System.out.println("Test case 12");
        pat1.setFName("ehd");
        pat1.setLName("dsb");
        pat1.setVitalSignsID("ed");

        vs.setAge(23);
        vs.setRespiratoryRate(15);
        vs.setHeartRate(75);
        vs.setBloodPressure(125);
        vs.setWeightInKilos(90);
        vs.setWeightInPounds(120);

        checking = vs.checkTest();
        if (checking == true) {
            System.out.println("Patient is normal");
        } else {
            System.out.println("Patient is not normal");
        }

        pat1.arraylist.add(vs);
        System.out.println("Printing array list:");
        System.out.println(pat1.arraylist);
        System.out.println("History of Patient : " + pat1.getFName() + " " + pat1.getLName() + " " + pat1.toString());
        System.out.println("\nEnter the vital sign to be checked from the below list:");
        System.out.println("respiratoryrate");
        System.out.println("heartrate");
        System.out.println("bloodpressure");
        System.out.println("weightinkilos");
        System.out.println("weightinpounds");
        ans = vs.isPatientNormal("bloodpressure");
        if (ans == true) {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is normal");
        } else {
            System.out.println("Patient's " + pat1.getFName() + " " + pat1.getLName() + " " + "vital sign " + "bloodpressure" + " is abnormal");
        }
        System.out.println("end\n");
        
    }
}
