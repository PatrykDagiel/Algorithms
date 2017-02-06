package Sorting;

import java.util.Random;

/**
 * Created by dagiel on 2016-11-22.
 */
public class ApplicationRunner {
    public static void main(String[] args){
        int[] dummy = new int[12];
//        InsertSort container = new InsertSort(dummy);
//        BubbleSort container = new BubbleSort(dummy);
//        HeapSort container = new HeapSort(dummy);
        MergeSort container = new MergeSort(dummy);
        container.arrayBeforePrint();
        container.mergeSort(0, container.tab.length-1);
        container.arrayAfterPrint();
    }
}
