package com.oop_pub.junit.ex1;

import org.junit.Assert;

public class Test {

    private Zoo zoo;

    @org.junit.Before
    public void setUp() {
        zoo = new Zoo();
    }

    @org.junit.Test
    public void testAddAnimal() {
        Animal wolf = new Animal("mammals", "wolf");

        zoo.addAnimal(wolf);

        Assert.assertEquals(zoo.getAnimals().get(zoo.getAnimals().size() - 1), wolf);
    }

    @org.junit.Test
    public void testRemoveAnimal() {
        Animal wolf = new Animal("mammals", "wolf");

        zoo.addAnimal(wolf);
        zoo.removeAnimal(wolf);

        Assert.assertTrue(0 == zoo.size());
    }

    @org.junit.Test
    public void testAreAnimalsInZoo() {
        zoo.addAnimal(new Animal("reptiles", "snake"));

        if (!zoo.areAnimals()) {
            Assert.fail("fail");
        }
    }

    @org.junit.Test
    public void testGetAnimals() {
        zoo.addAnimal(new Animal("mammals", "wolf"));
        zoo.addAnimal(new Animal("reptiles", "snake"));

        Assert.assertFalse(zoo.getAnimals().isEmpty());
    }

}
