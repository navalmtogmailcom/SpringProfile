package com.example.springprofile;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

@Component
public class ProfileDemo {
    @Value("${message}")
    String message;
@PostConstruct
    public void printMessage(){
        System.out.println("Message is = " + message);
    }

}
