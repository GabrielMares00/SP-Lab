public class CalculatePricesVisitor implements Visitor {
    private int phonePrices;
    private int headphonePrices;
    private int chargerPrices;

    @Override
    public void calculatePricePhones(Phone phone) {
        phonePrices += phone.getPrice();
    }

    @Override
    public void calculatePriceHeadphones(Headphones headphones) {
        headphonePrices += headphones.getPrice();
    }

    @Override
    public void calculatePriceCharger(Charger charger) {
        chargerPrices += charger.getPrice();
    }

    public void printPrices() {
        System.out.println("Pret total telefoane: " + this.phonePrices);
        System.out.println("Pret total casti: " + this.headphonePrices);
        System.out.println("Pret total incarcatoare: " + this.chargerPrices);
    }
}
