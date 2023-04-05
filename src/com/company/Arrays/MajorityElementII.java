package com.company.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementII {

    public static List optimalSolution(int[] arr, int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int majority1 = -1;
        int majority2 = -1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == majority1) {
                count1++;
            } else if (arr[i] == majority2) {
                count2++;
            } else if (count1 == 0) {
                majority1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                majority2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == majority1) {
                count1++;
            } else if (arr[i] == majority2) {
                count2++;
            }
        }
        if (count1 > N / 3) {
            arrayList.add(majority1);
        }
        if (count2 > N / 3) {
            arrayList.add(majority2);
        }

        if (arrayList.isEmpty())
            return Collections.emptyList();

        return arrayList;
    }

    public static void main(String[] args) {
        int[] array = {-1, -1, -1};
        int N = 3;
        System.out.println(optimalSolution(array, N));
    }
}
