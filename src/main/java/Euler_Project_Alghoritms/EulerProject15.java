package Euler_Project_Alghoritms;

import java.math.BigInteger;

/**
 * Created by dagiel on 09/02/2017.
 */
public class EulerProject15 {

    private BigInteger size_x = BigInteger.valueOf(20);
    private BigInteger size_y = BigInteger.valueOf(20);


    EulerProject15() {
    }

//    EulerProject15(BigInteger a, BigInteger b) {
//        size_x.add(a);
//        size_y.add(b);
//    }

    long factorial(long i) {
        if (i < 1)
            return 1;
        else
            return i * factorial(i - 1);

    }

    BigInteger big_fact(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while(!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }

    void calculate() {
        BigInteger result_top = big_fact(size_x.add(size_y));
        BigInteger result_bot = (big_fact(size_y).multiply(big_fact(size_x)));
        BigInteger result = result_top.divide(result_bot);
        System.out.println("Result is " + result.toString());
    }

    public static void main(String[] args) {
//        EulerProject15 container = new EulerProject15(BigInteger.valueOf(20), BigInteger.valueOf(20));
        EulerProject15 container = new EulerProject15();
        container.calculate();
    }



}
