package factory;

public class Latte extends Coffee {
    private double milkFoamLevel = 0.5;

    public Latte(double milkPercent) {
        super(milkPercent);
    }

    @Override
    public void make() {
        System.out.printf("Смешиваем Латте с уровнем пенки %.1f, процент молока: %.1f%n", milkFoamLevel, milkPercent);
    }
}
