package Euler_Project_Alghoritms;

import java.util.ArrayList;

/**
 * Created by dagiel on 07/02/2017.
 */
public class Largest_Palindrome {
    private int memory = 0;
    private int parts_size;
    private int max_number = 0;

    Largest_Palindrome(int x) {
        parts_size = x;
    }

    private boolean is_divided_by_11(int x) {
        if (x % 11 == 0) return true;
        else return false;
    }

    public int maximum_number_possible() {
        for (int digit = 0; digit < parts_size; digit++) {

            max_number += 9*Math.pow(10,digit);
        }
        return max_number;
    }

    private void calculate() {
        int number = maximum_number_possible();
        System.out.println("For two numbers sized on " + parts_size + " positions maximum possible multiplication is " + number);
        ArrayList<Integer> elements = new ArrayList<Integer>(number);
        for (int i = 0; i <= number; i++) {
            for (int y = 0; y <= number; y++){
                int result = y * i;
            if(is_divided_by_11(result))
                elements.add(result);
        }
        }

        for(Integer i : elements) {
            String pattern = i.toString();
            if (pattern.equals(new StringBuilder(pattern).reverse().toString())) {
                if (memory < i.intValue()) memory = i.intValue();
            }
        }
        System.out.println(memory);
    }

    public static void main(String[] args) {
        Largest_Palindrome container = new Largest_Palindrome(3);
          container.calculate();
    }
}
