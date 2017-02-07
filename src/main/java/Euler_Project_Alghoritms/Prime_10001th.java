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

    boolean is_Prime(int x){
        boolean answer = true;
        for(int dividing = 2; dividing < x; dividing++)
            if(x % dividing == 0) {
                answer = false;
                break;
        }
        return answer;
    }

    private void calculate() {
        for (long i = 2;  ; i++) {
            if(is_Prime((int)i)) {
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
