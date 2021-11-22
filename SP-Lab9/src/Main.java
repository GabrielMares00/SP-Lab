import models.*;
import services.*;

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