## Project 2

Design a family of classes that shows all 4 characteristics of the Object-Oriented Programming, i.e. 
* Abstraction
* Encapsulation
* Inheritance
* Polymorphism.
  
Write a test class to show - 
* how to create instances from constructors
* how inheritance and polymorphism works

### Examples:
We are creating a Pet class family in this example - 

`Pet` [ Parent Abstract Class ] 
  1. `Cat` [ Child Class / SubClass ]
  2. `Dog` [ Child Class / SubClass ]

The complete code is in [Example](Example). 

```java

public abstract class Pet {
    protected String name;
    public abstract void makeSound();
}

public class Cat extends Pet {
    public Cat(String myName) {
        name = myName;
    }
    public void makeSound() {
        System.out.println("My Cat " + name + " says: mee mee");
    }
}

public class Dog extends Pet {
    public Dog(String myName) {
        name = myName;
    }
    public void makeSound() {
        System.out.println("My Dog " + name + " says: wow wow");
    }
}

/**
 * Authors: Kai Zhang ...
 */
public class Tests {
    public static void main(String[] args) {
        Pet myCat = new Cat("Gini"); // Create a Cat object
        Pet myDog = new Dog("Weiwei"); // Create a Dog object
        myCat.makeSound();
        myDog.makeSound();
    }
}
```

### How to do it:
* This is a group project.
* Please form or join a group of 3-4 members.
* Please pick a Class family that your group are interested in and discuss it in your group. 
* Collaboratively implement them meeting the requirements.
  
### How to submit it:
* Write your names in the test class "Authors" comment, like what is shown in the given example.
* The leader of your group needs to submit the paper or ppt to [projects/project2](projects/project2)
