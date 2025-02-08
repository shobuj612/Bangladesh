package chapter.chap.hasi;

import java.util.Random;

public class Seed_Anonymous {

    public static void main(String[] args) {

        Random random1 = new Random(3);
        System.out.print("From random1: ");

        for (int i = 0; i < 10; i++)

            System.out.print(random1.nextInt(1000) + " ");

        Random random2 = new Random(3);

        System.out.print("\nFrom random2: ");

        for (int i = 0; i < 10; i++)

            System.out.print(random2.nextInt(1000) + " ");

        Random random3 = new Random(3); // Seed set to 3
        
        Random random4 = new Random(3); // Seed set to 3

        System.out.println(random3.nextInt()); // Outputs the first random number for random1
        System.out.println(random4.nextInt()); // Outputs the same random number as random1 (since the seed is the same)

        // Seed is the initial value that initializes the random number generator.

        System.out.println("sdfdfdfd");

        // Creating an anonymous object and calling the method directly
        new Car().drive(); // Anonymous object is created here

        // Another example with constructor
        new Car(); // Anonymous object created but not used further
    }
}

class Car {
    // Method that prints car details
    public void drive() {
        System.out.println("The car is driving!");
    }
}
