public class TableOfContents implements Element {
    public void print() {
        System.out.println("Cuprins");
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public boolean find(Element element) {
        //not needed
        return false;
    }
}
