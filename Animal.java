import java.util.ArrayList;

public class Animal {

    // ===== Instance Variables =====
    private String animalType;
    private int animalIndex = -1;

    // ===== Static Variables =====
    private static int animalCount = 0;

    // Optional: a fixed menu of animal types to choose from
    private static final String[] TYPES = {
        "Lion", "Bear", "Elephant", "Giraffe", "Zebra", "Penguin", "Snake", "Monkey"
    };
    private static final String[] SOUNDS = {
        "Roar", "Browh", "Eeeeeee", "uuuuuuu(girafe)", "iiiiiiiii(zebra)", "i-i-i(penguin)", "Ssssss", "Ou-ou"
    };

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: choose a random animal type
     * REQUIRED: increment animalCount
     */
    public Animal() {
        // TODO: set animalType to a random type from TYPES
        // TODO: increment animalCount
        this.animalType = randomAnimalType();
        animalCount += 1;
    }

    /**
     * Parameterized constructor:
     * REQUIRED: set animalType to type
     * REQUIRED: increment animalCount
     */
    public Animal(String type) {
        // TODO: set animalType
        // TODO: increment animalCount
        this.animalType = type;
        animalCount += 1;
    }

    // ===== Getters / Setters =====

    public String getAnimalType() {
        return animalType;
    }

    // ===== Class-level getter =====
    public static int getAnimalCount() {
        return animalCount;
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: returns a sound based on animalType.
     * You may choose your own sounds; keep it consistent.
     */
    public String speak() {
        // TODO: return a sound depending on animalType
        // Example idea:
        // if (animalType.equals("Lion")) return "Roar!";
        if(this.animalIndex < 0){
            return"-sound-";
        }
        else{
            return this.SOUNDS[this.animalIndex];
        }
    }

    /**
     * OPTIONAL helper: return a random animal type from TYPES.
     */
    private String randomAnimalType() {
       this.animalIndex = (int)(Math.random()*this.TYPES.length);
       return this.TYPES[animalIndex];
    }

    public String toString() {
        return (animalType + " ");
    }
}