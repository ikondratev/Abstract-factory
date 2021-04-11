package application;

import animals.Animal;
import animals.Animals;
import coffies.Cofee;
import coffies.Coffees;
import factories.AbstractFactory;
import factories.Factories;
import factories.FactoryProvider;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello it's abstract factory");

        AbstractFactory<Object> animalFactory = FactoryProvider.getFactory(Factories.ANIMAL_FACTORY);
        AbstractFactory<Object> coffeeFactory = FactoryProvider.getFactory(Factories.COFFEE_FACTORY);
        Animal wolf  = (Animal) animalFactory.create(Animals.WOLF);
        Cofee coffee = (Cofee) coffeeFactory.create(Coffees.RABUSTA);
        wolf.getVote();
        System.out.println("Coffee kind: " + coffee.getType());
    }
}
