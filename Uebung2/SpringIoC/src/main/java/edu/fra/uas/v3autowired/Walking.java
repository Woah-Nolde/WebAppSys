package edu.fra.uas.v3autowired;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
@Qualifier("pleaseWalk")
public class Walking implements Work {


    @Override
    public void doWork() {
        System.out.println(" --> walking to the destination");
    }

}
