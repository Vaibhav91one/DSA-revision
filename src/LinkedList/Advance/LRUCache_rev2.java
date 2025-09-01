package LinkedList.Advance;

import java.util.HashMap;

class Node_LRU {
    int key; // data
    int value; // priority
    Node_LRU next;
    Node_LRU prev;

    Node_LRU(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class LRU_Cache{
    int capacity;
    HashMap<Integer, Node_LRU> cacheMap;
    Node_LRU head;
    Node_LRU tail;

    LRU_Cache(int capacity){
        this.capacity = capacity;
        this.cacheMap = new HashMap<>(); // hashmap for O(1) access to elements
        this.head = new Node_LRU(-1, -1); // head and tail nodes boundaries for doubly linked list
        this.tail = new Node_LRU(-1, -1);
        this.head.next = this.tail; // connecting head and prev boundaries
        this.tail.prev = this.head;
    }


    int get(int key){
        if(!cacheMap.containsKey(key)){
            return -1;
        }

        Node_LRU node = cacheMap.get(key); // getting the node from the doubly linked list
        remove(node); // removing because the node element is accessed and requires cache to be refreshed.
        add(node); // adding the element next to head as the most recent used element.
        return node.value;
    }

    void put(int key, int value){
        if(cacheMap.containsKey(key)){
            Node_LRU oldNode = cacheMap.get(key); // getting the old node;
            remove(oldNode);
        }

        Node_LRU node = new Node_LRU(key, value);
        cacheMap.put(key,node); // updating hashmap
        add(node); // adding to doubly linked list, next to head

        // removing last element if capacity is exceeded
        if(cacheMap.size() > capacity){
            Node_LRU lastNode = tail.prev;
            remove(lastNode);
            cacheMap.remove(lastNode.key);
        }
    }

    void add(Node_LRU node){
        Node_LRU nextNode = head.next; // saving the element next to head where head here is -1
        head.next = node; // putting next to head;
        node.next = nextNode; // linking new node to head and nextnode
        node.prev = head;
        nextNode.prev = node;
    }

    void remove (Node_LRU node){
        Node_LRU prevNode = node.prev; // saving next and prev node of the element to be deleted
        Node_LRU nextNode = node.next;
        prevNode.next = nextNode; // linking prev and next node of the element to be deleted
        nextNode.prev = prevNode;
    }



}



public class LRUCache_rev2 {
    public static void main(String[] args){
        LRU_Cache cache = new LRU_Cache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
