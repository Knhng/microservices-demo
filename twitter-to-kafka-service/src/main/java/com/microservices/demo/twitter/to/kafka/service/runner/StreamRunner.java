package com.microservices.demo.twitter.to.kafka.service.runner;

import org.springframework.stereotype.Service;
import twitter4j.TwitterException;

@Service
public interface StreamRunner {
    void start() throws TwitterException;
}
