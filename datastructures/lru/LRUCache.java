package io.dowlath.javahidden.datastructures.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
   int capacity = 0;
   Node head;
   Node tail;
   Map<Long,Node> nodeMap = null;

   LRUCache(int capacity){
       this.capacity  = capacity;
       this.nodeMap = new HashMap<>();
   }

   public long get(long key){
       if(nodeMap.get(key) == null){
           return -1;
       }
       Node item = nodeMap.get(key);
       removeNode(item);;
       addToNode(item);
       return item.value;
   }

   public void put(long key,long value){
       if(nodeMap.containsKey(key)){
           Node item = nodeMap.get(key);
           removeNode(item);
           addToNode(item);
           item.value = value;
       } else if(nodeMap.size() >= capacity){
           nodeMap.remove(head.key);
           removeNode(head);
       }
       Node nodeItem1 = new Node(key, value);
       addToNode(nodeItem1);
       nodeMap.put(key,nodeItem1);
   }

   public void addToNode(Node node){
       if(tail != null){
           tail.next = node;
       }
       node.prev = tail;
       node.next = null;
       tail = node;
       if(head == null){
           head = tail;
       }
   }

   public void removeNode(Node node){
      if(node.prev != null){
          node.prev.next = node.next;
      } else{
          head = node.next;
      }
      if(node.next != null){
          node.next.prev = node.prev;
      }else{
          tail = node.prev;
      }
   }
}
