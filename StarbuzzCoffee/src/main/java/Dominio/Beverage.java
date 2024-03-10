package Dominio;

/**
 *
 * @author aracelyc
 */

public abstract class Beverage {

    /**
     * The description of the beverage.
     */
    public String description;

    /**
     * The cost of the beverage.
     */
    public float cost;

    /**
     * A boolean flag indicating whether the beverage is wrapped.
     */
    public boolean isWrapped;

    /**
     * Retrieves the description of the beverage.
     *
     * @return The description of the beverage.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the cost of the beverage.
     *
     * @return The cost of the beverage.
     */
    public float getCost() {
        return cost;
    }

    /**
     * Sets the description of the beverage.
     *
     * @param description The new description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the cost of the beverage.
     *
     * @param cost The new cost to set.
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * Overrides the toString method to provide a string representation of the beverage.
     *
     * @return A string containing the description of the beverage.
     */
    @Override
    public String toString() {
        return "\nDescription: " + description;
    }

}
