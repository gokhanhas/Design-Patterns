// Gokhan Has - 161044067

public class Flamethrower extends AccessoriesDecorator {

    Suit suit_;

    public Flamethrower(Suit suit) {
        this.suit_ = suit;
    }

    @Override
    public double cost() {
        return 50.0 + suit_.cost();
    }

    @Override
    public double weight() {
        return 2.0 + suit_.weight();
    }

    @Override
    public String getDescription() {
        return suit_.getDescription() + ", Flamethrower";
    }
}
