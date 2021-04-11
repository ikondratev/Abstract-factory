package factories;

public class FactoryProvider {
    public static AbstractFactory getFactory(Factories kind) {
        AbstractFactory result = null;

        switch (kind) {
            case COFFEE_FACTORY: result = new CofeeFactory(); break;
            case ANIMAL_FACTORY: result = new AnimalFactory(); break;
        }

        return result;
    }
}
