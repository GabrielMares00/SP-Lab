package com.sabloane.services;

import com.sabloane.models.Context;
import com.sabloane.models.Paragraph;

public class AlignCenter extends AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Center: " + paragraph);
    }
}
