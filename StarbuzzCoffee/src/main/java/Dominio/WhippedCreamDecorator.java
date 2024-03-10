package Dominio;

/**
 *
 * @author aracelyc
 */
public class WhippedCreamDecorator extends BeverageDecorator {

    /**
     * Constructor for WhippedCreamDecorator.
     *
     * @param wrapper The base beverage to be decorated with whipped cream.
     * @param amount The number of portions of whipped cream to be added.
     */
    public WhippedCreamDecorator(Beverage wrapper, int amount) {
        super(wrapper, amount, 0.5f);
        addWhippedCream();
    }

    /**
     * Sets the description of the whipped cream portions based on the amount.
     */
    private void setDescription() {
        this.description = amount + " portions of whipped cream";
    }

    /**
     * Sets the cost of the whipped cream portions based on the amount and cost
     * per amount.
     */
    private void setCost() {
        this.cost = costPerAmount * amount;
    }

    /**
     * Adds whipped cream to the decorated beverage by setting the description
     * and cost.
     */
    public void addWhippedCream() {
        setDescription();
        setCost();
    }
}
