/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author mananshah
 */
public class Employment {
    ArrayList<CourseOffer> relevantcourseoffers;
    int weight;
    String title;
    Employment nextemplyment;  //next job so they are in a sequence 
    //no promotion count
    int promotionCount;               //to track year on year growth of employee
    Map<Integer, Double> salary;
    
    EmployerProfile employer;
    
    public Employment(String j, double money, int year){
        ArrayList relevantcourseoffers = new ArrayList();
        salary = new TreeMap<Integer, Double>(Comparator.reverseOrder());
        salary.put(year, money);
    }

    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public void setRelevantcourseoffers(ArrayList<CourseOffer> relevantcourseoffers) {
        this.relevantcourseoffers = relevantcourseoffers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employment getNextemplyment() {
        return nextemplyment;
    }

    public void setNextemplyment(Employment nextemplyment) {
        this.nextemplyment = nextemplyment;
    }

    public EmployerProfile getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerProfile employer) {
        this.employer = employer;
    }
    
    public double getCurrentSalary(){
        Map.Entry<Integer,Double> entry = salary.entrySet().iterator().next();
        return entry.getValue();
    }
    
    public void incrementSalary(int year, double salary){
         this.salary.put(year, salary);
    }
    
    public int getYearsOfEmployment(){
        if(salary.isEmpty()){
            return 1;
        }
        return salary.keySet().size() - 1;
    }
    
    public double getGrowthRate(){
        Set<Map.Entry<Integer, Double>> entrySet = salary.entrySet();
        
        int size = entrySet.size();
        Iterator<Map.Entry<Integer, Double>> iterator = entrySet.iterator();
        double finalSalary = getCurrentSalary();
        double initialSalary = getCurrentSalary();
        for(int i=0; i<size; i++){
            double temp = iterator.next().getValue();
            if(i==size-1){
                initialSalary = temp;
            }
            if(i == 0){
                finalSalary  = temp;
            }
        } 
        return ((finalSalary - initialSalary)/(getYearsOfEmployment() * initialSalary))* 100;
    }

    public int getPromotionCount() {
        return promotionCount;
    }    
    
    public void promoteEmploye(int times){
        this.promotionCount += times;
    }
    
}
