package io.dowlath.javahidden.datastructures.linkedlist;

public class ReverseList {
    ListNode head;
    static class ListNode{
        int data ;
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
        tmp.next = node;
    }

    private void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" ->");
            current = current.next;
        }
        System.out.println("null");
    }
    private ListNode reverse(){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        System.out.println("Given List.... : ");
        list.print();
        System.out.println("Reverse List... :");
        ListNode reverseNode = list.reverse();
        list.head = reverseNode;
        list.print();


    }
}
