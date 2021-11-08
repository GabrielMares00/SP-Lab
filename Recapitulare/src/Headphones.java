public class Headphones extends Product {
    private boolean areWireless;

    public Headphones(String name, int price, boolean areWireless) {
        super(name, price);
        this.areWireless = areWireless;
    }

    @Override
    public void print() {
        System.out.println("Casti \t Au wireless: " + this.areWireless);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculatePriceHeadphones(this);
    }
}
