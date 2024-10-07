/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bubble_sort;
/**
 *
 * @author N TECH
 */
public class Bubble_sort {
public void bubbleSort(int[] arr){
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1; j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        Bubble_sort sort= new Bubble_sort();
        int[]arr={5,1,3,4,6,2};
        sort.bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
