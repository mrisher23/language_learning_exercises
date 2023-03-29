package com.github.mrisher23.documentation.animals;

/**
 * This snail class represents a snail animal
 */
public class Snail implements Animal {
    private String name;

    /**
     * Creates a new Snail
     */
    public Snail(){}

    /**
     * Creates a new snail with a name
     * @param name the name of the snail
     */
    public Snail(String name){
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
        System.out.println("slither");
    }

    @Override
    public String speak() {
        return "";
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
        return 0;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
