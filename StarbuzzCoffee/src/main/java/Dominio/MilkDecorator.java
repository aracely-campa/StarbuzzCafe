package Dominio;

/**
 *
 * @author aracelyc
 */
public class MilkDecorator extends BeverageDecorator {

    /**
     * Constructor for MilkDecorator.
     *
     * @param wrapper The base beverage to be decorated with milk.
     * @param amount The number of cups of milk to be added.
     */
    public MilkDecorator(Beverage wrapper, int amount) {
        // Calls the constructor of the parent class (BeverageDecorator) to set up the decorator.
        super(wrapper, amount, 1.0f);
        // Adds milk to the decorated beverage.
        addMilk();
    }

    /**
     * Sets the description of the milk cups based on the amount.
     */
    private void setDescription() {
        this.description = amount + " cups of milk";
    }

    /**
     * Sets the cost of the milk cups based on the amount and cost per amount.
     */
    private void setCost() {
        this.cost = costPerAmount * amount;
    }

    /**
     * Adds milk to the decorated beverage by setting the description and cost.
     */
    public void addMilk() {
        setDescription();
        setCost();
    }
}
