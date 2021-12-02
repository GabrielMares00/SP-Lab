package com.sabloane;

import com.sabloane.models.Paragraph;
import com.sabloane.models.Section;
import com.sabloane.services.OpenCommand;
import com.sabloane.services.SaveCommand;
import com.sabloane.services.StatisticsCommand;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenCommand openCommand = new OpenCommand("Titlu amuzant");

        Section sectionToSave = new Section("Capitol 14");
        sectionToSave.add(new Paragraph("Acesta este un capitol adaugat printr-un Command"));
        SaveCommand saveCommand = new SaveCommand(sectionToSave);

        StatisticsCommand statisticsCommand = new StatisticsCommand();

        openCommand.execute();
        saveCommand.execute();
        statisticsCommand.execute();
    }
}