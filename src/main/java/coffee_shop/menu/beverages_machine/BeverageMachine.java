package coffee_shop.menu.beverages_machine;

import coffee_shop.Beverage;
import coffee_shop.menu.beverages.Coffee;
import coffee_shop.menu.beverages.HotChocolate;
import coffee_shop.menu.beverages.Tea;
import coffee_shop.menu.supplements.Supplement;
import coffee_shop.menu.supplements.CinnamonSupplement;
import coffee_shop.menu.supplements.CreamSupplement;
import coffee_shop.menu.supplements.MilkSupplement;

import java.util.ArrayList;
import java.util.List;

public class BeverageMachine implements TeaBuilder, HotChocolateBuilder, CoffeeBuilder {
    private List<Supplement> supplements;
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
        supplements = new ArrayList<>();
    }

    public Beverage make() {
        Beverage beverage = this.beverage;
        for (Supplement supplement: supplements) {
            beverage = supplement.add(beverage);
        }
        return beverage;
    }

    public BeverageMachine withMilk() {
        supplements.add(new MilkSupplement());
        return this;
    }

    public BeverageMachine withCinnamon() {
        supplements.add(new CinnamonSupplement());
        return this;
    }

    public BeverageMachine withCream() {
        supplements.add(new CreamSupplement());
        return this;
    }
}
