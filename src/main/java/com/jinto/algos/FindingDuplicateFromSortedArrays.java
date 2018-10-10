package com.jinto.algos;

import java.util.ArrayList;
import java.util.List;

public class FindingDuplicateFromSortedArrays {

    public static void main(String[] args) {

        int[] arra1 = {10, 12, 14, 16, 18, 21, 22, 34, 45, 60, 70};
        int[] arra2 = {3, 5, 7, 10, 11, 12, 13, 18, 19, 20, 60};

        List<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0, j = 0; j < arra2.length && i < arra1.length; ) {
            if (arra1[i] < arra2[j]) {
                i++;
            } else if (arra1[i] > arra2[j]) {
                j++;
            } else {
                System.out.println(arra1[i] + " = " + arra2[j]);
                duplicates.add(arra1[i]);
                i++;
                j++;
            }
        }
        System.out.println(duplicates);
    }
}
