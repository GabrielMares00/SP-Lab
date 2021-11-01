package services;

import models.*;

public class Utils {
    public static Element checkAndReturnCopy(Element element) {
        if (element instanceof Section)
            return new Section((Section)element);
        else if (element instanceof Paragraph)
            return new Paragraph((Paragraph)element);
        else if (element instanceof Table)
            return new Table((Table)element);
        else if (element instanceof Image)
            return new Image((Image) element);
        else if (element instanceof ImageProxy)
            return new ImageProxy((ImageProxy) element);

        return null;
    }
}
