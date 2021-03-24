package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    class Node{
        T data;
        Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public SinglyLinkedList(){

    }


    public void add(T data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(T node){

    }

    public boolean contains(T node){
        return false;
    }

    public int find(T node){
        return -1;
    }

    public int size(){
        return -1;
    }

    public T get(int index){
        return null;
    }

    public SinglyLinkedList<T> copy(){
        return null;
    }

    public SinglyLinkedList<T> sort(){
        return null;
    }

    public SinglyLinkedList<T> reverse(){
        return null;
    }

    public SinglyLinkedList<T> slice(int startIndex, int stopIndex){
        return null;
    }


}
