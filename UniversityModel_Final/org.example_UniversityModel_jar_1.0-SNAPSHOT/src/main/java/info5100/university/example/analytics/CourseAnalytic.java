/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.analytics;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.AlumniDirectory;
import info5100.university.example.Persona.AlumniProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import info5100.university.example.Persona.StudentDirectory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author mananshah
 */
public class CourseAnalytic {

    EmployerDirectory employerDirectory;
    StudentDirectory studentDirectory;
    AlumniDirectory alumniDirectory;
    CourseCatalog courseCatalog;

    public CourseAnalytic(Department dept) {
        this.alumniDirectory = dept.getAlumnidirectory();
        this.studentDirectory = dept.getStudentDirectory();
        this.employerDirectory = dept.getEmployerdirectory();
        this.courseCatalog = dept.getCourseCatalog();
    }

    public int getJobCourseRating(String courseName) {
        int total = alumniDirectory.getAlumni().size();
        int totalEmployed = 0;
        int totalUnEmployed = 0;
        for (AlumniProfile alumni : alumniDirectory.getAlumni()) {
            Collection<CourseLoad> allCourses = alumni.getStudnetProfile().getTranscript().getAllCourses();
            for (CourseLoad course : allCourses) {
                ArrayList<SeatAssignment> seatassignments = course.getSeatassignments();
                if (seatassignments != null && seatassignments.size() > 0) {
                    SeatAssignment seatAssignment = seatassignments.get(0);
                    Seat seat = seatAssignment.getSeat();
                    CourseOffer courseoffer = seat.getCourseoffer();
                    Course course1 = courseoffer.getCourse();
                    String name = course1.getName();
                    boolean temp = name.equalsIgnoreCase(courseName);
                    if (temp) {
                        EmploymentHistroy employmenthistory = alumni.getEmphistory();
                        ArrayList<Employment> employments = employmenthistory.getEmployments();
                        if (employments.size() > 0) {
                            totalEmployed++;
                        } else {
                            totalUnEmployed++;
                        }
                        break;
                    }
                }
            }
        }

        return (int) (((double) totalEmployed) / total * 10);
    }

    public List<Course> getTopJobCourses(int size, String semester) {
        Map<Integer, List<Course>> enrollmentRatings = getEnrollmentRatings();
        List<Course> courses = new ArrayList<>();
        enrollmentRatings.keySet().stream().sorted(Comparator.reverseOrder()).forEach(key -> {
            if (key != 0) {
                courses.addAll(enrollmentRatings.get(key));
            }
        });
        return courses.stream().limit(size).collect(Collectors.toList());
    }

    public int getCourseSalaryGrowthRatingForCourse(String courseName) {
        int total = 0;
        int totalGrowth = 0;
        for (AlumniProfile alumni : alumniDirectory.getAlumni()) {
            Collection<CourseLoad> allCourses = alumni.getStudnetProfile().getTranscript().getAllCourses();
            for (CourseLoad course : allCourses) {
                ArrayList<SeatAssignment> seatassignments = course.getSeatassignments();
                if (seatassignments != null && seatassignments.size() > 0) {
                    SeatAssignment seatAssignment = seatassignments.get(0);
                    Seat seat = seatAssignment.getSeat();
                    CourseOffer courseoffer = seat.getCourseoffer();
                    Course course1 = courseoffer.getCourse();
                    String name = course1.getName();
                    boolean temp = name.equalsIgnoreCase(courseName);
                    if (temp) {
                        EmploymentHistroy employmenthistory = alumni.getEmphistory();
                        ArrayList<Employment> employments = employmenthistory.getEmployments();
                        for (Employment e : employments) {
                            totalGrowth += e.getGrowthRate();
                            total++;
                        }
                    }
                }
            }
        }
        return totalGrowth / total;
    }

    public int getCoursePromotionGrowthRatingForCourse(String courseName) {
        int total = 0;
        int totalGrowth = 0;
        for (AlumniProfile alumni : alumniDirectory.getAlumni()) {
            Collection<CourseLoad> allCourses = alumni.getStudnetProfile().getTranscript().getAllCourses();
            for (CourseLoad course : allCourses) {
                ArrayList<SeatAssignment> seatassignments = course.getSeatassignments();
                if (seatassignments != null && seatassignments.size() > 0) {
                    SeatAssignment seatAssignment = seatassignments.get(0);
                    Seat seat = seatAssignment.getSeat();
                    CourseOffer courseoffer = seat.getCourseoffer();
                    Course course1 = courseoffer.getCourse();
                    String name = course1.getName();
                    boolean temp = name.equalsIgnoreCase(courseName);
                    if (temp) {
                        EmploymentHistroy employmenthistory = alumni.getEmphistory();
                        ArrayList<Employment> employments = employmenthistory.getEmployments();
                        for (Employment e : employments) {
                            totalGrowth += e.getPromotionCount();
                            total++;
                        }
                    }
                }
            }
        }
        return totalGrowth / total;
    }

    public Map<Integer, List<Course>> getEnrollmentRatings() {
        Map<Integer, List<Course>> map = new TreeMap<>(Comparator.reverseOrder());
        ArrayList<Course> courseList = courseCatalog.getCourseList();
        for (Course course : courseList) {
            String name = course.getName();
            int courseRating = this.getJobCourseRating(name);

            List<Course> rate = map.get(courseRating);
            if (rate == null) {
                rate = new ArrayList<>();
                map.put(courseRating, rate);
            }
            rate.add(course);
            map.put(courseRating, rate);
        }
        return map;
    }

    public double getAverageGPA(String courseName) {

        int total = 0;
        double totalGPA = 0;
        for (AlumniProfile alumni : alumniDirectory.getAlumni()) {
            Collection<CourseLoad> allCourses = alumni.getStudnetProfile().getTranscript().getAllCourses();
            for (CourseLoad course : allCourses) {
                ArrayList<SeatAssignment> seatassignments = course.getSeatassignments();
                if (seatassignments != null && seatassignments.size() > 0 && seatassignments.get(0).getSeat().getCourseoffer().getCourse().getName().equalsIgnoreCase(courseName)) {
                    for (SeatAssignment sa : seatassignments) {
                        totalGPA += sa.getGrade();
                        total++;
                    }
                }
            }
        }

        return totalGPA / total;
    }

}
