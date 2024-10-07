/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bubble_sort;

/**
 *
 * @author N TECH
 */
public class Optimized_BubbleSort {
    public void earlyStopBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop to go over each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Reset swapped flag for each pass
            
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Mark that a swap occurred
                }
            }
            
            // If no swaps occurred in the last pass, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Optimized_BubbleSort sort = new Optimized_BubbleSort();
        int[] array = {55, 16, 37, 45, 67, 22};
        
        // Call the optimized bubble sort
        sort.earlyStopBubbleSort(array);
        
        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
