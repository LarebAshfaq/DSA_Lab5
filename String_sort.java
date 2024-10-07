/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bubble_sort;

/**
 *
 * @author N TECH
 */
import java.util.Arrays;  // Import statement for Arrays class

public class String_sort {
    public static void bubbleSortByLength(String[] arr) {
        int n = arr.length;
        // Outer loop to iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare lengths of adjacent strings
                if (arr[j].length() > arr[j + 1].length()) {
                    // Swap if the current string is longer than the next one
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "pie", "banana", "cat"};
        bubbleSortByLength(arr);
        System.out.println(Arrays.toString(arr));  // Output: [pie, cat, apple, banana]
    }
}

