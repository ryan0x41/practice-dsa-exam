package org.example;

import java.util.ArrayList;

public class Main {

    public static void printSeperator() {
        System.out.println("------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Practice p = new Practice();

        // ------------------------------------------------------------------------

        // Question 1: 2013-2014

        // Consider that you have an `ArrayList` type object named students that stores a collection of students’ name in
        // the following format “John Murphy”. Provide the Java code for the `findElement` method that checks if the name
        // “John Murphy” exists in the collection. If the name exists, a text is printed out indicating that the name was
        // found and the position of the searched name in the collection. If the name does not exist, a text is printed out
        // indicating that the name was not found.

        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Bob");

        // GOTO: definition plz
        p.findElement(students, "Bob");
        printSeperator();

        // ------------------------------------------------------------------------

        // Question 1: Sample Exam 2024

        // Explain and show the state of an initially empty queue after each of the following
        // operations on it: enqueue(“apple”), enqueue (“orange”), enqueue(“melon”), front( ),
        // dequeue( ) , dequeue( )

        // Step 1: enqueue(“apple”)
        //     front/rear
        //  - [  "apple"  ]

        // Step 2: enqueue(“orange”)
        //    front      rear
        //  - [ "apple", "orange" ]

        // Step 3: enqueue(“melon”)
        //    front                rear
        //  - [ "apple", "orange", "melon" ]

        // Step 4: dequeue()
        //    front       rear
        //  - [ "orange", "melon"]

        // Step 5: dequeue()
        //    front/rear
        //  - [ "melon" ]

        // ------------------------------------------------------------------------

        // Question 2: Sample Exam 2024

        // Consider that you have an ArrayList type object that stores Book data. Provide Java
        // code to do the following:
        //      A. to remove the book “Intro to Java”, at the first position of the ArrayList
        //      B. to print out the element at the last position of the ArrayList storing the book
        //         information.

        ArrayList<String> books = new ArrayList<>();
        books.add("into to java");
        books.add("book 2");
        books.add("book 3");

        // A: remove book at index 0, (first book)
        books.remove(0);

        // B: print out last element in ArrayList
        System.out.println(books.get(books.size() - 1));
        printSeperator();

        // ------------------------------------------------------------------------

        // Question 3: Sample Exam 2024

        // Explain the principle of insertion and removal performed on the stack abstract data
        // type.

        // stacks can be implemented using ArrayLists LinkedLists or other data structures.
        // the stack follows a LIFO principle, meaning the last element inserted is the first
        // to be removed.    to "insert" onto the stack, we use push(), to remove the top
        // element we use pop()

        // due to the LIFO structure, we do not / cannot directly access or remove elements
        // at specific indices

        // ------------------------------------------------------------------------

        // Question 4: Sample Exam 2024

        // Provide the Java code for the print method of a single linked list.

        // GOTO: definition plz
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);

        // GOTO: definition plz
        p.printList(head);
        printSeperator();

        // ------------------------------------------------------------------------

        // Question 5: Sample Exam 2024

        //

        // ------------------------------------------------------------------------

        // Question 6: Sample Exam 2024

        //

    }

}
