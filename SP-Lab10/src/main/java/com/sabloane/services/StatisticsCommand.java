package com.sabloane.services;

public class StatisticsCommand implements Command {
    @Override
    public void execute() throws Exception {
        RenderContentVisitor stats = new RenderContentVisitor();
        DocumentManager.getInstance().getBook().accept(stats);

        CountContentVisitor counter = new CountContentVisitor();
        DocumentManager.getInstance().getBook().accept(counter);
        counter.showCountStatistics();
    }
}
