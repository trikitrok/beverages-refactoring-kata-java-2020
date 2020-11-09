package coffee_shop.menu.builders;

import coffee_shop.Beverage;
import coffee_shop.menu.supplements.Supplement;
import coffee_shop.menu.supplements.CinnamonSupplement;
import coffee_shop.menu.supplements.CreamSupplement;
import coffee_shop.menu.supplements.MilkSupplement;

import java.util.ArrayList;
import java.util.List;

public class BeverageBuilder implements TeaBuilder, HotChocolateBuilder, CoffeeBuilder {
    private List<Supplement> supplements;
    private Beverage beverage;

    public BeverageBuilder(Beverage beverage) {
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

    public BeverageBuilder withMilk() {
        supplements.add(new MilkSupplement());
        return this;
    }

    public BeverageBuilder withCinnamon() {
        supplements.add(new CinnamonSupplement());
        return this;
    }

    public BeverageBuilder withCream() {
        supplements.add(new CreamSupplement());
        return this;
    }
}
