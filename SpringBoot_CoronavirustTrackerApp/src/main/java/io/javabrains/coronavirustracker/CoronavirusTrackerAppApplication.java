package io.javabrains.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CoronavirusTrackerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronavirusTrackerAppApplication.class, args);
    }

}
