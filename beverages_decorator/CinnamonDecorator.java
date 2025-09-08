package beverages_decorator;

public class CinnamonDecorator extends Decorator {

    public CinnamonDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
}