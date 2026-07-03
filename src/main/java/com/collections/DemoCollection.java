package com.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
    // Interable Interface
    // Interfaces ----
    // Collection is root interface for all other collection types
    // List is a ordered collection that can contain duplicate elements - ArrayList, LinkedList
    // Set is a collection that cannot contain duplicate elements - Hashset, TreeSet
    // Queue is a collection that designed for holding elements before processing - PriorityQueue, LinkedList when used as Queue
    // Deque is a double ended queue allows insertion and removal from both ends - ArrayDeque
    // Map - is a Interface that represents a collection of key - value pairs - HashMap, TreeMap

    // Implementations Classes
    //
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.contains(4));
//        arrayList.forEach(){
//            System.out.println();
//        }
    }
}
