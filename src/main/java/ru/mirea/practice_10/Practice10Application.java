package ru.mirea.practice_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Practice10Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Practice10Application.class, args);

        try {
            MagicianInterface musician = context.getBean(args[1], MagicianInterface.class);
            System.out.println(musician.doMagic());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.err.println("Expected 1 command line argument, found 0!");
        }
    }
}
