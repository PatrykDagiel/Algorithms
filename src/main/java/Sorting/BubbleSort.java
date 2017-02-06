package Sorting;

        import java.util.Arrays;

/**
 * Created by dagiel on 2016-11-22.
 */
public class BubbleSort {

    private int[] tab;

    public BubbleSort(int[] dummy) {
        tab = dummy;
    }

    public void calculate() {
        System.out.println("Here is an array before : " + Arrays.toString(tab));

        for(int i = 1; i < (tab.length); i++) {
            for(int j = tab.length -1; j >= i; j--) {
                if (tab[j] < tab[j-1]) {
                    int tmp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = tmp;
                }
            }
        }

        System.out.println("Here is an array after sorting: " + Arrays.toString(tab));
    }

}
