package services;

import models.Context;
import models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Left: " + paragraph);
    }
}
