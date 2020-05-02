package io.dowlath.javahidden.datastructures.string;

public class InterSectionOfTwoList {
     static ListNode head1,head2;
     static class ListNode{
         int data;
         ListNode next;
         ListNode(int data){
             this.data = data;
             this.next = null;
         }
     }

     public static int intesection(){
         int c1 = getCount(head1);
         int c2 = getCount(head2);
         int d = 0;
         if( c1 > c2){
             d = c1-c2;
             return getInterSection(d,head1,head2);
         }else{
             d = c2-c1;
             return getInterSection(d,head2,head1);
         }
     }

     public static int getCount(ListNode node){
         ListNode current = node;
         int count = 0;
         while(current != null){
             count++;
             current = current.next;
         }
         return count;
     }

     public static int getInterSection(int c, ListNode first , ListNode second){
         ListNode current_1 = first;
         ListNode current_2 = second;
         for(int i=0;i<c;i++){
             if(current_1 == null){
                 return -1;
             }
             current_1 = current_1.next;
         }
         while(current_1 != null && current_2 != null){
             if( current_1.data == current_2.data){
                 return current_1.data;
             }
             current_1 = current_1.next;
             current_2 = current_2.next;
         }
         return -1;
     }

    public static void main(String[] args) {
        InterSectionOfTwoList list = new InterSectionOfTwoList();
        list.head1 = new ListNode(10);
        list.head1.next = new ListNode(15);
        list.head1.next.next = new ListNode(20);
        list.head1.next.next.next = new ListNode(70);


        list.head2 = new ListNode(5);
        list.head2.next = new ListNode(18);
        list.head2.next.next = new ListNode(20);
        list.head2.next.next.next = new ListNode(40);

        int intersection = intesection();
        System.out.println("The intersection node .... :"+ intersection);
    }
}
