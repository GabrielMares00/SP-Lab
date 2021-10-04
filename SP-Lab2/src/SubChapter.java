import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<Element>();
    }

    public void addElement (Element element) {
        this.elements.add(element);
    }

    public void print() {
        System.out.println("Subcapitol " + this.name);

        for (Element i : this.elements)
            i.print();
    }
}
