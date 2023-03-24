package com.github.mrisher23.documentation.animals;

/*
 * The Animal interface shows all the different things that an Animal can do that we may want to keep track of.
 * No need to worry too much about what an Interface is or how it is used just yet. We just want a wide variety of files
 * to demonstrate what documentation looks like.
 *
 * To start a comment block for official documentation we start it like a block comment, but we use a double ** instead
 * of just one. Within JavaDoc, we can use HTML tags (remember to escape special HTML characters if they aren't being
 * used in a tag. JavaDoc also supports numerous @tags which document specific special information about classes and
 * functions.
 */

/**
 * The Animal interface is a root interface that defines behaviors and attributes for different animals.
 *
 * @since 1.0
 * @author mrisher23
 */
public interface Animal {

    /**
     * This sets the name of the animal if it has one.
     * @param name the animal's name
     */
    public void setName(String name);

    //we forgot documentation here
    public String getName();

    /**
     * Moves the animal by whatever means it can move
     */
    public void move();

    /**
     * Makes the animal speak.
     * @return the sound that the animal makes.
     */
    public String speak();

    /**
     * Determines if this animal is a mammal
     * @return true if this is a mammal, otherwise false
     */
    public boolean isMammal();

    /**
     * Determines if this animal is a fish
     * @return true if this is a fish, otherwise false
     */
    public boolean isFish();

    /**
     * Determines if this animal is a Bird
     * @return true if this is a bird, otherwise false
     */
    public boolean isBird();

    /*
    This is not a Javadoc comment and will not appear in the documentation produced.
     */
    public boolean isReptile();

    /**
     * Determines if this animal is an Amphibian
     * @return true if this is an amphibian otherwise false
     */
    public boolean isAmphibian();

    /**
     * Gets the number of legs that this animal has.
     * @return the number of legs
     */
    public int numberOfLegs();

    /**
     * Determines if this animal can fly.
     * @return true if it can fly otherwise false
     */
    public boolean canFly();

    /**
     * Determines if this animal can swim.
     * @return true if it can swim otherwise false
     */
    public boolean canSwim();
}
