package io.dowlath.javahidden.datastructures.linkedlist;

public class AddTwoLinkedList {
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
        ListNode tmp = head;
        while(null != tmp.next){
            tmp = tmp.next;
        }
        tmp.next = node;
    }
    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    private static ListNode addTwoNodes(ListNode firstList, ListNode secondList) {
       ListNode result = null;
       ListNode first = null;
       int carry = 0;

       while(firstList != null || secondList != null){
           int sum = 0;
           if(firstList != null){
               sum+=firstList.data;
               firstList = firstList.next;
           }
           if(secondList != null){
               sum+=secondList.data;
               secondList = secondList.next;
           }
           sum = sum + carry;
           int value = sum % 10;
           carry = sum / 10;

           ListNode newNode = new ListNode(value);
           if(result != null){
               result.next = newNode;
               result = result.next;
           } else{
                result = first = newNode;
           }
       }
       if(carry > 0){
           result.next = new ListNode(carry);
       }
       return first;
    }

    public static void main(String[] args) {
        AddTwoLinkedList firstNode = new AddTwoLinkedList();
        firstNode.insertLast(1);
        firstNode.insertLast(2);
        firstNode.insertLast(3);
        System.out.println("First Node .... :");
        firstNode.print();

        AddTwoLinkedList secondNode = new AddTwoLinkedList();
        secondNode.insertLast(3);
        secondNode.insertLast(2);
        secondNode.insertLast(1);
        System.out.println("Second Node .... :");
        secondNode.print();

        ListNode newNode = addTwoNodes(firstNode.head,secondNode.head);
        System.out.println("After adding....");
        while(newNode != null){
            System.out.print(newNode.data+" -> ");
            newNode = newNode.next;
        }
        System.out.println("null");
    }
}
