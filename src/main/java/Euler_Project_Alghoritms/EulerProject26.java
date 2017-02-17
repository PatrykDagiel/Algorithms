package Euler_Project_Alghoritms;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by dagiel on 17/02/2017.
 */
public class EulerProject26 {

    EulerProject26() {}

    static boolean isPrime(BigDecimal n) {
        if ( n.longValue() % 2 == 0 ) return false;
        for(int i = 3; i*i <= n.longValue() ; i += 2) {
            if( n.longValue()%i == 0 )
                return false;
        }
        return true;
    }

    static boolean isPrime(double n) {
        if ( n % 2 == 0 ) return false;
        for(int i = 3; i*i <= n ; i += 2) {
            if( n % i == 0 )
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        ArrayList<BigDecimal> lista = new ArrayList<BigDecimal>();
        BigDecimal addition = new BigDecimal(1);
        for (int i = 1; i <= 1000; i++){
                lista.add(i);
            }
        System.out.println(String.format(lista.toString()));
        System.out.println(lista.size());
    }

}
