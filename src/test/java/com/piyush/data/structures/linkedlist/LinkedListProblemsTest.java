package com.piyush.data.structures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListProblemsTest {
    @Test
    public void testHasLoop_For_Empty_List(){
        Assertions.assertFalse(LinkedListProblems.hasLoop(null));
        Assertions.assertEquals(0, LinkedListProblems.findLengthOfLoop(null));

    }

    @Test
    public void testHasLoop_For_List_With_Single_Node(){
        LinkedListProblems.Node n1 = new LinkedListProblems.Node(1);
        Assertions.assertFalse(LinkedListProblems.hasLoop(n1));
        Assertions.assertEquals(0, LinkedListProblems.findLengthOfLoop(n1));
    }

    @Test
    public void testHasLoop_For_Lists_Without_Loop() {
        // 1 -2 -3
        // 1
        // 1-2
        LinkedListProblems.Node n1 = new LinkedListProblems.Node(1);
        LinkedListProblems.Node n2 = new LinkedListProblems.Node(2);
        LinkedListProblems.Node n3 = new LinkedListProblems.Node(3);

        n1.setNext(n2);
        n2.setNext(n3);

        Assertions.assertFalse(LinkedListProblems.hasLoop(n1));
        Assertions.assertEquals(0, LinkedListProblems.findLengthOfLoop(n1));

        n1.setNext(null);

        Assertions.assertFalse(LinkedListProblems.hasLoop(n1));
        Assertions.assertEquals(0, LinkedListProblems.findLengthOfLoop(n1));

        n2.setNext(null);

        Assertions.assertFalse(LinkedListProblems.hasLoop(n1));
        Assertions.assertEquals(0, LinkedListProblems.findLengthOfLoop(n1));
        Assertions.assertEquals(null, LinkedListProblems.findStartNodeOfLoop(n1));
    }

    @Test
    public void testHasLoop_For_List_With_Loop(){
        // Make a linked list.
        //  1 - 2 - 3 - 4 -  5
        //           \      /
        //            7 -- 6

        // Create linked list.
        LinkedListProblems.Node n1 = new LinkedListProblems.Node(1);
        LinkedListProblems.Node n2 = new LinkedListProblems.Node(2);
        LinkedListProblems.Node n3 = new LinkedListProblems.Node(3);
        LinkedListProblems.Node n4 = new LinkedListProblems.Node(4);
        LinkedListProblems.Node n5 = new LinkedListProblems.Node(5);
        LinkedListProblems.Node n6 = new LinkedListProblems.Node(6);
        LinkedListProblems.Node n7 = new LinkedListProblems.Node(7);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n3); // Points to node 3 to create loop.

        Assertions.assertTrue(LinkedListProblems.hasLoop(n1));
        Assertions.assertEquals(5, LinkedListProblems.findLengthOfLoop(n1));
        Assertions.assertEquals(n3, LinkedListProblems.findStartNodeOfLoop(n1));
    }
}
