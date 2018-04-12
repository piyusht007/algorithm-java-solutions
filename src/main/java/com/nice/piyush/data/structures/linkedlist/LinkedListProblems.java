package com.nice.piyush.data.structures.linkedlist;

public class LinkedListProblems {
    public static class Node {
        private int data;
        private Node node;

        public Node(int data) {
            this.data = data;
            this.node = null;
        }

        public int getData() {
            return data;
        }

        public void setNext(Node node) {
            this.node = node;
        }

        public Node getNext() {
            return node;
        }
    }

    public static boolean hasLoop(final Node startNode) {
        Node slowPointer = startNode, fastPointer = startNode;

        while (slowPointer != null && fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();

            if (slowPointer.getData() == fastPointer.getData()) {
                return true;
            }
        }

        return false;
    }

    public static int findLengthOfLoop(final Node startNode) {
        int loopLength = 0;
        Node slowPointer = startNode, fastPointer = startNode;

        while (slowPointer != null && fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();

            if (slowPointer == fastPointer) {
                // Now move any of the pointers with the speed of 1 till it reaches to the same point again.
                loopLength++;
                fastPointer = fastPointer.getNext();

                while (slowPointer != fastPointer) {
                    fastPointer = fastPointer.getNext();
                    loopLength++;
                }

                return loopLength;
            }
        }

        return loopLength;
    }

    public static Node findStartNodeOfLoop(final Node startNode) {
        Node slowPointer = startNode, fastPointer = startNode;

        while (slowPointer != null && fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();

            if (slowPointer.getData() == fastPointer.getData()) {
                fastPointer = startNode;

                while (slowPointer != fastPointer){
                    fastPointer = fastPointer.getNext();
                    slowPointer = slowPointer.getNext();
                }

                return slowPointer;
            }
        }

        return null;
    }
}
