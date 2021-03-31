// Gokhan Has - 161044067

/**
 * This is the suit abstract class.
 */
public abstract class Suit {

    String description = "Unknown";

    /**
     *
     * @return suit's cost value.
     */
    public abstract double cost();

    /**
     *
     * @return suit's double weight.
     */
    public abstract double weight();

    /**
     *
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter function to description.
     * @param description string suit name.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
