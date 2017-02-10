package Euler_Project_Alghoritms;

import java.math.BigInteger;

/**
 * Created by dagiel on 09/02/2017.
 */
public class ProjectEuler16 {
    private static BigInteger result;

    static void pow_of_2(int exp) {
        for (int i = 1; i <= 1000; i++ ) {
            result = BigInteger.valueOf(2).pow(exp);
        }
    }

    void calculate() {
        String digits = result.toString();
        int sum = 0;
        for (int i =0; i < digits.length(); i++){
            sum += (int) (digits.charAt(i) - '0');
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        ProjectEuler16 container = new ProjectEuler16();
        container.pow_of_2(1000);
        container.calculate();
    }

}
