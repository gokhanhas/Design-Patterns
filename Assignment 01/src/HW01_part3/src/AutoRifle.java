// Gokhan Has - 161044067

public class AutoRifle extends AccessoriesDecorator{
    Suit suit_;

    public AutoRifle(Suit suit) {
        this.suit_ = suit;
    }

    @Override
    public double cost() {
        return 30.0 + suit_.cost();
    }

    @Override
    public double weight() {
        return 1.5 + suit_.weight();
    }

    @Override
    public String getDescription() {
        return suit_.getDescription() + ", AutoRifle";
    }
}
