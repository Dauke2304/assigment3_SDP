package assigment4;

public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();

    public abstract double getCost();
}
