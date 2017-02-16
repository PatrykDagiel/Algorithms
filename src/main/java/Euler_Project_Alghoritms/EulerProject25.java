package Euler_Project_Alghoritms;

import java.math.BigInteger;

/**
 * Created by dagiel on 16/02/2017.
 */
public class EulerProject25 {
        void calculate() {
            BigInteger sum = new BigInteger("0");
            BigInteger previous = new BigInteger("1");
            BigInteger previous2 = new BigInteger("1");
            long index = 2;

            byte[] array = sum.toByteArray();

            while (array.length < 4000) {
                sum = new BigInteger("0");
                sum = sum.add(previous);
                sum = sum.add(previous2);
                index++;
                previous2 = new BigInteger("0").add(previous);
                previous = new BigInteger("0").add(sum);
                array = sum.toByteArray();
            }
            System.out.println("Indeks " + index);
        }

        public static void main(String[] args) {
            EulerProject25 container = new EulerProject25();
            container.calculate();
        }

}

