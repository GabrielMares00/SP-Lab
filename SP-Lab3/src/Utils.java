public class Utils {
    public static Element checkAndReturnElementType(Element element) {
        if (element instanceof Section)
            return (Section)element;
        else if (element instanceof Paragraph)
            return (Paragraph)element;
        else if (element instanceof Table)
            return (Table)element;
        else if (element instanceof Image)
            return (Image)element;

        return null;
    }
}
