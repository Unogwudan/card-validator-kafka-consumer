package com.unogwudan.kafka_consumer;

import com.unogwudan.constant.KafkaGroups;
import com.unogwudan.constant.KafkaTopics;
import com.unogwudan.model.VerifiedCardDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Daniel Unogwu on 21/06/20.
 */
@Slf4j
@Service
public class VerifiedCardConsumer {

    @KafkaListener(topics = KafkaTopics.VERIFIED_CARD_TOPIC, groupId = KafkaGroups.VERIFIED_CARD_GROUP,
            containerFactory = "kafkaListenerContainerFactory")
    public void readVerifiedCardMessage(VerifiedCardDetails cardDetails) {
        log.info("Message Consumed Successfully: " + cardDetails.toString());
    }
}