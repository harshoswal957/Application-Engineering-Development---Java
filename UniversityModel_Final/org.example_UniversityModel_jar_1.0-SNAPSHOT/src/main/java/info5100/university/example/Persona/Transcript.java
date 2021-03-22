/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sujayghodke
 */
public class Transcript {
   
    HashMap<String, CourseLoad> courseloadlist;
    
    CourseLoad currentcourseload;

    public HashMap<String, CourseLoad> getCourseloadlist() {
        return courseloadlist;
    }

    public CourseLoad getCurrentcourseload() {
        return currentcourseload;
    }
    
    
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        return currentcourseload;
        
    }
        public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
        
    public Collection<CourseLoad> getAllCourses(){
        List<CourseLoad> courses = new ArrayList<>();
        
        Set<String> keySet = courseloadlist.keySet();
        for(String key : keySet){
            courses.add(courseloadlist.get(key));
        }
        return courses;
    }
}
