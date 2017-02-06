package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 06/02/2017.
 */
public class Multiples_3_5_Sum {
    private int range;
    private int sum = 0;

    Multiples_3_5_Sum(int x) {
        range = x;
    }

    void add_multiples() {
        for (int i = 0; i < range; i++) {
            if (i % 3 == 0) sum += i;
            if (i % 5 == 0) sum += i;
            if (i % 3 == 0 && i % 5 == 0) sum -= i;
        }
    }


    void printIt() {
        System.out.println("Sum equals to " + sum);
    }

    public static void main(String[] args) {
        Multiples_3_5_Sum container = new Multiples_3_5_Sum(1000);
        container.add_multiples();
        container.printIt();
    }

}
