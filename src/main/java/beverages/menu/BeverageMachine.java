package beverages.menu;

import beverages.Coffee;
import beverages.HotChocolate;
import beverages.Tea;

public class BeverageMachine {
    public static CoffeeBuilder coffee() {
        return new BeverageBuilder(new Coffee());
    }

    public static TeaBuilder tea() {
        return new BeverageBuilder(new Tea());
    }

    public static HotChocolateBuilder hotChocolate() {
        return new BeverageBuilder(new HotChocolate());
    }
}
