package com.company.Arrays;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public static boolean solution(int[] arr) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            sum = total;
        }
        if (sum % 3 != 0)
            return false;
        int partition = sum / 3;
        int count = 0;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum == partition) {
                count++;
                currSum = 0;
            }
        }
        if (count >= 3)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int[] array = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        System.out.println(solution(array));

    }
}
