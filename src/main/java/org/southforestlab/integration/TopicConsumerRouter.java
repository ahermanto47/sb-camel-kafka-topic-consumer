package org.southforestlab.integration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class TopicConsumerRouter extends RouteBuilder {
  
	
    @Override
    public void configure() throws Exception {


    	from("kafka:{{producer.topic}}?brokers={{kafka.host}}:{{kafka.port}}").routeId("subscriber")
      	    .log("received from topic - ${body}");

    }

}

