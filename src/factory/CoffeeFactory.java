package factory;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType type, double milkPercent){
        Coffee coffee;
        switch (type){
            case LATTE:
                coffee = new Latte(milkPercent);
                break;
            case AMERICANO:
                coffee = new Americano(milkPercent);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return coffee;
    }
}
