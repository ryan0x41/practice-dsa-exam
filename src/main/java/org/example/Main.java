package org.example;

import java.util.ArrayList;

public class Main {
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

        p.findElement(students, "Bob");

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

    }
}
