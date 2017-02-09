package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 09/02/2017.
 */
public class Triangular_Number {

    private static long triangular = 0;

    static void calculate() {
            for (long n = 500; ; n++ ) {
                triangular = (n*(n+1)/2);
                if (divisors(triangular) > 500) {
                    System.out.println("Answer " + triangular);
                    System.exit(0);
                }
        }
    }

    private static long divisors(long x) {
        int counter = 1;
        long factor = 2;

        while (factor <= x) {
            int temp = 1;
            while (x % factor == 0) {
                x /= factor;
                temp++;
            }
            counter *= temp;
            factor++;
        }
        return counter;
    }


    public static void main(String[] args){
        calculate();
    }
}
