package Dominio;

/**
 *
 * @author aracelyc
 */
public class Decorator extends BeverageDecorator {

    /**
     * Constructor for SoyDecorator.
     *
     * @param wrapper The base beverage to be decorated with soy.
     * @param amount The number of cups of soy to be added.
     */
    public Decorator(Beverage wrapper, int amount) {
        // Calls the constructor of the parent class (BeverageDecorator) to set up the decorator.
        super(wrapper, amount, 1.5f);
        // Adds soy to the decorated beverage.
        addDecorated();
        
    }

    /**
     * Sets the description of the soy cups based on the amount.
     */
    private void setDescription() {
        this.description = amount + " cups of soy";
    }

    /**
     * Sets the cost of the soy cups based on the amount and cost per amount.
     */
    private void setCost() {
        this.cost = costPerAmount * amount;
    }

    /**
     * Adds soy to the decorated beverage by setting the description and cost.
     */
    public void addDecorated() {
        setDescription();
        setCost();
    }
}
