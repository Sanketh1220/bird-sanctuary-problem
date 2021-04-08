package com.birdsanctuary;

public class Parrot extends Bird implements Flyable {
    static int count;
    public void fly(){
        System.out.println("Parrot is flying");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating fruits");
    }

    @Override
    public void incrementCount() {
        count++;
    }

//    @Override
//    public int getCount() {
//        return 0;
//    }
}

