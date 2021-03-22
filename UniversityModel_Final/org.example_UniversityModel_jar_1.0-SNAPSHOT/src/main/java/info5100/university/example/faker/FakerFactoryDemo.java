/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.faker;

import com.github.javafaker.Faker;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.AlumniDirectory;
import info5100.university.example.Persona.AlumniProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mananshah
 */
public class FakerFactoryDemo {

    public static Department getDepartment() {
        Faker fake = FakerUtil.faker;
        Department dept = new Department(String.valueOf(fake.name()));
        PersonDirectory Persondir = dept.getPersonDirectory();
        StudentDirectory Studentdir = dept.getStudentDirectory();
        AlumniDirectory Alumnidir = dept.getAlumnidirectory();
        EmployerDirectory Employerdir = dept.getEmployerdirectory();

        Person newPerson1 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson2 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson3 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson4 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson5 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson6 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson7 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson8 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson9 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person newPerson10 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        StudentProfile sp1 = Studentdir.newStudentProfile(newPerson1);
        StudentProfile sp2 = Studentdir.newStudentProfile(newPerson2);
        StudentProfile sp3 = Studentdir.newStudentProfile(newPerson3);
        StudentProfile sp4 = Studentdir.newStudentProfile(newPerson4);
        StudentProfile sp5 = Studentdir.newStudentProfile(newPerson5);
        StudentProfile sp6 = Studentdir.newStudentProfile(newPerson6);
        StudentProfile sp7 = Studentdir.newStudentProfile(newPerson7);
        StudentProfile sp8 = Studentdir.newStudentProfile(newPerson8);
        StudentProfile sp9 = Studentdir.newStudentProfile(newPerson9);
        StudentProfile sp10 = Studentdir.newStudentProfile(newPerson10);

        Alumnidir.newAlumniProfile(sp1, 2020);
        Alumnidir.newAlumniProfile(sp2, 2020);
        Alumnidir.newAlumniProfile(sp3, 2020);
        Alumnidir.newAlumniProfile(sp4, 2020);
        Alumnidir.newAlumniProfile(sp5, 2020);
        Alumnidir.newAlumniProfile(sp6, 2020);
        Alumnidir.newAlumniProfile(sp7, 2020);
        Alumnidir.newAlumniProfile(sp8, 2020);
        Alumnidir.newAlumniProfile(sp9, 2020);
        Alumnidir.newAlumniProfile(sp10, 2020);

        FacultyDirectory Facultydir = dept.getFacultydirectory();
        Person fPerson1 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person fPerson2 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Person fPerson3 = Persondir.newPerson(String.valueOf(fake.number()), fake.name().lastName(), fake.name().firstName());
        Facultydir.newFacultyProfile(fPerson1);
        Facultydir.newFacultyProfile(fPerson2);
        Facultydir.newFacultyProfile(fPerson3);

        CourseSchedule courseschedule = dept.newCourseSchedule("Fall2020");
        int count = 0;
        String num = fake.numerify("0123456789");
        Course course1 = dept.newCourse(num, fake.educator().course(), 4);
        Course course2 = dept.newCourse(num, fake.educator().course(), 4);
        Course course3 = dept.newCourse(num, fake.educator().course(), 4);
        CourseOffer courseoffer1 = courseschedule.newCourseOffer(course1, Facultydir.getTeacherlist().get(count));
        CourseOffer courseoffer2 = courseschedule.newCourseOffer(course2, Facultydir.getTeacherlist().get(count));
        CourseOffer courseoffer3 = courseschedule.newCourseOffer(course3, Facultydir.getTeacherlist().get(count));
        courseoffer1.generatSeats(10);
        courseoffer2.generatSeats(10);
        courseoffer3.generatSeats(10);
        CourseLoad courseload1 = sp1.newCourseLoad("Fall2020");
        SeatAssignment sa1 = courseload1.newSeatAssignment(courseoffer1);
        SeatAssignment sa2 = courseload1.newSeatAssignment(courseoffer2);
        SeatAssignment sa3 = courseload1.newSeatAssignment(courseoffer3);
        sa1.getSeat().setStudentReview(5);
        sa1.setGrade(3.5);
        sa2.getSeat().setStudentReview(5);
        sa2.setGrade(3.5);
        sa3.getSeat().setStudentReview(5);
        sa3.setGrade(3.5);

        CourseLoad courseload2 = sp2.newCourseLoad("Fall2020");
        SeatAssignment sa4 = courseload2.newSeatAssignment(courseoffer1);
        SeatAssignment sa5 = courseload2.newSeatAssignment(courseoffer2);
        SeatAssignment sa6 = courseload2.newSeatAssignment(courseoffer3);
        sa4.getSeat().setStudentReview(5);
        sa4.setGrade(3.5);
        sa5.getSeat().setStudentReview(5);
        sa5.setGrade(3.5);
        sa6.getSeat().setStudentReview(5);
        sa6.setGrade(3.5);

        CourseLoad courseload3 = sp3.newCourseLoad("Fall2020");
        SeatAssignment sa7 = courseload3.newSeatAssignment(courseoffer1);
        SeatAssignment sa8 = courseload3.newSeatAssignment(courseoffer2);
        SeatAssignment sa9 = courseload3.newSeatAssignment(courseoffer3);
        sa7.getSeat().setStudentReview(5);
        sa7.setGrade(3.5);
        sa8.getSeat().setStudentReview(5);
        sa8.setGrade(3.5);
        sa9.getSeat().setStudentReview(5);
        sa9.setGrade(3.5);

        CourseLoad courseload4 = sp4.newCourseLoad("Fall2020");
        SeatAssignment sa10 = courseload4.newSeatAssignment(courseoffer1);
        SeatAssignment sa11 = courseload4.newSeatAssignment(courseoffer2);
        SeatAssignment sa12 = courseload4.newSeatAssignment(courseoffer3);
        sa10.getSeat().setStudentReview(5);
        sa10.setGrade(3.5);
        sa11.getSeat().setStudentReview(5);
        sa11.setGrade(3.5);
        sa12.getSeat().setStudentReview(5);
        sa12.setGrade(3.5);

        CourseLoad courseload5 = sp5.newCourseLoad("Fall2020");
        SeatAssignment sa13 = courseload5.newSeatAssignment(courseoffer1);
        SeatAssignment sa14 = courseload5.newSeatAssignment(courseoffer2);
        SeatAssignment sa15 = courseload5.newSeatAssignment(courseoffer3);
        sa13.getSeat().setStudentReview(5);
        sa13.setGrade(3.5);
        sa14.getSeat().setStudentReview(5);
        sa14.setGrade(3.5);
        sa15.getSeat().setStudentReview(5);
        sa15.setGrade(3.5);

        CourseLoad courseload6 = sp6.newCourseLoad("Fall2020");
        SeatAssignment sa16 = courseload6.newSeatAssignment(courseoffer1);
        SeatAssignment sa17 = courseload6.newSeatAssignment(courseoffer2);
        SeatAssignment sa18 = courseload6.newSeatAssignment(courseoffer3);
        sa16.getSeat().setStudentReview(5);
        sa16.setGrade(3.5);
        sa17.getSeat().setStudentReview(5);
        sa17.setGrade(3.5);
        sa18.getSeat().setStudentReview(5);
        sa18.setGrade(3.5);

        CourseLoad courseload7 = sp7.newCourseLoad("Fall2020");
        SeatAssignment sa19 = courseload7.newSeatAssignment(courseoffer1);
        SeatAssignment sa20 = courseload7.newSeatAssignment(courseoffer2);
        SeatAssignment sa21 = courseload7.newSeatAssignment(courseoffer3);
        sa19.getSeat().setStudentReview(5);
        sa19.setGrade(3.5);
        sa20.getSeat().setStudentReview(5);
        sa20.setGrade(3.5);
        sa21.getSeat().setStudentReview(5);
        sa21.setGrade(3.5);

        CourseLoad courseload8 = sp8.newCourseLoad("Fall2020");
        SeatAssignment sa22 = courseload8.newSeatAssignment(courseoffer1);
        SeatAssignment sa23 = courseload8.newSeatAssignment(courseoffer2);
        SeatAssignment sa24 = courseload8.newSeatAssignment(courseoffer3);
        sa22.getSeat().setStudentReview(5);
        sa22.setGrade(3.5);
        sa23.getSeat().setStudentReview(5);
        sa23.setGrade(3.5);
        sa24.getSeat().setStudentReview(5);
        sa24.setGrade(3.5);

        CourseLoad courseload9 = sp9.newCourseLoad("Fall2020");
        SeatAssignment sa25 = courseload9.newSeatAssignment(courseoffer1);
        SeatAssignment sa26 = courseload9.newSeatAssignment(courseoffer2);
        SeatAssignment sa27 = courseload9.newSeatAssignment(courseoffer3);
        sa25.getSeat().setStudentReview(5);
        sa25.setGrade(3.5);
        sa26.getSeat().setStudentReview(5);
        sa26.setGrade(3.5);
        sa27.getSeat().setStudentReview(5);
        sa27.setGrade(3.5);

        CourseLoad courseload10 = sp10.newCourseLoad("Fall2020");
        SeatAssignment sa28 = courseload10.newSeatAssignment(courseoffer1);
        SeatAssignment sa29 = courseload10.newSeatAssignment(courseoffer2);
        SeatAssignment sa30 = courseload10.newSeatAssignment(courseoffer3);
        sa28.getSeat().setStudentReview(5);
        sa28.setGrade(3.5);
        sa29.getSeat().setStudentReview(5);
        sa29.setGrade(3.5);
        sa30.getSeat().setStudentReview(5);
        sa30.setGrade(3.5);

        EmployerProfile EmployerProfile1 = Employerdir.newEmployerProfile(fake.company().name());
        EmployerProfile EmployerProfile2 = Employerdir.newEmployerProfile(fake.company().name());
        CourseSchedule courseSchedule = dept.getCourseSchedule("Fall2020");
        ArrayList<CourseOffer> schedule = courseSchedule.getSchedule();
        ArrayList<CourseOffer> relevantCourses = new ArrayList();
        relevantCourses.add(courseoffer1);
        relevantCourses.add(courseoffer2);
        relevantCourses.add(courseoffer3);
        Random random = new Random();
        Employment employement1 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement1.incrementSalary(2021, random.nextInt(10000) + employement1.getCurrentSalary());
        employement1.promoteEmploye(random.nextInt(5));
        Employment employement2 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement2.incrementSalary(2021, random.nextInt(10000) + employement2.getCurrentSalary());
        employement2.promoteEmploye(random.nextInt(5));
        Employment employement3 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement3.incrementSalary(2021, random.nextInt(10000) + employement3.getCurrentSalary());
        employement3.promoteEmploye(random.nextInt(5));
        Employment employement4 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement4.incrementSalary(2021, random.nextInt(10000) + employement4.getCurrentSalary());
        employement4.promoteEmploye(random.nextInt(5));
        Employment employement5 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement5.incrementSalary(2021, random.nextInt(10000) + employement5.getCurrentSalary());
        employement5.promoteEmploye(random.nextInt(5));
        Employment employement6 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement6.incrementSalary(2021, random.nextInt(10000) + employement6.getCurrentSalary());
        employement6.promoteEmploye(random.nextInt(5));
        Employment employement7 = EmployerProfile1.newEmployement(fake.job().title(), relevantCourses, 10000, 2020);
        employement7.incrementSalary(2021, random.nextInt(10000) + employement7.getCurrentSalary());
        employement7.promoteEmploye(random.nextInt(5));


        AlumniProfile alumniprofile1 = Alumnidir.getAlumni().get(0);
        AlumniProfile alumniprofile2 = Alumnidir.getAlumni().get(1);
        AlumniProfile alumniprofile3 = Alumnidir.getAlumni().get(2);
        AlumniProfile alumniprofile4 = Alumnidir.getAlumni().get(3);
        AlumniProfile alumniprofile5 = Alumnidir.getAlumni().get(4);
        AlumniProfile alumniprofile6 = Alumnidir.getAlumni().get(5);
        AlumniProfile alumniprofile7 = Alumnidir.getAlumni().get(6);
        AlumniProfile alumniprofile8 = Alumnidir.getAlumni().get(7);
        AlumniProfile alumniprofile9 = Alumnidir.getAlumni().get(8);
        AlumniProfile alumniprofile10 = Alumnidir.getAlumni().get(9);
     
        
        
        alumniprofile1.newEmployment(employement1);
        alumniprofile2.newEmployment(employement2);
        alumniprofile3.newEmployment(employement3);
        alumniprofile4.newEmployment(employement4);
        alumniprofile5.newEmployment(employement5);
        alumniprofile6.newEmployment(employement6);
        alumniprofile7.newEmployment(employement7);
        
        
        return dept;
    }
}
