package beverages.menu;

import beverages.Beverage;
import beverages.Supplement;
import beverages.menu.supplements.CinnamonSupplement;
import beverages.menu.supplements.CreamSupplement;
import beverages.menu.supplements.MilkSupplement;

import java.util.ArrayList;
import java.util.List;

class BeverageBuilder implements TeaBuilder, HotChocolateBuilder, CoffeeBuilder {
    private List<Supplement> supplements;
    private Beverage beverage;

    BeverageBuilder(Beverage beverage) {
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
