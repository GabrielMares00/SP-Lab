public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public void print() {
        System.out.println(this.text);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }
}
