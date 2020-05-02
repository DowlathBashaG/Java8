package io.dowlath.javahidden.datastructures.lru;

public class LRUCacheMain {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(5);
        cache.put(1l,10);
        cache.put(2l,20);
        cache.put(3l,30);
        cache.put(4l,40);
        cache.put(5l,50);

        System.out.println(cache.get(1l));
        cache.put(6,60);
        System.out.println(cache.get(2l));
        cache.put(7l,70);
        System.out.println(cache.get(3l));
        System.out.println(cache.get(4l));
        System.out.println(cache.get(5l));


    }
}
