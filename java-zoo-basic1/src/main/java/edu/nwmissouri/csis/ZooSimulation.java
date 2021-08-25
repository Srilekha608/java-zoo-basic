/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis;

/**
 *
 * @author S545118
 */
public class ZooSimulation {
    
    static String greeting = "Welcome to Srilekha's wildpark!";
        
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase());
      
      Cheetah object = new Cheetah();
      object.speak();
      object.move();
      object.identity();
      object.diet();
      object.lifeSpan();
      
    }
}