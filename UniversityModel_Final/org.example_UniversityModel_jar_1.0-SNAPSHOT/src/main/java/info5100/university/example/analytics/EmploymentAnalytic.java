/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.analytics;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.AlumniDirectory;
import info5100.university.example.Persona.AlumniProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author harsh
 */
public class EmploymentAnalytic {

    EmployerDirectory employerDirectory;
    AlumniDirectory alumniDirectory;
    
    public List<String> getTopJobTitles(String courseName, int size) {
        Set<String> titles = new HashSet<>(); 
        ArrayList<EmployerProfile> employerlist = employerDirectory.getEmployerlist();
        if(employerlist.size() > 0){
           for(EmployerProfile employerProfile: employerlist){
               ArrayList<Employment> employments = employerProfile.getEmployments();
               for(Employment employment: employments){
                   ArrayList<CourseOffer> relevantcourseoffers = employment.getRelevantcourseoffers();
                   for(CourseOffer courseOffer: relevantcourseoffers){
                       if(courseOffer.getCourse().getName().equalsIgnoreCase(courseName)){
                           titles.add(employment.getTitle());
                           break;
                       }
                       }
                   }
               }
        }
        return new ArrayList<>(titles).stream().limit(size).collect(Collectors.toList());
    }

    public int getTotalNumberOfStudnetsEmployeed() {
        int count = 0;
        for(AlumniProfile alumni: alumniDirectory.getAlumni()){
            EmploymentHistroy employmenthistory = alumni.getStudnetProfile().getEmploymenthistory();
            if(employmenthistory.getEmployments().size() > 0){
                count++;
            }
        }
        return count;
    }

    public int getTotalNumberOfStudnetsUnEmployed() {
        int count = 0;
        for(AlumniProfile alumni: alumniDirectory.getAlumni()){
            EmploymentHistroy employmenthistory = alumni.getStudnetProfile().getEmploymenthistory();
            if(employmenthistory.getEmployments().isEmpty()){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfStudnetsEmployed(String courseName) {
        int totalEmployed = 0;
        int totalUnEmployed = 0;
        for (AlumniProfile alumni : alumniDirectory.getAlumni()) {
            Collection<CourseLoad> allCourses = alumni.getStudnetProfile().getTranscript().getAllCourses();
            for (CourseLoad course : allCourses) {
                ArrayList<SeatAssignment> seatassignments = course.getSeatassignments();
                if (seatassignments != null && seatassignments.size() > 0 && seatassignments.get(0).getSeat().getCourseoffer().getCourse().getName().equalsIgnoreCase(courseName)) {
                    if (alumni.getStudnetProfile().getEmploymenthistory().getEmployments().size() > 0) {
                        totalUnEmployed++;
                        break;
                    }
                }
            }
        }
        
        return totalEmployed;
    }

    public int getNumberOfStudnetsUnEmployed(String courseName) {
        int totalEmployed = 0;
        int totalUnEmployed = 0;
        for (AlumniProfile alumni : alumniDirectory.getAlumni()) {
            Collection<CourseLoad> allCourses = alumni.getStudnetProfile().getTranscript().getAllCourses();
            for (CourseLoad course : allCourses) {
                ArrayList<SeatAssignment> seatassignments = course.getSeatassignments();
                if (seatassignments != null && seatassignments.size() > 0 && seatassignments.get(0).getSeat().getCourseoffer().getCourse().getName().equalsIgnoreCase(courseName)) {
                    if (alumni.getStudnetProfile().getEmploymenthistory().getEmployments().size() > 0) {
                        totalEmployed++;
                        break;
                    }
                }
            }
        }
        
        return totalUnEmployed;
    }
    
    public List<String> getTopCourseForJobTitle(String jobTitle, int size) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Map<String, Integer> map = new TreeMap(Comparator.reverseOrder());
        ArrayList<EmployerProfile> employerlist = employerDirectory.getEmployerlist();
        for(EmployerProfile empProfile: employerlist){
            ArrayList<Employment> employments = empProfile.getEmployments();
            
            for(Employment emp : employments){
                if(emp.getTitle().equalsIgnoreCase(jobTitle)){
                    ArrayList<CourseOffer> relevantcourseoffers = emp.getRelevantcourseoffers();
                    for(CourseOffer courseOffer : relevantcourseoffers){
                        String name = courseOffer.getCourse().getName();
                        Integer get = map.get(name);
                        if(get == null){
                            get = 0;
                            map.put(name, get);
                        }
                        get+=1;
                        map.put(name, get);
                    }
                }
            }
        }
        Map<Integer, List<String>> result = new TreeMap(Comparator.reverseOrder());
        for(String key: map.keySet()){
            List<String> temp = result.get(map.get(key));
            if(temp == null){
                temp = new ArrayList<>();
            }
            temp.add(key);
            result.put(map.get(key), temp);
        }
        List<String> aux = new ArrayList(result.values());
        return aux.stream().limit(size).collect(Collectors.toList());
    }
    
}
