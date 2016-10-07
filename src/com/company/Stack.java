package com.company;

import java.util.LinkedList;

/**
 * Created by azolotukhin on 21.09.2016.
 */
public class Stack<T> {
    LinkedList<T> storage = new LinkedList<T>();
    public void push (T in){
        storage.addLast(in);
    }
    public T peak(){
        return storage.getFirst();
    }
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }
}
