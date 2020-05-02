package io.dowlath.javahidden.datastructures.linkedlist;

public class InsertFirst {
    ListNode head;
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    public void print(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertFirst linkedList = new InsertFirst();
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.insertFirst(40);
        linkedList.insertFirst(50);
        linkedList.print();
    }
}
