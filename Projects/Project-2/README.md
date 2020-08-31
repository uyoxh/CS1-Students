## Project 2

Design a family of classes that shows all 4 characteristics of the Object-Oriented Programming, i.e. 
* Abstraction
* Encapsulation
* Inheritance
* Polymorphism.

### Examples:
We are creating a Pet class family in this example - 

`Pet` [ Parent Abstract Class ] 
  1. `Cat` [ Child Class / SubClass ]
  2. `Dog` [ Child Class / SubClass ]

The complete code is in [Example](Example). 

```
public abstract class Pet {
  private String name;
  public abstract void makeSound();
}

public class Cat extends Pet {
  public void makeSound() {
    System.out.println("The Cat says: wee wee");
  }
}

public class Dog extends Pet {
  public void makeSound() {
    System.out.println("The dog says: bow wow");
  }
}

public class Tests {
  public static void main(String[] args) {
    Pet myCat = new Cat();  // Create a Cat object
    Pet myDog = new Dog();  // Create a Dog object
    myCat.makeSound();
    myDog.makeSound();
  }
}
```

### How to do it:
* Please pick a topic that your group are interested in and discuss it in your group. 
* Collaboratively write a paper or ppt (presentation) with diagrams describing and showing how the parts in the system working together to solve the problem.

### How to submit it:
* Write your names on the first page under the title.
* The leader of your group needs to submit the paper or ppt to [Projects/Project-1](Projects/Project-1)
