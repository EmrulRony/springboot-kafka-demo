package com.example.demo.listener;

import com.example.demo.model.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "employee", groupId = "groupId", containerFactory = "userKafkaListenerFactory")
    public void listen(Employee data) {
        System.out.println("Listening....");
        System.out.println(data.getFirstName());
    }
}
