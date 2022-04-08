package com.ndangducbn.statepattern.impl;

import com.ndangducbn.statepattern.interfaces.State;

public class Sumitted implements State {
    @Override
    public void handlerRequest() {
        System.out.println("This Document is Submiited");
    }
}
