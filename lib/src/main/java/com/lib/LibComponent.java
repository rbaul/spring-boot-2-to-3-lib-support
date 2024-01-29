package com.lib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class LibComponent {

    @PostConstruct
    @jakarta.annotation.PostConstruct
    public void init() {
        log.info("PostConstruct");
    }
}
