package com.stackdemo;

public class LinkList {
    private LinkNode head, tail;
    private Integer length;

    public LinkList() {
        head = tail = null;
        length = 0;
    }

    public LinkList(LinkNode node) {
        head = tail = node;
        length = 1;
    }

    public void addNode(LinkNode node) {
        if (length == 0) {
            head = tail = node;
            length = 1;
        } else {
            tail.setNext(node);
            tail = node;
            length++;
        }
    }

    public LinkNode getHead() {
        return this.head;
    }

    public LinkNode getNodeByIndx(Integer indx) {
        if (indx < 0 || indx >= length) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
        LinkNode op = head;
        for (int i = 0; i < indx; i++) {
            op = op.getNext();
        }
        return op;
    }

    public void removeTail() {
        LinkNode op = head;
        while (op.getNext() != tail) {
            op = op.getNext();
        }
        op.setNext(null);
        length--;
    }

    public void removeNodeAtIndex(Integer indx) {
        if (indx < 0 || indx >= length) {
            throw new IndexOutOfBoundsException("index out of bound");
        } else if (indx == 0) {
            head = head.getNext();
            length--;
            return;
        }
        LinkNode op = head;

        for (int i = 0; i < indx - 1; i++) {
            op = op.getNext();
        }
        op.setNext(op.getNext().getNext());
        length--;
    }

    public void printList() {
        LinkNode op = head;
        while (op.getNext() != null) {
            System.out.print(op.getNode() + " ");
            op = op.getNext();
        }
        System.out.println(op.getNode());
    }
}
