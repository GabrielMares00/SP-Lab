package com.sabloane.services;

import com.sabloane.models.Context;
import com.sabloane.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
