/**
 *  Java program to create, update, display, and clear Vector instance.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Vector<Float> myVector = new Vector<>();

        // Add.
        myVector.add(123F);
        myVector.add(456F);
        myVector.add(789F);

        // Display.
        System.out.println(myVector); // Output: [123.0, 456.0, 789.0]

        // Print first value.
        System.out.println("First elements: " + myVector.firstElement()); // Output: First elements: 123.0

        // Print last element.
        System.out.println("Last element: " + myVector.lastElement()); // Output: Last element: 789.0

        // Update.
        myVector.add(123456.7889F);

        // Display.
        System.out.println(myVector); // Output: [123.0, 456.0, 789.0, 123456.79]

        // Clear.
        myVector.clear();

    }
}