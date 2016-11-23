package com.dagiel.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dagiel on 2016-11-23.
 */
public class HeapSort {
    int[] tab;

    public HeapSort(int[] dummy) {
        tab = dummy;
        for (int x = 0; x < dummy.length; x++) {
            Random rand = new Random();
            dummy[x] = rand.nextInt(10000); // Generates random from 0 to 10000
        }
    }

    public void restore(int k, int n) {

        int i, j;

        i = tab[k-1];
        while (i <= tab.length / 2) {
            j = 2 * k;
            if ((j < n) && (tab[j - 1] < tab[j])) j++;
            if (i >= tab[j - 1])
                break;
            else {
                int temp = tab[j - 1];
                tab[k - 1] = tab[j - 1];
            }
        tab[k-1] = i;
        }
    }

    public void heapsort(int n) {

        arrayBeforePrint();

        int k, swap;
        for (k = n/2; k > 0; k--) restore(k, n);
        do {
            swap = tab[0];
            tab[0] = tab[n-1];
            tab[n-1] = swap;
            n--;
            restore(1, n);
        } while (n > 1);

        arrayAfterPrint();
    }

    void arrayBeforePrint() {
        System.out.println("Here is an array: " + Arrays.toString(tab));
    }

    void arrayAfterPrint() {
        System.out.println("Here is an array after sorting: " + Arrays.toString(tab));
    }
}
