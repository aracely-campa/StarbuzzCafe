package Dominio;

/**
 *
 * @author aracelyc
 */
public class BeverageDecorator extends Beverage {

    /**
     * The base beverage that is being decorated.
     */
    public Beverage wrapper;

    /**
     * The amount of the additional feature being added to the beverage.
     */
    public int amount;

    /**
     * The cost per unit of the additional feature.
     */
    public float costPerAmount;

    /**
     * Constructor for BeverageDecorator.
     *
     * @param wrapper The base beverage to be decorated.
     * @param amount The amount of the additional feature to be added.
     * @param costPerAmount The cost per unit of the additional feature.
     */
    public BeverageDecorator(Beverage wrapper, int amount, float costPerAmount) {
        this.wrapper = wrapper;
        this.amount = amount;
        this.costPerAmount = costPerAmount;
        wrapper.isWrapped = true;
    }

    /**
     * Overrides the getCost method to calculate the total cost, including the
     * base beverage and the added feature.
     *
     * @return The total cost of the decorated beverage.
     */
    @Override
    public float getCost() {
        return this.cost + wrapper.getCost();
    }

    /**
     * Overrides the toString method to provide a string representation of the
     * decorated beverage.
     *
     * @return A string containing the description, cost, and additional
     * features of the decorated beverage.
     */
    @Override
    public String toString() {
        String s = wrapper + description + ", Cost: " + cost + "\n";

        if (this.isWrapped) {
            return s;
        } else {
            return s + "---------------------------------------\nTotal: " + getCost() + "\n";
        }
    }
}
