package com.example.kafkastudyproj;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "kafkastudy", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener recieved data" + data);
    }
}
