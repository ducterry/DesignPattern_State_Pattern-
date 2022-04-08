package com.ndangducbn.statepattern.clients;

import com.ndangducbn.statepattern.interfaces.State;

public class DocumentContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void applyState() {
        this.state.handlerRequest();
    }
}
