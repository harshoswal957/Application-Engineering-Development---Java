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
public class Mainpart4 {
    
    public static void main(String[] args){
    //Test
    PatientDirectory patDir = new PatientDirectory();
    //1
    Patient patient1 = new Patient();
    patient1.setFName("Test1");
    patient1.setLName("Case1");
    patient1.setVitalSignsID("ID1");
    
    VitalSigns vitSigns = new VitalSigns(2, 25, 90, 90, 6, 15); //Norm bp
    Encounter enc = new Encounter(vitSigns);
    patient1.encounterlist.add(enc);
    patDir.addPat(patient1);
    
    //2
    Patient patient2 = new Patient();
    patient2.setFName("Test2");
    patient2.setLName("Case2");
    patient2.setVitalSignsID("ID2");
    
    VitalSigns vitSigns1 = new VitalSigns(2, 25, 90, 180, 6, 15); //High bp
    Encounter enc1 = new Encounter(vitSigns1);
    patient2.encounterlist.add(enc1);
    patDir.addPat(patient2);
    
    //3
    Patient patient3 = new Patient();
    patient3.setFName("Test3");
    patient3.setLName("Case3");
    patient3.setVitalSignsID("ID3");
    
    VitalSigns vitSigns2 = new VitalSigns(8, 25, 80, 100, 30, 50); //Norm bp
    Encounter enc2 = new Encounter(vitSigns2);
    patient3.encounterlist.add(enc2);
    patDir.addPat(patient3);    
    
    
    //4
    Patient patient4 = new Patient();
    patient4.setFName("Test4");
    patient4.setLName("Case4");
    patient4.setVitalSignsID("ID4");
    
    VitalSigns vitSigns3 = new VitalSigns(8, 25, 80, 40, 30, 50); //Low bp
    Encounter enc3 = new Encounter(vitSigns3);
    patient4.encounterlist.add(enc3);
    patDir.addPat(patient4);    
    
    
    //5
    Patient patient5 = new Patient();
    patient5.setFName("Test5");
    patient5.setLName("Case5");
    patient5.setVitalSignsID("ID5");
    
    VitalSigns vitSigns4 = new VitalSigns(10, 45, 100, 50, 30, 90); //Low bp
    Encounter enc4 = new Encounter(vitSigns4);
    patient5.encounterlist.add(enc4);
    patDir.addPat(patient5);    
    
    
    //6
    Patient patient6 = new Patient();
    patient6.setFName("Test6");
    patient6.setLName("Case6");
    patient6.setVitalSignsID("ID6");
    
    VitalSigns vitSigns5 = new VitalSigns(15, 12, 60, 115, 70, 200); //Normal
    Encounter enc5 = new Encounter(vitSigns5);
    patient6.encounterlist.add(enc5);
    patDir.addPat(patient6);    
    
        
    //7
    Patient patient7 = new Patient();
    patient7.setFName("Test7");
    patient7.setLName("Case7");
    patient7.setVitalSignsID("ID7");
    
    VitalSigns vitSigns6 = new VitalSigns(25, 12, 60, 115, 90, 280); //Normal
    Encounter enc6 = new Encounter(vitSigns6);
    patient7.encounterlist.add(enc6);
    patDir.addPat(patient7);    
    
    
    
    //person in house
    House house1 = new House();
    house1.personlist.add(patient1);
    house1.personlist.add(patient2);
    
    House house2 = new House();
    house2.personlist.add(patient3);
    house2.personlist.add(patient4);
    house2.personlist.add(patient5);
    
    House house3 = new House();
    house3.personlist.add(patient6);
    house3.personlist.add(patient7);
    
    //houses in community
    Community comm1 = new Community();
    comm1.houselist.add(house1);
    
    Community comm2 = new Community();
    comm2.houselist.add(house2);
    comm2.houselist.add(house3);
    
    //communities in cites
    City city1 = new City();
    city1.communitylist.add(comm1);
    city1.communitylist.add(comm2);
    
    //Community 1 abnormal bp count
    int counter = 0;
    for(House hs : comm1.houselist)
    {
        for (Person pat : hs.personlist) //for each to traverse through each person belonging to a house
        {
            Patient pt = (Patient) pat;
            // if element at last position of encounter list has vital sign of bp normal = false
            if(pt.encounterlist.get(pt.encounterlist.size()-1).vs.isPatientNormal("bloodpressure")==false)
            {
                System.out.println("Abnormal blood presssure patient details: "+pt);
                counter++; //Abnormal bp count
            }
        }
    }
    System.out.println("Abnormal Blood Pressure patient count for Community-1 : " + counter);
    System.out.println("\n");
    
    //Community 2 abnormal bp count
    int counter1 = 0;
    for(House hs : comm2.houselist)
    {
        for (Person pat : hs.personlist) //for each to traverse through each person belonging to a house
        {
            Patient pt = (Patient) pat;
            // if element at last position of encounter list has vital sign of bp normal = false
            if(pt.encounterlist.get(pt.encounterlist.size()-1).vs.isPatientNormal("bloodpressure")==false)
            {
                System.out.println("Abnormal blood presssure: "+pt);
                counter1++; //Abnormal bp count
            }
        }
    }
    System.out.println("Abnormal Blood Pressure patient count for Community-2 : " + counter1);
    System.out.println("\n");
}
}