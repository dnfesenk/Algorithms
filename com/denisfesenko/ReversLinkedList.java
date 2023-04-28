package com.denisfesenko;

public class ReversLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        System.out.println("Original list:");
        list.printList();

        list.reverse();

        System.out.println("\nReversed list:");
        list.printList();
    }
}

class LinkedList {
    Node head;

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current; // Move the previous pointer to the current node
            current = next; // Move the current pointer to the next node
        }

        head = previous; // Update the head to the last node in the original list
    }

    public void printList() {
        System.out.println("LinkedList{" +
                "head=" + head +
                '}');
    }

    // Other LinkedList methods like insert, delete, display, etc.
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}