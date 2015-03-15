package com.stackdemo;

public class LListDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkList a = new LinkList();
        a.addNode(new LinkNode("aFirstNode"));
        a.addNode(new LinkNode("aSecondNode"));
        a.addNode(new LinkNode("aThirdNode"));
        try {
            System.out.println("node 3: " + a.getNodeByIndx(3).getNode());
        } catch (Exception e) {
            System.out.println("get node by index failed because: "
                    + e.getMessage());
        }

        a.printList();

        System.out.println("Node at index 2 is: "
                + a.getNodeByIndx(2).getNode());

        a.removeNodeAtIndex(2);

        a.printList();

        a.removeTail();

        a.printList();
    }

}
