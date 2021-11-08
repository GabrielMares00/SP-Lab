import javax.sound.midi.SysexMessage;

public class Phone extends Product {
    private OperatingSystem os;

    public Phone(String name, int price) {
        super(name, price);
    }

    public Phone(String name, int price, OperatingSystem os) {
        super(name, price);
        this.os = os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    @Override
    public void print() {
        String message = "Telefon " + this.name + "... ";
        if (os != null)
            this.os.print(message);
        else
            System.out.println("Telefon vechi ... " + this.name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculatePricePhones(this);
    }
}
