package edu.fra.uas.service;



import org.springframework.stereotype.Service;

@Service
public class CounterService {
    public int count = 0;


public CounterService() {
    count++;
    }

    public int count() {
        // Zähllogik hier implementieren
        return count++;  }

}
