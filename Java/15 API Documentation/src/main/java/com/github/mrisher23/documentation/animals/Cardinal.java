package com.github.mrisher23.documentation.animals;

public class Cardinal implements Animal {
    private String name;

    public Cardinal(){}

    public Cardinal(String name){
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
        System.out.println("flap");
    }

    @Override
    public String speak() {
        return "chirp";
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
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
