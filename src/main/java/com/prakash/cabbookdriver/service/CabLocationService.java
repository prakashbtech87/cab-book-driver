package com.prakash.cabbookdriver.service;

import com.prakash.cabbookdriver.config.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author prakashkaruppusamy
 */
@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {

        kafkaTemplate.send(AppConstant.CAB_LOCATION, location);

        return true;
    }
}
