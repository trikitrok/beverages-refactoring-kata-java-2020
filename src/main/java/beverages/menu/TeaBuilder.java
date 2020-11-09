package beverages.menu;

import beverages.Beverage;
import beverages.Tea;

public class TeaBuilder {

    private BeverageBuilder beverageBuilder;

    TeaBuilder() {
        beverageBuilder = new BeverageBuilder(new Tea());
    }

    public Beverage make() {
        return beverageBuilder.make();
    }

    public TeaBuilder withMilk() {
        beverageBuilder = beverageBuilder.withMilk();
        return this;
    }

    public TeaBuilder withCinnamon() {
        beverageBuilder = beverageBuilder.withCinnamon();
        return this;
    }
}
