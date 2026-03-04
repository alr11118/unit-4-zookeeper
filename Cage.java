import java.util.ArrayList;

public class Cage {

    // ===== Instance Variables =====
    private ArrayList<Animal> animals;

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: create animals list
     * REQUIRED: add at least 1 random Animal
     */
    public Cage() {
        // TODO: instantiate animals
        // TODO: add at least one new Animal() to the list
        animals = new ArrayList<Animal>();
        animals.add(new Animal());
    }

    /**
     * Parameterized constructor:
     * REQUIRED: create animals list
     * REQUIRED: add the provided animal to the list
     */
    public Cage(Animal animal) {
        // TODO: instantiate animals
        // TODO: add provided animal
        animals = new ArrayList<Animal>();
        animals.add(animal);
    }

    // ===== Getters / Setters (careful!) =====
    public int getNumAnimals() {
        // TODO: return the number of animals in the cage
        return animals.size();
    }

    public Animal getAnimalAtIndex(int index) {
        // TODO: return the animal at index (or null if invalid)
        if(animals.size()-1 < index) {
         return null;
        }
        return animals.get(index);
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: add an animal;
     */
    public void addAnimal(Animal animal) {
      this.animals.add(animal);
    }

    /**
     * REQUIRED: remove an animal if it exists; return true if removed.
     */
    public boolean removeAnimal(Animal animal) {
      return (this.animals.remove(animal));
    }

    @Override
    public String toString() {
        // TODO: return a friendly description including all animals
        // Example: "Cage with 3 animals: [Animal{...}, Animal{...}]"
        String description = "Cage with " + animals.size() + " animals: ";
        for(Animal animal : animals) {
         description += animal + " ,";
        }
        return description;
    }
}