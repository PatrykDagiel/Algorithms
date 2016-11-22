package com.dagiel.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dagiel on 2016-11-22.
 */
public class QuickSort {
    int[] tab;
    int left;
    int right;

    public QuickSort(int[] dummy) {
        tab = dummy;
        for (int x = 0; x < dummy.length; x++) {
            Random rand = new Random();
            dummy[x] = rand.nextInt(10000); // Generates random from 0 to 10000
        }
        left = 0;
        right = tab.length-1;
    }

    public void calculate(int left, int right) {

        if (left < right) {
            int m = left;
            for (int i = left + 1; i <= right; i++)
                if (tab[i] < tab[left]) {
                    int temp = tab[++m];
                    tab[m] = tab[i];
                    tab[i] = temp;
                }
            int temp = tab[left];
            tab[left] = tab[m];
            tab[m] = temp;

            calculate(left, m-1);
            calculate(m+1, right);
        }
    }

    void arrayBeforePrint() {
        System.out.println("Here is an array: " + Arrays.toString(tab));
    }

    void arrayAfterPrint() {
        System.out.println("Here is an array after sorting: " + Arrays.toString(tab));
    }
}
