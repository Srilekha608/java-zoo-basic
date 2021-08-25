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
public class Cheetah extends Animal {
    
    @Override
    public void speak() {
        System.out.println("I'm an Cheetah!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I just run like a wind.");
    }
    
    @Override
    public void identity(){
         System.out.println("I am the Fastest land animal.");
    }
    
    @Override
    public void diet(){
        System.out.println("I'm a Carnivore.");
    }
    
    @Override
    public void lifeSpan(){
        System.out.println("My average lifeSpan is 10-12 years.");
    }
}
