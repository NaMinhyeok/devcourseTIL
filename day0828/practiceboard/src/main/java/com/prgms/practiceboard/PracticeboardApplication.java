package com.prgms.practiceboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PracticeboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeboardApplication.class, args);
    }

}
