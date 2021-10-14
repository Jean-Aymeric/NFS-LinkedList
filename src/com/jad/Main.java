package com.jad;

public class Main {

    public static void main(String[] args) {
        // [a, b, c, d]
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        for (int i = 65; i < 76; i++) {
            list1.stack(new Link((char)i));
            list2.push(new Link((char)i));
        }
        list1.show();
        list2.show();
        for(int i = 0; i < list1.countLinks(); i++) {
            System.out.print(list1.getLinkByIndex(i).getData() + " ");
        }
        System.out.println();
        for(int i = list2.countLinks()-1; i >= 0; i--) {
            if (i%2 == 0) {
                list2.delLinkByIndex(i);
            }
        }
        list2.show();
        System.out.println();
    }
}
