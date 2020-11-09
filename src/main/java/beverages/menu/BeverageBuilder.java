package beverages.menu;

import beverages.Beverage;
import beverages.Supplement;
import beverages.menu.supplements.CinnamonSupplement;
import beverages.menu.supplements.CreamSupplement;
import beverages.menu.supplements.MilkSupplement;

import java.util.ArrayList;
import java.util.List;

class BeverageBuilder {
    private List<Supplement> supplements;
    private Beverage beverage;

    BeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
        supplements = new ArrayList<>();
    }

    Beverage make() {
        Beverage beverage = this.beverage;
        for (Supplement supplement: supplements) {
            beverage = supplement.add(beverage);
        }
        return beverage;
    }

    BeverageBuilder withMilk() {
        supplements.add(new MilkSupplement());
        return this;
    }

    BeverageBuilder withCinnamon() {
        supplements.add(new CinnamonSupplement());
        return this;
    }

    BeverageBuilder withCream() {
        supplements.add(new CreamSupplement());
        return this;
    }
}
