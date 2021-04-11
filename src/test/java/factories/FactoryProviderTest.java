package factories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FactoryProviderTest {
    @Test
    public void getFactoryAnimal() {
        AnimalFactory animalFactory = (AnimalFactory) FactoryProvider.getFactory(Factories.ANIMAL_FACTORY);
        assertEquals(AnimalFactory.class, animalFactory.getClass());
    }

    @Test
    public void getFactoryCofee() {
        CofeeFactory cofeeFactory = (CofeeFactory) FactoryProvider.getFactory(Factories.COFFEE_FACTORY);
        assertEquals(CofeeFactory.class, cofeeFactory.getClass());
    }
}