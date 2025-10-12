package com.simon.Assignment34;

import static java.lang.IO.*;

public class Director extends Manager {

    private boolean hasAssistant;

    public Director() {
    }

    public Director(String name, int salary, int officeSize, boolean hasAssistant) {
        super(name, salary, officeSize);
        this.hasAssistant = hasAssistant;
    }

    public boolean isHasAssistant() {
        return hasAssistant;
    }

    public void setHasAssistant(boolean hasAssistant) {
        this.hasAssistant = hasAssistant;
    }

    public void talkToAssistant() {

        println("Director is talking to their assistant");
    }
}
