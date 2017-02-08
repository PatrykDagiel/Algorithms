package Euler_Project_Alghoritms;

import java.math.BigInteger;

/**
 * Created by dagiel on 08/02/2017.
 */
public class Primes_Sum {

    public static void accumlatePrimeNum(int n){
        BigInteger sum = new BigInteger("2");
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                sum = sum.add(BigInteger.valueOf(i));

            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int n) {
        if ( n%2 == 0 ) return false;
        for(int i = 3; i*i <= n ; i += 2) {
            if( n%i == 0 )
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Primes_Sum container = new Primes_Sum();
        container.accumlatePrimeNum(2000000);
    }

}
