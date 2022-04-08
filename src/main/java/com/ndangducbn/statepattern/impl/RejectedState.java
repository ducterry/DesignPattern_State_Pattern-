package com.ndangducbn.statepattern.impl;

import com.ndangducbn.statepattern.interfaces.State;

public class RejectedState implements State {
    @Override
    public void handlerRequest() {
        System.out.println("This Document is Rejected");
    }
}
