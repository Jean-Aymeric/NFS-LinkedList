package com.jad;

public class Main {

    public static void main(String[] args) {
        // [a, b, c, d]
        Link list = new Link((char) 0);
        for (int i = 0; i < 10; i++) {
            Link temp = list;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Link((char) i));
        }
    }
}
