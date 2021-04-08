package com.birdsanctuary;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuary {

//    private  List<Bird> allBirds = new ArrayList<>();

    private Set<Bird> allBirds = new HashSet<>();

    //instance class
    static BirdSanctuary instance;

    //constructor
    private BirdSanctuary(){
    }

    //instance only if null it creates or else returns instance
    public synchronized static BirdSanctuary getInstance(){
        if (instance == null) {
            instance = new BirdSanctuary();
        }
        return instance;
    }

    //method for adding birds and getting count
    public void add(Bird bird) {
        boolean birdTest = allBirds.stream().anyMatch(i -> i.equals(bird));
        if (!birdTest) {
            allBirds.add(bird);
            bird.incrementCount();
        }
        else {
            System.out.println("Bird is already added.");
        }
    }

    public void remove(Bird bird){
        allBirds.remove(bird);
        bird.decrementCount();
    }

    public void eatable(){
        for ( Bird bird : allBirds ) {
            if (bird instanceof Eatable){
                ((Eatable) bird).eat();
            }
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
