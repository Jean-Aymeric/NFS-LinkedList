package com.jad;

public class Link {
    private char data;
    private Link next;

    public Link(char data, Link next) {
        this.data = data;
        this.next = next;
    }

    public Link(char data) {
        this(data, null);
    }

    public char getData() {
        return this.data;
    }

    public Link getNext() {
        return this.next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
