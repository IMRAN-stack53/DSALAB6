/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bublesort;

/**
 *
 * @author Mujtaba Abr
 */
public class OptimizedBuble {
      
    public static void earlyStopBubbleSort(int[] arr) {
        int n = arr.length;
for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; 
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
 }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        int[] arr = {9, 4, 5, 2, 22, 11, 20};
        System.out.println("Original array: ");
        printArray(arr);
        earlyStopBubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

    

