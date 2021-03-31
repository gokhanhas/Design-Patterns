// Gokhan Has - 161044067

public class RocketLauncher extends AccessoriesDecorator{
    Suit suit_;

    public RocketLauncher(Suit suit) {
        this.suit_ = suit;
    }

    @Override
    public double cost() {
        return 150.0 + suit_.cost();
    }

    @Override
    public double weight() {
        return 7.5 + suit_.weight();
    }

    @Override
    public String getDescription() {
        return suit_.getDescription() + ", RocketLauncher";
    }
}
