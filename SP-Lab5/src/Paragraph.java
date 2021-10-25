public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public void print() {
        if (this.alignStrategy != null) {
            this.alignStrategy.render(this, null);
        }
        else
            System.out.println("Paragraph" + this.text);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    public void setAlign(AlignStrategy align) {
        this.alignStrategy = align;
    }
}
