package com.birdsanctuary;

public class Main {

    public static void main(String[] args) {

        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();
//        BirdSanctuary newSanc = BirdSanctuary.getInstance();

        Penguin firstPenguin = new Penguin();
        Duck firstDuck = new Duck();
        Parrot firstParrot = new Parrot();
        Duck newDuck = new Duck();
//        Penguin secPen = new Penguin();

        birdSanctuary.add(firstDuck);
        birdSanctuary.add(firstParrot);
        birdSanctuary.add(firstPenguin);
        birdSanctuary.add(newDuck);
//        newSanc.add(secPen);


        birdSanctuary.eatble();
        birdSanctuary.swimmable();
        birdSanctuary.flyable();

        System.out.println("Count of Ducks in bird sanctuary: " + Duck.count);
        System.out.println("Count of Parrots in bird sanctuary: " + Parrot.count);
        System.out.println("Count of Penguins in bird sanctuary: " + Penguin.count);
    }
}

