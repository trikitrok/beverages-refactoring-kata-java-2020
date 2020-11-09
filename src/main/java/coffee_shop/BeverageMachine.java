package coffee_shop;

import coffee_shop.menu.beverages.Coffee;
import coffee_shop.menu.beverages.HotChocolate;
import coffee_shop.menu.beverages.Tea;
import coffee_shop.menu.builders.BeverageBuilder;
import coffee_shop.menu.builders.CoffeeBuilder;
import coffee_shop.menu.builders.HotChocolateBuilder;
import coffee_shop.menu.builders.TeaBuilder;

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
