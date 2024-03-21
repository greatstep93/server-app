package ru.greatstep.serverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerAppApplication.class, args);
    }

    @GetMapping("/")
    public String test() throws InterruptedException {
        System.out.println(Thread.currentThread());
        Thread.sleep(3000);
        return "ok";
    }

}
