package com.birdsanctuary;

public class Main {

    public static void main(String[] args) {

        BirdSanctuary birdSanctuary = BirdSanctuary.getInstance();

        Penguin firstPenguin = new Penguin();
        Duck firstDuck = new Duck();
        Parrot firstParrot = new Parrot();
        Duck newDuck = new Duck();
        ToyDuck toyDuck = new ToyDuck();

        birdSanctuary.add(firstDuck);
        birdSanctuary.add(firstParrot);
        birdSanctuary.add(firstPenguin);
        birdSanctuary.add(newDuck);
        birdSanctuary.add(toyDuck);
        birdSanctuary.add(toyDuck);
        birdSanctuary.remove(newDuck);

        birdSanctuary.eatable();
        birdSanctuary.swimmable();
        birdSanctuary.flyable();

        System.out.println("Count of Ducks in bird sanctuary: " + Duck.count);
        System.out.println("Count of Parrots in bird sanctuary: " + Parrot.count);
        System.out.println("Count of Penguins in bird sanctuary: " + Penguin.count);
        System.out.println("Count of ToyDuck in bird sanctuary: " + ToyDuck.count);
    }
}

