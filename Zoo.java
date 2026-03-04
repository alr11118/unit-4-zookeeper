import java.util.ArrayList;

public class Zoo {

    // ===== Instance Variables =====
    // Create (but do not instantiate) a private instance variable called "cages".
    // This variable is an ArrayList of Cages.
    private ArrayList<Cage> cages;


    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: instantiate cages list
     * REQUIRED: create 3 cages, each with starting animal(s)
     */
    public Zoo() {
        // TODO: instantiate cages
        // TODO: add 3 new Cage() objects to cages
        this.cages = new ArrayList<Cage>();
        cages.add(new Cage());
        cages.add(new Cage());
        cages.add(new Cage()); 
    }

    /**
     * Overloaded constructor example:
     * REQUIRED: demonstrate constructor overloading.
     * Creates a Zoo with numCages cages.
     */
    public Zoo(int numCages) {
        // TODO: instantiate cages
        // TODO: add numCages cages (each should start with at least one animal)
        this.cages = new ArrayList<Cage>();
        for(int i = 0; i < numCages; i++) {
         cages.add(new Cage());
        }
    }

    // ===== Methods =====

    /**
     * REQUIRED: return total Animal objects ever created.
     * Must use Animal's static counter.
     */
    public int howManyAnimals() {
        // TODO: return Animal.getAnimalCount()
        return Animal.getAnimalCount();
    }

    /**
     * REQUIRED:
     * Add the animal to the cage ONLY IF the cage belongs to this zoo.
     * Return true if successful, false otherwise.
     */
    public boolean putAnimalInCage(Cage cage, Animal animal) {
        // TODO:
        // 1) check whether 'cage' is in 'cages'
        // 2) if yes, add animal to that cage and return true
        // 3) otherwise return false
        if(cages.indexOf(cage) < 0) {
         return false;
        } 
        else {
         cage.addAnimal(animal);
         return true;
        }
    }

    /**
     * REQUIRED: move an animal between cages
     * only if BOTH cages belong to this Zoo.
     */
    public boolean moveAnimal(Cage from, Cage to, Animal animal) {
        // TODO:
        // - verify from and to are in this Zoo
        // - verify animal is in from
        // - remove from 'from' and add to 'to'
        if(cages.indexOf(from) < 0 && cages.indexOf(to) < 0) {
         return false;
        } 
        else {
         from.removeAnimal(animal);
         to.addAnimal(animal);
         return true;
        }
    }

    // ===== Getters =====

    public ArrayList<Cage> getCages() {
        return cages;
    }

    public Cage getCageAtIndex(int index) {
        // TODO: return cage at index (or null if invalid)
        return cages.get(index);
    }

    public String toString() {
        // TODO: return a readable multi-line summary of the zoo and its cages
        // (How many cages, and each cage's contents.)
        String response =  "The Zoo has " + cages.size() + " cages:";
        for(Cage cage : cages) {
         response += cage + "   ";
        }
        return response;
    }

    // ===== Main for Testing (not graded) =====
    public static void main(String[] args) {

        // Create a zoo with default constructor
        Zoo zoo1 = new Zoo();
        // Demonstrate howManyAnimals
        System.out.println(zoo1.howManyAnimals());
        // Try adding a new animal into cage 0
        zoo1.putAnimalInCage(zoo1.getCageAtIndex(0), new Animal());
        // Move an animal from one cage to another
        zoo1.moveAnimal(zoo1.getCageAtIndex(0), zoo1.getCageAtIndex(1), zoo1.getCageAtIndex(0).getAnimalAtIndex(0));
        // Move an animal from one cage to a cage that doesn't exist in this Zoo and see what gets
        // returned from moveAnimal
        zoo1.moveAnimal(new Cage(), zoo1.getCageAtIndex(1), zoo1.getCageAtIndex(0).getAnimalAtIndex(0));
        // Try adding to a cage that does NOT belong to this zoo
        zoo1.putAnimalInCage(new Cage(), new Animal());
        // Speak demo
        System.out.println(zoo1.getCageAtIndex(0).getAnimalAtIndex(0).speak());
    }
}