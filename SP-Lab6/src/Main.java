import models.*;
import services.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.addWithoutCopy(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        Book carte = new Book("Cartea");
        carte.addAuthor(new Author("Iulius Ceasar"));
        carte.addContent(new TableOfContents());
        carte.addContent(cap1);

        RenderContentVisitor stats = new RenderContentVisitor();
        carte.accept(stats);

        CountContentVisitor counter = new CountContentVisitor();
        carte.accept(counter);
        counter.showCountStatistics();

        BookSaverVisitor jsonParser = new BookSaverVisitor();
        carte.accept(jsonParser);
        jsonParser.endJsonString();
        jsonParser.printJsonString();
    }
}