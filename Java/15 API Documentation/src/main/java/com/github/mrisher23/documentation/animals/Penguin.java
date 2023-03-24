package com.github.mrisher23.documentation.animals;

/**
 * The Penguin class represents a penguin animal
 *
 * @since 1.0
 * @author mrisher23
 */
public class Penguin implements Animal {
    private String name;

    /**
     * Creates a new Penguin
     */
    public Penguin() {}

    /**
     * Creates a new Penguin with a name.
     * @param name the name of this penguin
     */
    public Penguin(String name) {
        setName(name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println("waddle");
    }

    @Override
    public String speak() {
        return "quack?";    //I know quack is more of a duck thing, but isn't a penguin sound similar?
    }

    @Override
    public boolean isMammal() {
        return false;
    }

    @Override
    public boolean isFish() {
        return false;
    }

    @Override
    public boolean isBird() {
        return true;
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
        return 2;
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
