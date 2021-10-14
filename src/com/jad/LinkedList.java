package com.jad;

public class LinkedList {
    private Link first;

    public LinkedList() {
        this.first = null;
    }

    public int countLinks() {
        int numberOfLinks = 0;
        for (Link temp = this.first; temp != null; temp = temp.getNext()) {
            numberOfLinks++;
        }
        return numberOfLinks;
    }

    public void delLinkByIndex(int index) {
        if (index == 0) {
            if (this.first != null) {
                this.first = this.first.getNext();
            }
        } else {
            int currentIndex = 0;
            Link currentLink;
            Link previousLink = null;
            for (currentLink = this.first; (currentLink != null) && (currentIndex < index); currentLink = currentLink.getNext()) {
                currentIndex++;
                previousLink = currentLink;
            }
            if ((currentLink != null) && (currentIndex == index)) {
                previousLink.setNext(currentLink.getNext());
            }
        }
    }

    public void push(Link linkToPush) {
        if (linkToPush != null) {
            if (this.first == null) {
                this.first = linkToPush;
            } else {
                Link currentLink;
                for (currentLink = this.first; currentLink.getNext() != null; currentLink = currentLink.getNext()) ;
                currentLink.setNext(linkToPush);
            }
        }
    }

    public void stack(Link linkToStack) {
        if (linkToStack != null) {
            Link temp = this.first;
            this.first = linkToStack;
            linkToStack.setNext(temp);
        }
    }

    public Link getLinkByIndex(int index) {
        int currentIndex = 0;
        Link currentLink;
        for (currentLink = this.first; (currentLink != null) && (currentIndex < index); currentLink = currentLink.getNext()) {
            currentIndex++;
        }
        if (currentIndex == index) {
            return currentLink;
        }
        return null;
    }

    public void show() {
        for (Link currentLink = this.first; currentLink != null; currentLink = currentLink.getNext()) {
            System.out.print(currentLink.getData() + " ");
        }
        System.out.println();
    }
}
