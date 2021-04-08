package com.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {
    static int count;
    public void fly (){
        System.out.println("Duck is flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating fish");
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
        System.out.println("Duck is swimming");
    }

}

