/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Harsh
 */
public class VitalSigns {

    //Attributes of Vital Signs
    private float age;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private float weightInKilos;
    private float weightInPounds;

    public VitalSigns(float age, int respiratoryRate, int heartRate, int bloodPressure, float weightInKilos, float weightInPounds) {
        this.age = age;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInPounds;
    }


    //Timestamp
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    //Getters and Setters
    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(float weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "age=" + age + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", bloodPressure=" + bloodPressure + ", weightInKilos=" + weightInKilos + ", weightInPounds=" + weightInPounds + ", timeStamp in Year.Month.Date.Hour.Minute.Seconds format=" + timeStamp + '}';
    }

    //Checking vital sign conditions according to age
    boolean checkTest() {
        boolean check = false; //Intial false state

        //Newborn
        if (age <= 1) {
            if ((respiratoryRate >= 30 && respiratoryRate <= 50) && (heartRate >= 120 && heartRate <= 160) && (bloodPressure >= 50 && bloodPressure <= 70) && (weightInKilos >= 2 && weightInKilos <= 3) && (weightInPounds >= 4.5 && weightInPounds <= 7)) {
                check = true;
            }
            System.out.println("\nThe Patient agegroup is newborn");
        }

        //Infant
        if (age > 1 && age < 2) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 140) && (bloodPressure >= 70 && bloodPressure <= 100) && (weightInKilos >= 4 && weightInKilos <= 10) && (weightInPounds >= 9 && weightInPounds <= 22)) {
                check = true;
            }
            System.out.println("\nThe Patient agegroup is infant");
        }

        //Toddler
        if (age >= 2 && age < 3) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 130) && (bloodPressure >= 80 && bloodPressure <= 110) && (weightInKilos >= 10 && weightInKilos <= 14) && (weightInPounds >= 22 && weightInPounds <= 31)) {
                check = true;
            }
            System.out.println("\nThe Patient agegroup is toddler");
        }

        //Preschooler
        if (age >= 3 && age <= 5) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 120) && (bloodPressure >= 80 && bloodPressure <= 110) && (weightInKilos >= 14 && weightInKilos <= 18) && (weightInPounds >= 31 && weightInPounds <= 40)) {
                check = true;
            }
            System.out.println("\nThe Patient agegroup is Preschooler");
        }

        //School Age
        if (age >= 6 && age <= 12) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 70 && heartRate <= 110) && (bloodPressure >= 80 && bloodPressure <= 120) && (weightInKilos >= 20 && weightInKilos <= 42) && (weightInPounds >= 41 && weightInPounds <= 92)) {
                check = true;
            }
            System.out.println("\nThe Patient agegroup is School Age");
        }

        //Adolescent
        if (age >= 13) {
            if ((respiratoryRate >= 12 && respiratoryRate <= 20) && (heartRate >= 55 && heartRate <= 105) && (bloodPressure >= 110 && bloodPressure <= 120) && (weightInKilos > 50) && (weightInPounds > 110)) {
                check = true;
            }
            System.out.println("\nThe Patient agegroup is Adolescent");
        }

        return check;
    }

    public boolean isPatientNormal(String vts) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        boolean vtsCheck = false;

        if (vts.equals("respiratoryrate")) {
            if (age <= 1) {
                if (respiratoryRate >= 30 && respiratoryRate <= 50) {
                    vtsCheck = true;
                }
            }
            if (age > 1 && age < 2) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    vtsCheck = true;
                }
            }
            if (age >= 2 && age < 3) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    vtsCheck = true;
                }
            }
            if (age >= 3 && age <= 5) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    vtsCheck = true;
                }
            }
            if (age >= 6 && age <= 12) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    vtsCheck = true;
                }
            }
            if (age >= 13) {
                if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                    vtsCheck = true;
                }
            }
        } else if (vts.equals("heartrate")) {
            if (age <= 1) {
                if ((heartRate >= 120 && heartRate <= 160)) {
                    vtsCheck = true;
                }
            }
            if (age > 1 && age < 2) {
                if (heartRate >= 80 && heartRate <= 140) {
                    vtsCheck = true;
                }
            }
            if (age >= 2 && age < 3) {
                if (heartRate >= 80 && heartRate <= 130) {
                    vtsCheck = true;
                }
            }
            if (age >= 3 && age <= 5) {
                if (heartRate >= 80 && heartRate <= 120) {
                    vtsCheck = true;
                }
            }
            if (age >= 6 && age <= 12) {
                if (heartRate >= 70 && heartRate <= 110) {
                    vtsCheck = true;
                }
            }
            if (age >= 13) {
                if (heartRate >= 55 && heartRate <= 105) {
                    vtsCheck = true;
                }
            }
        } else if (vts.equals("bloodpressure")) {
            if (age <= 1) {
                if ((bloodPressure >= 50 && bloodPressure <= 70)) {
                    vtsCheck = true;
                }
            }
            if (age > 1 && age < 2) {
                if (bloodPressure >= 70 && bloodPressure <= 100) {
                    vtsCheck = true;
                }
            }
            if (age >= 2 && age < 3) {
                if (bloodPressure >= 80 && bloodPressure <= 110) {
                    vtsCheck = true;
                }
            }
            if (age >= 3 && age <= 5) {
                if (bloodPressure >= 80 && bloodPressure <= 110) {
                    vtsCheck = true;
                }
            }
            if (age >= 6 && age <= 12) {
                if (bloodPressure >= 80 && bloodPressure <= 120) {
                    vtsCheck = true;
                }
            }
            if (age >= 13) {
                if (bloodPressure >= 110 && bloodPressure <= 120) {
                    vtsCheck = true;
                }
            }
        } else if (vts.equals("weightinkilos")) {
            if (age <= 1) {
                if ((weightInKilos >= 2 && weightInKilos <= 3)) {
                    vtsCheck = true;
                }
            }
            if (age > 1 && age < 2) {
                if (weightInKilos >= 4 && weightInKilos <= 10) {
                    vtsCheck = true;
                }
            }
            if (age >= 2 && age < 3) {
                if (weightInKilos >= 10 && weightInKilos <= 14) {
                    vtsCheck = true;
                }
            }
            if (age >= 3 && age <= 5) {
                if (weightInKilos >= 14 && weightInKilos <= 18) {
                    vtsCheck = true;
                }
            }
            if (age >= 6 && age <= 12) {
                if (weightInKilos >= 20 && weightInKilos <= 42) {
                    vtsCheck = true;
                }
            }
            if (age >= 13) {
                if (weightInKilos > 50) {
                    vtsCheck = true;
                }
            }
        } else if (vts.equalsIgnoreCase("weightinpounds")) {
            if (age <= 1) {
                if (weightInPounds >= 4.5 && weightInPounds <= 7) {
                    vtsCheck = true;
                }
            }

            if (age > 1 && age < 2) {
                if (weightInPounds >= 9 && weightInPounds <= 22) {
                    vtsCheck = true;
                }
            }
            if (age >= 2 && age < 3) {
                if (weightInPounds >= 22 && weightInPounds <= 31) {
                    vtsCheck = true;
                }
            }
            if (age >= 3 && age <= 5) {
                if (weightInPounds >= 31 && weightInPounds <= 40) {
                    vtsCheck = true;
                }
            }
            if (age >= 6 && age <= 12) {
                if (weightInPounds >= 41 && weightInPounds <= 92) {
                    vtsCheck = true;
                }
            }
            if (age >= 13) {
                if (weightInPounds > 110) {
                    vtsCheck = true;
                }
            }
        } else {
            return vtsCheck;
        }
        return vtsCheck;
    }

}
