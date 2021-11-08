public class Charger extends Product {
    private int wattage;

    public Charger(String name, int price, int wattage) {
        super(name, price);
        this.wattage = wattage;
    }

    @Override
    public void print() {
        System.out.println("Incarcator \t are capacitate de incarcare de: " + this.wattage);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculatePriceCharger(this);
    }
}
