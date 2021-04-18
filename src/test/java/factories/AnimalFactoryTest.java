package factories;

import animals.Animal;
import animals.Animals;
import animals.Fox;
import animals.Wolf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AnimalFactoryTest {
    public AnimalFactory animalFactory;

    @Before
    public void published() {
        animalFactory = new AnimalFactory();
    }

    @Test
    public void createFox() {
        Animal fox = animalFactory.create(Animals.FOX);
        assertEquals(Fox.class, fox.getClass());
    }

    @Test
    public void createWolf() {
        Animal wolf = animalFactory.create(Animals.WOLF);
        assertEquals(Wolf.class, wolf.getClass());
    }
}