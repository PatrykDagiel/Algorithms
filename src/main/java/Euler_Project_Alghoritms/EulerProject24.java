package Euler_Project_Alghoritms;

import javafx.collections.transformation.SortedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dagiel on 16/02/2017.
 */
public class EulerProject24 {

    private int[] array = {0,1,2,3,4,5,6,7,8,9};
    private ArrayList<Integer> lista = new ArrayList<Integer>();

    void calculate(int i) {
        for (int x = array.length - 1; x >= 0; x--) {
            int counter = 0;
        while (i - factorial(x) >= 0){
            i -= factorial(x);
            counter += 1;
            }
            lista.add(counter);

            System.out.println("Counter dla pozycji " + (array.length - x) + " wynosi " + counter);
        }

        nextPermutation(lista);

        System.out.println(lista);
    }

    boolean nextPermutation(ArrayList<Integer> x) {
        int i = x.size() - 1;

        //find longest non-increasing suffix

        while (i > 0 && x.get(i-1) >= x.get(i))
            i--;

        if (i <= 0)
            return false;

        //Find righmost element that exceeds pivot
        int j = x.size() - 1;
        while(x.get(j) <= x.get(i - 1))
            j--;

        //Swap pivot
        int temp = x.get(i - 1);
        x.set(i-1,x.get(j));
        x.set(j,temp);

        j = x.size() - 1;
        while (i < j) {
            temp = x.get(i);
            x.set(i, x.get(j));
            x.set(j, temp);
            i++;
            j--;
        }
        return true;
    }

    public void quick_answer() {
        // Initialize
        for (int i = 0; i < array.length; i++)
            lista.add(i);
        // Permute
        for (int i = 0; i < 999999; i++) {
            if (!nextPermutation(lista))
                throw new AssertionError();
        }
        System.out.print(lista);
    }

   int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        EulerProject24 container = new EulerProject24();
        container.quick_answer();
    }


}
