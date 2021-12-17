package org.southforestlab.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class TopicConsumerRouter extends RouteBuilder {
  
	
    @Override
    public void configure() throws Exception {


    	from("kafka:{{consumer.topic}}?brokers={{kafka.host}}:{{kafka.port}}&groupId={{consumer.groupId}}")
    	   .routeId("subscriber")
      	   .log("received from topic - ${body}");

    }

}

