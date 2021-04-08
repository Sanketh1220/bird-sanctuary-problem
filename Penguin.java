package com.birdsanctuary;

public class Penguin extends Bird implements Swimmable {
    static int count;


    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void incrementCount() {
        count++;
    }

//    @Override
//    public int getCount() {
//        return 0;
//    }

    @Override
    public void swim() {
        System.out.println("Pengiun is swimming");
    }
}

