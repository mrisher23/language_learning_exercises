package com.github.mrisher23.documentation.animals;

/**
 * The Elephant class represents an Elephant animal.
 *
 * @since 1.0
 * @author mrisher23
 */
public class Elephant implements Animal {

    /**
     * The name of this animal
     */
    //while we can add documentation for this private variable, it is not necessary to use JavaDocs for private
    //variables or methods.
    private String name;

    /**
     * The default constructor for when the animal name is not known.
     */
    public Elephant() {}

    /**
     * Makes a new Elephant and gives it a name
     * @param name name of the animal
     */
    public Elephant(String name){
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Stomp");
    }

    @Override
    public String speak() {
        return "trumpet";
    }

    @Override
    public boolean isMammal() {
        return true;
    }

    @Override
    public boolean isFish() {
        return false;
    }

    @Override
    public boolean isBird() {
        return false;
    }

    @Override
    public boolean isReptile() {
        return false;
    }

    @Override
    public boolean isAmphibian() {
        return false;
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
