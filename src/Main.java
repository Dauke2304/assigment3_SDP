import assigment4.*;
public class Main {
    public static void main(String[] args) {
        Pizza margheritaPizza = new MargheritaPizza();
        margheritaPizza = new CheeseTopping(margheritaPizza);
        margheritaPizza = new MushroomTopping(margheritaPizza);

        System.out.println(margheritaPizza.getDescription() + " Cost: $" + margheritaPizza.getCost());

        // Order a Vegetarian pizza with double cheese and pepperoni
        Pizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza = new CheeseTopping(vegetarianPizza);
        vegetarianPizza = new CheeseTopping(vegetarianPizza); // Double cheese
        vegetarianPizza = new PepperoniTopping(vegetarianPizza);

        System.out.println(vegetarianPizza.getDescription() + " Cost: $" + vegetarianPizza.getCost());
}
}