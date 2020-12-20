package coffee_shop.menu.beverages_machine;

import coffee_shop.Beverage;
import coffee_shop.menu.beverages.Coffee;
import coffee_shop.menu.beverages.HotChocolate;
import coffee_shop.menu.beverages.Tea;
import coffee_shop.menu.supplements.WithCinnamon;
import coffee_shop.menu.supplements.WithCream;
import coffee_shop.menu.supplements.WithMilk;

public class BeverageMachine implements TeaBuilder, HotChocolateBuilder, CoffeeBuilder {
    private Beverage beverage;

    public static CoffeeBuilder coffee() {
        return new BeverageMachine(new Coffee());
    }

    public static TeaBuilder tea() {
        return new BeverageMachine(new Tea());
    }

    public static HotChocolateBuilder hotChocolate() {
        return new BeverageMachine(new HotChocolate());
    }

    private BeverageMachine(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage make() {
        return beverage;
    }

    public BeverageMachine withMilk() {
        beverage = new WithMilk(beverage);
        return this;
    }

    public BeverageMachine withCinnamon() {
        beverage = new WithCinnamon(beverage);
        return this;
    }

    public BeverageMachine withCream() {
        beverage = new WithCream(beverage);
        return this;
    }
}
