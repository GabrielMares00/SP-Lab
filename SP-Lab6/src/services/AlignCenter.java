package services;

import models.Context;
import models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Center: " + paragraph);
    }
}
