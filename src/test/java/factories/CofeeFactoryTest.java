package factories;

import coffies.Cofee;
import coffies.Coffees;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CofeeFactoryTest {
    public CofeeFactory cofeeFactory;

    @Before
    public void published() {
        cofeeFactory = new CofeeFactory();
    }

    @Test
    public void createArabic() {
        Cofee arabicCoffee = cofeeFactory.create(Coffees.ARABIC);
        assertEquals("Arabic Coffee type", arabicCoffee.getType());
    }

    @Test
    public void createRabusta() {
        Cofee rabustaCofee = cofeeFactory.create(Coffees.RABUSTA);
        assertEquals("It's Rabusta kind", rabustaCofee.getType());
    }
}