package io.dowlath.javahidden.datastructures.linkedlist;

public class FindNthElement {
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
        tmp.next = node;
    }

    private int findNode(int key){
       int count = 0;
       ListNode mainPtr = head;
       ListNode refPtr = head;
       while(count < key){
           refPtr = refPtr.next;
           count++;
       }
       while(refPtr !=null){
           mainPtr = mainPtr.next;
           refPtr = refPtr.next;
       }
       return mainPtr.data;
    }

    public static void main(String[] args) {
        FindNthElement findElement = new FindNthElement();
        findElement.insertFirst(10);
        findElement.insertFirst(20);
        findElement.insertFirst(30);
        findElement.insertFirst(40);
        findElement.insertFirst(50);
        int value = findElement.findNode(4);
        System.out.println("Find Nth Node ... : "+value);
    }
}
