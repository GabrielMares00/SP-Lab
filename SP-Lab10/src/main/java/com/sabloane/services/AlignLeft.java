package com.sabloane.services;

import com.sabloane.models.Context;
import com.sabloane.models.Paragraph;

public class AlignLeft extends AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Left: " + paragraph);
    }
}
