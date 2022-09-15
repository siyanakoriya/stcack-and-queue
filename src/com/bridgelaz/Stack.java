package com.bridgelaz;


public class Stack <T>{
    LinkedList<T> linkedList = new LinkedList<>();
    public void push(T data) {
        linkedList.addAtStart(data);
    }


    public void print(){
        linkedList.print();
    }
}
