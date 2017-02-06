package Euler_Project_Alghoritms;

import java.util.ArrayList;

/**
 * Created by dagiel on 06/02/2017.
 */
public class Even_Fibonacci {
    private long even_sum = 0;
    private int size;


    Even_Fibonacci(int y) {
        size = y;
    }

    long fibonacci(int x) {
            if (x < 2) return x;
            else return fibonacci(x-1) + fibonacci(x-2);
    }

    int how_many_numbers() {
        int i = 0;
        long checker = 0;
        while (checker <= size){
            checker = fibonacci(i);
            i++;
        }
        return i;
    }

    void calculate() {
        int z = how_many_numbers();
        for (int i = 0; i <= z; i++) {
            long temporary = fibonacci(i);
            System.out.println("Temporary to: " + temporary + "\n");
            if (temporary % 2 == 0) even_sum += temporary;
        }
    }

    public static void main(String[] args){
        Even_Fibonacci container = new Even_Fibonacci(4000000);
        container.calculate();
        System.out.println("Wynik to: " + container.even_sum);
    }

}
