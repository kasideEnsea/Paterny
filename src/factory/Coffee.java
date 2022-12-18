package factory;

public abstract class Coffee {
    protected double milkPercent;

    public Coffee(double milkPercent){
        this.milkPercent = milkPercent;
    }

    public abstract void make();
}
