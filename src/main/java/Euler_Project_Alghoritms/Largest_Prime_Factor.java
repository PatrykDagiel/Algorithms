package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 06/02/2017.
 */
public class Largest_Prime_Factor {
    long size;

    Largest_Prime_Factor(long x) {
        size = x;
    }

    static boolean isPrime(int n) {
        if ( n%2 == 0 ) return false;
        for(int i = 3; i*i <= n ; i += 2) {
            if( n%i == 0 )
                return false;
        }
        return true;
    }



    long lowest_dividing_prime(long x) {

        for (int position = 2; position < x; position++) {
            if ((isPrime(position)) && ((x % position) == 0)) {
                    return position;
            } else continue;
        } return x;
    }

    void calculate() {
        long result = size;
        while (result != 1) {
            long factor = lowest_dividing_prime(result);
            result /= factor;
            System.out.println("Factor is :" + factor);
        }
    }

    public static void main(String[] args){
//        Long l = new Long("600851475143");
        Long l = new Long("600851475143");
        Largest_Prime_Factor container = new Largest_Prime_Factor(l);
        container.calculate();
    }
}
