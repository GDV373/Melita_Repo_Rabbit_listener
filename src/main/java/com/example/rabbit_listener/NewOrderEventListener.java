package com.example.rabbit_listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class NewOrderEventListener {

    @Bean
    public Consumer<String> onNewOrderEvent(){
        return event -> {
            final ObjectMapper mapper = new ObjectMapper();
            try {
                log.info("Recieved new order event {}", mapper.readValue(event, NewOrderEvent.class));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
