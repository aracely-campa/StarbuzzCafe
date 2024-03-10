package Dominio;

/**
 *
 * @author aracelyc
 */
public class Demo {

    /**
     * The main method serves as the entry point for the demonstration.
     *
     * @param args Command-line arguments (not used in this demonstration).
     */
    public static void main(String[] args) {
        test();
    }

    /**
     * The test method demonstrates the interaction of various beverage and
     * decorator classes.
     */
    public static void test() {

        Beverage expresso = new Expresso();
        MilkDecorator milkDecorator = new MilkDecorator(expresso, 1);
        Decorator soyDecorator = new Decorator(milkDecorator, 1);
        ChocolateDecorator chocolateDecorator = new ChocolateDecorator(soyDecorator, 2);
        System.out.println(chocolateDecorator);
    }
}
