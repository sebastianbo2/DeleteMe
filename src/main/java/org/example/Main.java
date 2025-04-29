package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        int[] numsBackup = Arrays.copyOf(nums, nums.length);
        insertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    /**
     * sorts an array by bringing the largest value in each iteration towards the end of the array
     * @param nums the input array
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * sorts an array by finding the smallest value and bringing it towards the front of the array
     * @param nums the input array
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    /**
     * sorts an array by inserting each element at its correct index in the array
     * @param nums the input array
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
               nums[j + 1] = nums[j];
               j--;
            }
            nums[j + 1] = key;
        }
    }
}
