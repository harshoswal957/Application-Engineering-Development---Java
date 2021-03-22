/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author mananshah
 */
public class Course {
    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour
    public Course(String numb, String name, int ch){
        this.number = numb;
        this.name = name;
        this.credits = ch;   
    }
    public String getCOurseNumber(){
        return number;
    }
    
    public int getCoursePrice(){
        return price*credits;
        
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" + "number=" + number + ", name=" + name + '}';
    }
    
    
}
