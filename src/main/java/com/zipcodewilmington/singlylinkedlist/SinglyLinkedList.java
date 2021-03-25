package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable> {

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

    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("SinglyLinkedList is empty");
        }

        System.out.println("Nodes of SinglyLinkedList: ");
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void remove(int index){
        Node current = head;
        Node prev = null;
        int internalIndex = 0;

        if(current != null && index == 0){
            head = current.next;
        }

        while(current != null && index != internalIndex){
            prev = current;
            current = current.next;
            internalIndex++;
        }

        prev.next = current.next;
    }

    public boolean contains(T data){
        Node current = head;

        if(current == null){
            return false;
        }
        while(current != null){
            if(data == current.data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(T data){
        Node current = head;
        int index = 0;

        if(current == null){
            return -1;
        }
        while(current != null){
            if(data == current.data){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size(){
        Node current = head;
        int size = 0;

        if(current == null){
            return size;
        }
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public T get(int index){
        Node current = head;
        T returnData = null;
        int internalIndex = 0;

        if(current == null){
            return returnData;
        }
        while(current != null){
            if(index == internalIndex){
                returnData = current.data;
                return returnData;
            }
            internalIndex++;
            current = current.next;
        }
        return returnData;
    }

    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> copyList = new SinglyLinkedList<T>();
        Node current = head;

        while(current != null){
            copyList.add(current.data);
            current = current.next;
        }

        return copyList;
    }

    public SinglyLinkedList<T> sort(){
        Node current = head;
        Node next = null;
        T temp;

        //sort elements of current list
        while(current != null){
            next = current.next;

            while(next != null){
                if(current.data.compareTo(next.data) > 0){
                    temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }

        //add sorted elements to sortedList
        SinglyLinkedList<T> sortedList = new SinglyLinkedList<T>();
        Node newCurrent = head;
        while(newCurrent != null){
            sortedList.add(newCurrent.data);
            newCurrent = newCurrent.next;
        }
        return sortedList;

    }

    public SinglyLinkedList<T> reverse(){
        Node pointer = head;
        Node prev = null;
        Node current = null;

        while(pointer != null){
            current = pointer;
            pointer = pointer.next;

            current.next = prev;
            prev = current;
            head = current;
        }

        //add reversed elements to sortedList
        SinglyLinkedList<T> reversedList = new SinglyLinkedList<T>();
        Node newCurrent = head;
        while(newCurrent != null){
            reversedList.add(newCurrent.data);
            newCurrent = newCurrent.next;
        }
        return reversedList;

    }

    public SinglyLinkedList<T> slice(int startIndex, int stopIndex){
        return null;
    }


}
