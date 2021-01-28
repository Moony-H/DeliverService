package com.example.whitesnow.dataStructure;

public class pair<K,V> {
    K first;
    V second;
    public pair(K first,V second){
        this.first=first;
        this.second=second;
    }
    public K First(){
        return first;
    }
    public V Second(){
        return second;
    }
}
