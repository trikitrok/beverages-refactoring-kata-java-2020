package beverages;

import beverages.menu.beverages.Coffee;
import beverages.menu.beverages.HotChocolate;
import beverages.menu.beverages.Tea;
import beverages.menu.supplements.WithCinnamon;
import beverages.menu.supplements.WithCream;
import beverages.menu.supplements.WithMilk;

public class BeverageMachine {
    public static BeverageMachine coffee() {
        return new BeverageMachine(new Coffee());
    }

    public static BeverageMachine tea() {
        return new BeverageMachine(new Tea());
    }

    public static BeverageMachine hotChocolate() {
        return new BeverageMachine(new HotChocolate());
    }

    private Beverage beverage;

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
