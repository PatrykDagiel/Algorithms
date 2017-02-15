package Euler_Project_Alghoritms;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by dagiel on 15/02/2017.
 */
public class EulerProject23 {

    static ArrayList<Integer> abundant_list = new ArrayList<Integer>();


    static void calculate_abundants() {
        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            divisors(i);
        }
        System.out.println(abundant_list);
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
