package Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dagiel on 2016-11-23.
 */
public class MergeSort {
    int[] tab;

    public MergeSort(int[] dummy) {
        tab = dummy;
        for (int x = 0; x < dummy.length; x++) {
            Random rand = new Random();
            dummy[x] = rand.nextInt(10000); // Generates random from 0 to 10000
        }
    }

    /*
        p - beginning of an array, mid - middle of an array, k - end of an array
        We divide our problem into 2
     */

    public void merge(int p, int mid, int k) {
        int[] dummyTab = new int[tab.length];
        int p1 = p;
        int k1 = mid;
        int p2 = mid+1;
        int k2 = k;
        int i = p1;

        while ((p1 <= k1) && (p2 <= k2))
        {
            if(tab[p1] < tab[p2])
            {
                dummyTab[i] = tab[p1];
                p1++;
            }
            else
            {
                dummyTab[i] = tab[p2];
                p2++;
            }
        i++;
        }

        while (p1 <= k1)
        {
            dummyTab[i] = tab[p1];
            p1++;
            i++;
        }
        while (p2 <= k2)
        {
            dummyTab[i] = tab[p2];
            p2++;
            i++;
        }
        for (i = p; i <= k;  i++) {
            tab[i] = dummyTab[i];
        }

    }


    void mergeSort(int p, int k) {
        if (p < k) {
            int mid = (p + k) / 2;
            mergeSort(p, mid);
            mergeSort(mid+1, k);
            merge(p, mid, k);
        }
    }

    void arrayBeforePrint() {
        System.out.println("Here is an array: " + Arrays.toString(tab));
    }

    void arrayAfterPrint() {
        System.out.println("Here is an array after sorting: " + Arrays.toString(tab));
    }
}
