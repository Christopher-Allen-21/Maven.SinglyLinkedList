package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {


    @Test
    public void testAdd1(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";

        myList.add(string1);

        boolean expected1 = true;

        boolean actual1 = myList.contains(string1);

        Assert.assertEquals(expected1,actual1);
    }

    @Test
    public void testAdd2(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";

        boolean expected1 = false;

        boolean actual1 = myList.contains(string1);

        Assert.assertEquals(expected1,actual1);
    }

    @Test
    public void testAdd(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";

        myList.add(string1);
        myList.add(string2);

        boolean expected1 = true;
        boolean expected2 = true;

        boolean actual1 = myList.contains(string1);
        boolean actual2 = myList.contains(string2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void testFind1(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";

        myList.add(string1);
        myList.add(string2);

        int expected = 1;
        int actual = myList.find(string2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFind2(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";
        String string4 = "Hello 4";

        myList.add(string1);
        myList.add(string2);
        myList.add(string3);
        myList.add(string4);

        int expected = 2;
        int actual = myList.find(string3);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSize1(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";
        String string4 = "Hello 4";

        myList.add(string1);
        myList.add(string2);
        myList.add(string3);
        myList.add(string4);

        int expected = 4;
        int actual = myList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSize2(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        int expected = 0;
        int actual = myList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest1(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";
        String string4 = "Hello 4";

        myList.add(string1);
        myList.add(string2);
        myList.add(string3);
        myList.add(string4);

        String expected = string2;
        String actual = myList.get(1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest2() {
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";

        myList.add(string1);
        myList.add(string2);

        String expected = null;
        String actual = myList.get(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest3() {
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String expected = null;
        String actual = myList.get(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest4() {
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
        myList.add(25);
        myList.add(60);
        myList.add(2021);

        Integer expected = 60;
        Integer actual = myList.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";

        myList.add(string1);
        myList.add(string2);
        myList.add(string3);

        myList.remove(1);


        String expected1 = string1;
        String actual1 = myList.get(0);

        String expected2 = string3;
        String actual2 = myList.get(1);

        int expected3 = 2;
        int actual3 = myList.size();

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test
    public void testCopy(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";

        myList.add(string1);
        myList.add(string2);
        myList.add(string3);

        SinglyLinkedList<String> copyList = myList.copy();

        String expected1 = string1;
        String actual1 = copyList.get(0);

        String expected2 = string2;
        String actual2 = copyList.get(1);

        String expected3 = string3;
        String actual3 = copyList.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test
    public void testReverse(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        String string1 = "Hello 1";
        String string2 = "Hello 2";
        String string3 = "Hello 3";

        myList.add(string1);
        myList.add(string2);
        myList.add(string3);

        SinglyLinkedList<String> reverseList = myList.reverse();

        String expected1 = string3;
        String actual1 = reverseList.get(0);

        String expected2 = string2;
        String actual2 = reverseList.get(1);

        String expected3 = string1;
        String actual3 = reverseList.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test
    public void testSort1(){
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
        myList.add(500);
        myList.add(3);
        myList.add(21);

        SinglyLinkedList<Integer> sortedList = myList.sort();

        Integer expected1 = 3;
        Integer actual1 = sortedList.get(0);

        Integer expected2 = 21;
        Integer actual2 = sortedList.get(1);

        Integer expected3 = 500;
        Integer actual3 = sortedList.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

    @Test
    public void testSort2(){
        SinglyLinkedList<String> myList = new SinglyLinkedList<String>();

        myList.add("Arnold");
        myList.add("Jackson");
        myList.add("Chris");

        SinglyLinkedList<String> sortedList = myList.sort();

        String expected1 = "Arnold";
        String actual1 = sortedList.get(0);

        String expected2 = "Chris";
        String actual2 = sortedList.get(1);

        String expected3 = "Jackson";
        String actual3 = sortedList.get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }
}
