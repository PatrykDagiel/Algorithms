package Euler_Project_Alghoritms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by dagiel on 15/02/2017.
 */
public class EulerProject23 {

    static ArrayList<Integer> abundant_list = new ArrayList<Integer>();
    static LinkedHashSet<Integer> abundant_list_sums = new LinkedHashSet<Integer>();
    static long sum_all = 0;
    static long sum_from_abundants = 0;


    static void calculate_abundants() {
        for(int i = 0; i <= 28123; i++) {
            divisors(i);
        }
        for (int x = 0; x < abundant_list.size(); x++) {
            for (int y = 0; y < abundant_list.size(); y++) {
                int z = abundant_list.get(x)+abundant_list.get(y);
                if (z <= 28123) abundant_list_sums.add(z);
            }
        }

        System.out.println(abundant_list_sums);

        for (Integer i : abundant_list_sums) {
            sum_from_abundants += i.intValue();
        }

        for (int i = 0; i <= 28123; i++) {
            sum_all += i;
        }

        System.out.println("Sum of integers that cannot be composed of 2 abundants: " + (sum_all - sum_from_abundants));

    }

    static void divisors(Integer n) {
        int sum_divisors = 0;
        for (int i = 1; i < n.intValue(); i++) {
            if (n.intValue() % i == 0) {
                sum_divisors += i;
            }

        }
        if (sum_divisors > n.longValue()){
            abundant_list.add(n);
        }
    }



    public static void main(String[] args) {

        calculate_abundants();
    }
}
