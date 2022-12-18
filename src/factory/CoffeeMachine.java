package factory;

public class CoffeeMachine {

    public CoffeeMachine() {
    }

    public void makeCoffee(CoffeeType type, double milkPercent){
        Coffee coffee = CoffeeFactory.getCoffee(type, milkPercent);
        System.out.println("Готовим кофе!");
        coffee.make();
    }
}
