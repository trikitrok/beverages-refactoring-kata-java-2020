package beverages.menu;

import beverages.Beverage;
import beverages.HotChocolate;

public class HotChocolateBuilder {
    private BeverageBuilder beverageBuilder;

    HotChocolateBuilder() {
        beverageBuilder = new BeverageBuilder(new HotChocolate());
    }

    public Beverage make() {
        return beverageBuilder.make();
    }

    public HotChocolateBuilder withCream() {
        beverageBuilder = beverageBuilder.withCream();
        return this;
    }

    public HotChocolateBuilder withCinnamon() {
        beverageBuilder = beverageBuilder.withCinnamon();
        return this;
    }
}
