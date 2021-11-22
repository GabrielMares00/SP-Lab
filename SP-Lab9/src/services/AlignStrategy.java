package services;

import models.Context;
import models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
