package beverages.menu;

public class BeverageMachine {
    public static CoffeeBuilder coffee() {
        return new CoffeeBuilder();
    }

    public static TeaBuilder tea() {
        return new TeaBuilder();
    }

    public static HotChocolateBuilder hotChocolate() {
        return new HotChocolateBuilder();
    }
}
