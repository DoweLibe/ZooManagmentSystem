/*  Zoo Management System
    Compiled using: JDoodle (online Java compiler)
*/

// Interface for Module 8
interface Actions {
    void feed();
    void clean();
}

// Abstract Animal class
abstract class Animal implements Actions {
    protected String name;
    protected String species;
    protected int age;

    public Animal(String name, String species, int age) {
        this.name= name;
        this.species = species;
        this.age = age;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println(name + " (" + species + "), Age: " + age);
    }
}

//Lion subclass
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, "Lion", age);
    }
     @Override
public void makeSound() {
System.out.println(name + " roars!");
}
    @Override
public void feed() {
System.out.println(name + " The lion has been fed.");
}
@Override
public void clean() {
System.out.println(name + " The lion enclosure has been cleaned.");
}
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, "Elephant", age);
    }
     @Override
public void makeSound() {
System.out.println(name + " trumpets! ");
}
    @Override
public void feed() {
System.out.println(name + " The elephant is eating. ");
}
@Override
public void clean() {
System.out.println(" The elephant enclosure for " + name + " has been cleaned.");
}
}

class Giraffe extends Animal {
    public Giraffe(String name, int age) {
        super(name, "Giraffe", age);
    }
     @Override
public void makeSound() {
System.out.println(name + " makes a soft bleat.");
}
    @Override
public void feed() {
System.out.println(name + "The giraffe is eating leaves.");
}
@Override
public void clean() {
System.out.println("The Giraffe enclosure for " + name + " has been cleaned.");
}
}
// MAIN PROGRAM (2D ARRAY)
public class Main {
    public static void main(String[] args) {

        // Create 3x5 zoo grid
        Animal[][] zoo = new Animal[3][5];

        // Fill the zoo
        zoo[0][0] = new Lion("Simba", 5);
        zoo [0][1] = new Elephant("Dumbo", 10);
        zoo [0][2] = new Giraffe("Melman", 7);

        zoo[1][0] = new Lion("Nala", 4);
        zoo [1][1] = new Elephant("Barbar", 12);

        zoo [2][0] = new Giraffe("Stretch", 6);

        // Feed all animals
        System.out.println("Feeding all animals: ");
        for (int r = 0; r < zoo.length; r++) {
            for (int c = 0; c < zoo[r].length; c++) {
                if (zoo[r][c] != null) {
                    zoo[r][c].feed();
                }
        }
        }

        // Clean all enclosures
          System.out.println("Cleaning all enclosures");
        for (int r = 0; r < zoo.length; r++) {
            for (int c = 0; c < zoo[r].length; c++) {
                if (zoo[r][c] != null) {
                    zoo[r][c].clean();
                }
        }
        }
        // Make all animals sound off
       System.out.println(" Animal sounds: ");
          for (int r = 0; r < zoo.length; r++) {
            for (int c = 0; c < zoo[r].length; c++) {
                if (zoo[r][c] != null) {
                    zoo[r][c].makeSound();
                }
            }
        }
    }
}
