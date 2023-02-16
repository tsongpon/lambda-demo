package dev.songpon.lambdademo.controller;

import dev.songpon.lambdademo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/person")
    public Mono<Person> getPerson() {
        return Mono.just(new Person("Songpon", "Imyen"));
    }
}
