package com.example.DeliveryService.dataStructure;

public class pair<K,V> {
    K first;
    V second;
    public pair(K first,V second){
        this.first=first;
        this.second=second;
    }
    public K getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
}
