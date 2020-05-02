package io.dowlath.javahidden.datastructures.linkedlist;

public class MidElementFromList {
    ListNode head;
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void insertFirst(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = node;
            return;
        }
        ListNode tmp = head;
        while(null != tmp.next){
            tmp = tmp.next;
        }
        tmp.next =node;
    }

    private int findMid(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }
    public static void main(String[] args) {
       MidElementFromList midElement = new MidElementFromList();
       midElement.insertFirst(10);
       midElement.insertFirst(20);
       midElement.insertFirst(30);
       midElement.insertFirst(40);
       midElement.insertFirst(50);
       int value = midElement.findMid();
       System.out.println("Mid element from list ... :"+ value);


    }
}
