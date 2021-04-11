package factories;

import animals.Animal;
import animals.Animals;
import animals.Fox;
import animals.Wolf;

public class AnimalFactory implements AbstractFactory<Animal> {
    public Animal create(Enum kind) {
        Animal result = null;
        switch ((Animals) kind) {
        case FOX: result  = new Fox(); break;
        case WOLF: result = new Wolf(); break;
        }

        return result;
    }
}
