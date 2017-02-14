package Euler_Project_Alghoritms;

import java.math.BigInteger;

/**
 * Created by dagiel on 14/02/2017.
 */
public class Factorial_digit_sum {

    private static BigInteger size = BigInteger.valueOf(100);
    private static BigInteger result = big_fact(size);


    static BigInteger big_fact(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while(!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }

    static void calculate() {
        String digits = result.toString();
        int sum = 0;
        for (int i =0; i < digits.length(); i++){
            sum += (int) (digits.charAt(i) - '0');
        }
        System.out.print(sum);
    }



    public static void main(String[] args) {
        calculate();
    }


}
