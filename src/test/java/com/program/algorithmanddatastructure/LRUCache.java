package com.program.algorithmanddatastructure;

import java.util.*;

public class LRUCache {

    private int capacity;
    Set cache;
    LinkedList<Node> cacheValues;

    public LRUCache(int capacity){
        this.capacity=capacity;
        this.cacheValues = new LinkedList();
        this.cache=new HashSet();
    }

    static class Node{

        String key;
        String value;

        public Node(String key,String value){
            this.key=key;
            this.value=value;
        }

    }

    public void set(String key , String value){
            Node node = get(key);
            if(node==null){
                evictIfNeeded();
                Node newNode = new Node(key,value);
                cacheValues.addLast(newNode);
                cache.add(newNode.key);
            }else {
                cacheValues.remove(node);
                cache.remove(node.key);
            }

    }

    private void evictIfNeeded() {
        if(cacheValues.size()==capacity){
            Node node = cacheValues.remove();
            cache.remove(node.key);
        }

    }

    private Node get(String key) {

        if(!cache.contains(key)){
            return null;
        }else{
            ListIterator<Node> listIterator=cacheValues.listIterator();
            while(listIterator.hasNext()){
                Node node=listIterator.next();
                if(node.key==key){
                    return node;
                }
            }
        }
        return null;
    }

    void print() {
        ListIterator<Node> iterator = cacheValues.listIterator(0);
        while(iterator.hasNext()){
            Node node = iterator.next();
            System.out.print("(" + node.key + "," + node.value + ")");
        }
        System.out.println("");
    }

    private void evict(String key) {
         ListIterator<Node> listIterator = cacheValues.listIterator();
         Node node=null;
         while(listIterator.hasNext()){
              Node node1 = listIterator.next();
              if(node1.key==key){
                  node=node1;
              }
         }
         cacheValues.remove(node);
         cache.remove(key);
    }

    public static void main(String [] args){

        LRUCache lru = new LRUCache(2);
        lru.set("10","20");
        lru.print();

        lru.set("15","25");
        lru.print();

        lru.set("20","30");
        lru.print();

        lru.set("25","35");
        lru.print();

        lru.set("5","25");
        lru.print();
    }

}
