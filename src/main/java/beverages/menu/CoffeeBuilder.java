package beverages.menu;

import beverages.Beverage;

public interface CoffeeBuilder {
    Beverage make();
    CoffeeBuilder withMilk();
    CoffeeBuilder withCream();
    CoffeeBuilder withCinnamon();
}
