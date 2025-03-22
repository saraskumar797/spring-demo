package com.spring.spring_boot_docker;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "my-consumer-group")
    public void consumeMessage(ConsumerRecord<String, String> record) {
        System.out.println("Received Message: " + record.value());
        System.out.println("From Partition: " + record.partition());
        System.out.println("With Offset: " + record.offset());
    }
}
