package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 07/02/2017.
 */
public class Prime_10001th {
    long size;

    Prime_10001th(long x)
    {
        size = x;
    }

    static boolean isPrime(int n) {
        if (n%2==0) return false;
        for(int i = 3; i*i <= n ; i += 2) {
            if(n%i==0)
                return false;
        }
        return true;
    }


    private void calculate() {
        for (long i = 3;  ; i += 2) {
            if(isPrime((int)i)) {
                size--;
                if(size == 0) {
                    System.out.print("Prime number seeked is " + i);
                    System.exit(0);
                }
            } else continue;
        }
    }


    public static void main(String[] args) {
        Prime_10001th container = new Prime_10001th(10001);
        container.calculate();
    }
}
