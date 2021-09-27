import java.util.ArrayList;

public class Book {
    private ArrayList<String> paragraphs;
    private ArrayList<String> images;
    private ArrayList<String> tables;
    private String title;

    public Book(String title) {
        this.title = title;
        this.paragraphs = new ArrayList<String>();
        this.images = new ArrayList<String>();
        this.tables = new ArrayList<String>();
    }

    public void createNewParagraph(String newParagraph) {
        this.paragraphs.add(newParagraph);
    }

    public void createNewImage(String newImage) {
        this.images.add(newImage);
    }

    public void createNewTable(String newTable) {
        this.tables.add(newTable);
    }

    public void print() {
        System.out.println(paragraphs);
        System.out.println(images);
        System.out.println(tables);
    }
}