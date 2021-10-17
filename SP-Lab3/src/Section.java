import java.util.ArrayList;

public class Section implements Element {
    private String title;
    private ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<Element>();
    }

    public Section(Section section) {
        this.title = section.title;
        this.elements = section.elements;
    }

    @Override
    public void add(Element elementToBeAdded) throws Exception {
        Element element = Utils.checkAndReturnElementType(elementToBeAdded);
        for (Element i : this.elements)
            if (i.find(element))
                throw new Exception("Unsupported Operation");

        this.elements.add(element);
    }

//    @Override
//    public void add(Section section) throws Exception {
//        this.elements.append(section.elements);
//    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public boolean find(Element element) {
        for (Element i : this.elements) {
            if (i.find(element))
                return true;
        }

        return false;
    }

    public void print() {
        System.out.println("Titlu: " + this.title);

        for (Element i : this.elements)
            i.print();
    }
}
