// Gokhan Has - 161044067

public class Laser extends AccessoriesDecorator{
    Suit suit_;

    public Laser(Suit suit) {
        this.suit_ = suit;
    }

    @Override
    public double cost() {
        return 200.0 + suit_.cost();
    }

    @Override
    public double weight() {
        return 5.5 + suit_.weight();
    }

    @Override
    public String getDescription() {
        return suit_.getDescription() + ", Laser";
    }
}
