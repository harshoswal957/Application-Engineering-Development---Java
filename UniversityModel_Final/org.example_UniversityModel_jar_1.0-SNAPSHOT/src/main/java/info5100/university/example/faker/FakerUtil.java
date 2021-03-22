/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.faker;

import com.github.javafaker.Faker;
import java.util.Random;

/**
 *
 * @author mananshah
 */
public class FakerUtil {
    public static Faker faker = new Faker(new Random(25));
}
