/**
 * Authors: Kai Zhang
 */

public class Tests {
    public static void main(String[] args) {
        Pet myCat = new Cat("Gini"); // Create a Cat object
        Pet myDog = new Dog("Weiwei"); // Create a Dog object
        myCat.makeSound();
        myDog.makeSound();
    }
}