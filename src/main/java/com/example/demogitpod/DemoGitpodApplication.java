package com.example.demogitpod;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class DemoGitpodApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGitpodApplication.class, args);
    }

}
