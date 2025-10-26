package edu.fra.uas.service;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



import org.slf4j.Logger;



@Component
public class MessageService {
    static int counter=0;
    private static final Logger log =LoggerFactory.getLogger(MessageService.class);
    

private String message;

public static int increment() {
    counter++;
    log.info("increment called, counter is now: " + counter);
    System.out.println("Counter: " + counter);
    return counter;
}

public String getMessage() {
    increment();
    log.info("getMessage called, returning message: " + message);

    return message;
}
public void setMessage(String message) {
    log.info("setMessage called, setting message to: " + message);  
    this.message = message;
}


}




