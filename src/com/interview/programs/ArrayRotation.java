package com.interview.programs;

public class ArrayRotation {

    // Utility method to reverse part of the array
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Left rotation by k positions
    static void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // handle if k > n

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }

    // Right rotation by k positions
    static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // handle if k > n

        // Step 1: Reverse last k elements
        reverse(arr, n - k, n - 1);

        // Step 2: Reverse first n-k elements
        reverse(arr, 0, n - k - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }

    // Print utility
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr1);

        leftRotate(arr1, 2); // Rotate left by 2
        System.out.println("Array after LEFT rotation by 2:");
        printArray(arr1);

        int arr2[] = {1, 2, 3, 4, 5, 6, 7};
        rightRotate(arr2, 2); // Rotate right by 2
        System.out.println("Array after RIGHT rotation by 2:");
        printArray(arr2);
    }
}
