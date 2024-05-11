package com.prakash.cabbookdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.prakash.cabbookdriver.config.constant.AppConstant.VEHICLE_LOCATION;

/**
 * @author prakashkaruppusamy
 */

@Configuration
public class KafkaConfig {


    public NewTopic topic() {
        return TopicBuilder
                .name(VEHICLE_LOCATION)
                .build();
    }
}
