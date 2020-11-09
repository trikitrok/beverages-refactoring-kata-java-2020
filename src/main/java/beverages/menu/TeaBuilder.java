package beverages.menu;

import beverages.Beverage;

public interface TeaBuilder {
    Beverage make();
    TeaBuilder withMilk();
    TeaBuilder withCinnamon();
}
