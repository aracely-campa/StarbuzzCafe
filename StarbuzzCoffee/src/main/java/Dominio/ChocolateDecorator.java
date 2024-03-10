package Dominio;

/**
 *
 * @author aracelyc
 */
public class ChocolateDecorator extends BeverageDecorator {

    /**
     * Constructor for ChocolateDecorator.
     *
     * @param wrapper The base beverage to be decorated with chocolate.
     * @param amount The number of portions of chocolate to be added.
     */
    public ChocolateDecorator(Beverage wrapper, int amount) {
        // Calls the constructor of the parent class (BeverageDecorator) to set up the decorator.
        super(wrapper, amount, 2.0f);
        // Adds chocolate to the decorated beverage.
        addChocolate();
    }

    /**
     * Sets the description of the chocolate portion based on the amount.
     */
    private void setDescription() {
        this.description = amount + " portions of chocolate";
    }

    /**
     * Sets the cost of the chocolate portion based on the amount and cost per
     * amount.
     */
    private void setCost() {
        this.cost = costPerAmount * amount;
    }

    /**
     * Adds chocolate to the decorated beverage by setting the description and
     * cost.
     */
    public void addChocolate() {
        setDescription();
        setCost();
    }
}
