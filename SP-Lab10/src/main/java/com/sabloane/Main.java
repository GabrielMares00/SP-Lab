package com.sabloane;

import com.sabloane.models.Paragraph;
import com.sabloane.models.Section;
import com.sabloane.services.OpenCommand;
import com.sabloane.services.SaveCommand;
import com.sabloane.services.StatisticsCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}