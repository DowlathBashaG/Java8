package io.dowlath.javahidden.datastructures.lru;

public class Node {
   long key;
   long value;
   Node prev;
   Node next;
   Node(long key,long value){
       this.key = key;
       this.value = value;
   }
}
