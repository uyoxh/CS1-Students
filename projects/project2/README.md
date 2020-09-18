## Project 2 Java and Object-Oriented Programming

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

The complete code is in [Example](example). 

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
* All code has to be compilable and tested.
  
### How to submit it:
* Create a `your_group_name/README.md` file for your group in [projects/project2](.). 
  * Note: `your_group_name` is your group name which should be different from others.
  * Write your group member's names and contributions in the `README.md` file and add any notes there if you have.
  * Then click the `Commit new file` button at the bottom.
  * Example: https://github.com/mkz100/CS1-Students/blob/master/projects/project2/my_group_name_sample/README.md
  * Follow steps here https://github.com/KirstieJane/STEMMRoleModels/wiki/Creating-new-folders-in-GitHub-repository-via-the-browser
* Upload the source code files to the `your_group_name` folder
  * navigate to the `your_group_name` folder: click the `Add file` button -> `Upload files`
