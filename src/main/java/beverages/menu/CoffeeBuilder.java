package beverages.menu;

import beverages.Beverage;
import beverages.Coffee;

public class CoffeeBuilder {

    private BeverageBuilder beverageBuilder;

    CoffeeBuilder() {
        beverageBuilder = new BeverageBuilder(new Coffee());
    }

    public Beverage make() {
        return beverageBuilder.make();
    }

    public CoffeeBuilder withMilk() {
        beverageBuilder = beverageBuilder.withMilk();
        return this;
    }

    public CoffeeBuilder withCream() {
        beverageBuilder = beverageBuilder.withCream();
        return this;
    }

    public CoffeeBuilder withCinnamon() {
        beverageBuilder = beverageBuilder.withCinnamon();
        return this;
    }
}
