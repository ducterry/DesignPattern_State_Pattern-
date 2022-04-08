package com.ndangducbn.statepattern;

import com.ndangducbn.statepattern.clients.DocumentContext;
import com.ndangducbn.statepattern.impl.ApprovedState;
import com.ndangducbn.statepattern.impl.RejectedState;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePatternApplication {

    public static void main(String[] args) {
        DocumentContext thisDocument = new DocumentContext();

        thisDocument.setState(new ApprovedState());
        thisDocument.applyState();


        thisDocument.setState(new RejectedState());
        thisDocument.applyState();
    }

}
