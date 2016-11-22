package com.dagiel.sorting;

import java.util.Random;

/**
 * Created by dagiel on 2016-11-22.
 */
public class ApplicationRunner {
    public static void main(String[] args){
        int[] dummy = new int[6];
//        InsertSort container = new InsertSort(dummy);
//        BubbleSort container = new BubbleSort(dummy);
        QuickSort container = new QuickSort(dummy);
        container.arrayBeforePrint();
        container.calculate(container.left , container.right);
        container.arrayAfterPrint();
    }
}
