import java.util.ArrayList;

public class Box implements Element {
    private String boxName;
    private ArrayList<Element> elements;

    public Box() {
        this.boxName = "";
        this.elements = new ArrayList<Element>();
    }

    public Box(String boxName) {
        this.boxName = boxName;
        this.elements = new ArrayList<Element>();
    }

    public Box(String boxName, ArrayList<Element> products) {
        this.boxName = boxName;
        this.elements = products;
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Box " + this.boxName);
        if (elements != null) {
            for (Element i: elements)
                i.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        if (elements != null) {
            for (Element i: elements)
                i.accept(visitor);
        }
    }
}
