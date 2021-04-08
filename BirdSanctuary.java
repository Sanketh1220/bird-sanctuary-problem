package com.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuary {

    private  List<Bird> allBirds = new ArrayList<>();

    //making this class - instance class
    static BirdSanctuary instance;

    //constructor
    private BirdSanctuary(){
    }

    //instance only if null it creates or else returns instance
    static BirdSanctuary getInstance(){
        if (instance == null) {
            instance = new BirdSanctuary();
//            return instance;
        }
        return instance;
//        return null;
    }

    //method for adding birds and getting count
    public void add(Bird bird) {
        allBirds.add(bird);
        bird.incrementCount();
    }

    public void eatble(){
        for ( Bird bird : allBirds ) {
            bird.eat();
        }
    }

    public void swimmable(){
        for ( Bird bird : allBirds ) {
            if (bird instanceof Swimmable){
                ((Swimmable) bird).swim();
            }
        }
    }

    public void flyable() {
        for ( Bird bird : allBirds ) {
            if (bird instanceof Flyable){
                ((Flyable)bird).fly();
            }
        }
    }
}
