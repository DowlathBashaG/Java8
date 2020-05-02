package io.dowlath.javahidden.datastructures.linkedlist;

public class MergeTwoList {
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
    public void print(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"  ->  ");
            current = current.next;
        }
        System.out.println("null");
    }
    private ListNode merge(ListNode first , ListNode second){
      ListNode merge = new ListNode(0);
      ListNode temp = merge;
      while(true){
            if(first == null){
                temp.next = second;
                break;
            } else if(second == null){
                temp.next = first;
            }
            if(first.data < second.data){
                temp.next = first;
                first = first.next;
            }else{
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
      return merge.next;
    }
    public static void main(String[] args) {
        MergeTwoList firstList = new MergeTwoList();
        firstList.insertFirst(5);
        firstList.insertFirst(15);
        firstList.insertFirst(25);
        firstList.insertFirst(35);
        firstList.insertFirst(45);
        System.out.println("Given First List....: ");
        firstList.print();

        MergeTwoList secondList = new MergeTwoList();
        secondList.insertFirst(10);
        secondList.insertFirst(20);
        secondList.insertFirst(30);
        secondList.insertFirst(40);
        secondList.insertFirst(50);
        System.out.println("Given Second List...: ");
        secondList.print();

        MergeTwoList mergeList = new MergeTwoList();
        mergeList.head  = firstList.merge(firstList.head,secondList.head);
        System.out.println("After merge list....: ");
        mergeList.print();
    }
}
