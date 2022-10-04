package com.jaugusto.srtproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Mensagem enviada {}", message);
        kafkaTemplate.send("str-topic", message);//{



                //.addCallback(
        //}
//                success -> {
//                    if (success != null){
//                        log.info("Send message with sucess {}", message);
//                        log.info("Partition {}", success.getRecordMetadata().partition());
//                        log.info("Offset {}", success.getRecordMetadata().offset());
//                    }
//                },
//                error -> log.error("Error send message"));
    }
}
