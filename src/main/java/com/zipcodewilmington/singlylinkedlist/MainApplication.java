package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
        myList.add("String 1");
        myList.add("String 2");
        myList.add("String 3");

        myList.display();
    }


}
