package org.example;

import java.util.ArrayList;

// q4 sp2024
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Practice {

    // TODO: figure out if linear search is sufficient

    // Consider that you have an `ArrayList` type object named students that stores a collection of students’ name in
    // the following format “John Murphy”. Provide the Java code for the `findElement` method that checks if the name
    // “John Murphy” exists in the collection. If the name exists, a text is printed out indicating that the name was
    // found and the position of the searched name in the collection. If the name does not exist, a text is printed out
    // indicating that the name was not found.

    public void findElement(ArrayList<String> students, String name) {
        for(int i=0; i<=students.size(); i++) {
            if(students.get(i).equals(name)) {
                System.out.println(String.format("[+] found\n\t%s at postition: %d", name, i));
                return;
            }
        }
        System.out.println("not found\n\t");
    }

    // q4 sp2024
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


}
