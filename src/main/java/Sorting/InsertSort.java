package Sorting;

import java.util.Arrays;

/**
 * Created by dagiel on 2016-11-22.
 */
public class InsertSort {

    private int[] tab;

    public InsertSort(int[] dummy) {
        tab = dummy;
    }

    public void calculate() {
        System.out.println("Here is an array before : " + Arrays.toString(tab));

        for(int i = 1; i < (tab.length); i++) {
            int j = i;
            int temp = tab[j];
            while((j > 0) && (tab[j-1] > temp))
            {
                tab[j] = tab[j-1];
                j--;
            }
            tab[j] = temp;
        }

        System.out.println("Here is an array after sorting: " + Arrays.toString(tab));
    }

}
