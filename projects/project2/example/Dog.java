public class Dog extends Pet {

    public Dog(String myName) {
        name = myName;
    }

    public void makeSound() {
        System.out.println("My Dog " + name + " says: wow wow");
    }
}