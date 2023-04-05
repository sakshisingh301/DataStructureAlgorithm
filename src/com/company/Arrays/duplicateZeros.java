package com.company.Arrays;

public class duplicateZeros {
  // idea is to find the zero and move all element to right and make next element as zero
    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                move(arr, i);
                i++;
            }
        }
    }

    public static void move(int[] arr, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        solution(arr);
    }
}
