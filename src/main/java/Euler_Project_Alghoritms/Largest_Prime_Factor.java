package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 06/02/2017.
 */
public class Largest_Prime_Factor {
    long size;

    Largest_Prime_Factor(long x) {
        size = x;
    }

    boolean is_Prime(int x){
        boolean answer = true;
        for(int dividing = 2; dividing < x; dividing++)
            if(x % dividing == 0) answer = false;
        return answer;
    }


    long lowest_dividing_prime(long x) {

        for (int position = 2; position < x; position++) {
            if ((is_Prime(position)) && ((x % position) == 0)) {
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
