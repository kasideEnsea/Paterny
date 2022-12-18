package factory;

public class Americano extends Coffee{
    private double hardness = 0.9;

    public Americano(double milkPercent) {
        super(milkPercent);
    }

    @Override
    public void make() {
        System.out.printf("Смешиваем Американо крепостью в %.1f, процент молока: %.1f%n", hardness, milkPercent);
    }
}
