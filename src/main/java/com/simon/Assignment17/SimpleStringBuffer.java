package com.simon.Assignment17;

public class SimpleStringBuffer {

    private String string;

    public SimpleStringBuffer() {
        string = "";
    }

    public SimpleStringBuffer(String string) {
        this.string = string;
    }

    public SimpleStringBuffer append(String string) {
        this.string += string;
        return this;
    }

    public SimpleStringBuffer appendLine(String string) {
        this.string += string;
        this.string += "\n";
        return this;
    }

    public String toString() {
        return string;
    }
}
