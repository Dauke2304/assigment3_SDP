import assigment3.*;
public class Main {
    public static void main(String[] args) {
        // Create individual menu items
        MenuComponent pancakeItem = new MenuItem("Pancake", "Delicious fluffy pancake", 5.99);
        MenuComponent burgerItem = new MenuItem("Burger", "Classic beef burger with fries", 8.99);
        MenuComponent pizzaItem = new MenuItem("Pizza", "Cheesy pepperoni pizza", 10.99);
        MenuComponent sodaItem = new MenuItem("Soda", "Refreshing soda", 1.99);

        // Create a Breakfast Menu
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning dishes");
        breakfastMenu.add(pancakeItem);

        // Create a Lunch Menu
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon dishes");
        lunchMenu.add(burgerItem);
        lunchMenu.add(pizzaItem);

        // Create a Drinks Menu
        MenuComponent drinksMenu = new Menu("Drinks Menu", "Beverages");
        drinksMenu.add(sodaItem);

        // Create the main menu and add submenus
        MenuComponent mainMenu = new Menu("Main Menu", "All available items");
        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);
        mainMenu.add(drinksMenu);

        // Print the entire menu
        mainMenu.print();
}
}