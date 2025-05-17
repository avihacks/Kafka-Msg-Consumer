package com.EndUserApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

	
	@KafkaListener(topics = AppContant.LOCATION_UPDATE_TPOIC_STRING,groupId = AppContant.GROUP_ID)
	public void updateLocation(String location) {
	
	System.out.print(location);
	}
}
