package Euler_Project_Alghoritms;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by dagiel on 16/02/2017.
 */
public class EulerProject25 {
        void calculate() {
            ArrayList<BigInteger> lista = new ArrayList<BigInteger>();
            boolean limitreached = true;
            int indeks = 2;
            BigInteger nextnum = null;
            lista.add(BigInteger.valueOf(1));
            lista.add(BigInteger.valueOf(1));
            while (limitreached == true) {
                nextnum = lista.get(indeks-1).add(lista.get(indeks-2));
                lista.add(nextnum);
                indeks++;
                if(nextnum.toString().length() >= 1000) {       // jako String!
                    limitreached = false;
                }
            }
            Long stop = System.nanoTime();
            System.out.println("1,000 digits: " + lista.size());

        }

        public static void main(String[] args) {
            EulerProject25 container = new EulerProject25();
            container.calculate();
        }

}

