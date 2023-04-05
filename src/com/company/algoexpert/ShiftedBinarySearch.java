package com.company.algoexpert;

public class ShiftedBinarySearch {
    public static int shiftedBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] >= array[start]) {
                if (array[start] >= target && array[mid]<=array[start]) {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
                }
            else {
                if(array[end]<=target && array[mid]<=target)
                {
                 start=mid+1;
                }
                else
                {
                    end=mid-1;
                }

            }

        }
        return -1;

    }


    public static void main(String[] args) {
        int[] a = {45, 61, 71, 72, 73, 0, 1, 21, 33, 37};
        int target = 33;
        System.out.println(shiftedBinarySearch(a, target));
    }
}
