package factories;

import coffies.ArabicCofee;
import coffies.Cofee;
import coffies.Coffees;
import coffies.RabustaCofee;

public class CofeeFactory implements AbstractFactory<Cofee>{
    public Cofee create(Enum kind) {
        Cofee result = null;
        switch ((Coffees) kind) {
            case ARABIC:  result = new ArabicCofee();
            case RABUSTA: result = new RabustaCofee();
        }
        return result;
    }
}
