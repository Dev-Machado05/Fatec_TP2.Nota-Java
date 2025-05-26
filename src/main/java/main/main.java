package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
@ComponentScan(basePackages = "Pck_Control")
public class main {
    public static void main(String[] args) {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("http://localhost:8080/"));
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        SpringApplication.run(main.class, args);
    }
}