
public class Cat extends Pet {

    public Cat(String myName) {
        name = myName;
    }

    public void makeSound() {
        System.out.println("My Cat " + name + " says: mee mee");
    }
}