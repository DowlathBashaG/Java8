package io.dowlath.javahidden.datastructures.linkedlist;

public class InsertLast {
    ListNode head;
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insertLast(int value){
     ListNode node = new ListNode(value);
     if(head == null){
         head = node;
         return;
     }
     ListNode temp = head;
     while(null != temp.next){
       temp =  temp.next;
     }
     temp.next = node;
    }

    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertLast linkedList = new InsertLast();
        linkedList.insertLast(10);
        linkedList.insertLast(20);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertLast(50);
        linkedList.print();


    }
}
