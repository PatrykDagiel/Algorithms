package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 09/02/2017.
 */
public class ProjectEuler14 {

    private static long memory;
    private static int numbermax = 0;

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        for (int i = 2; i <= 1000000; i++) {
            long counter = 0;
            long result = i;
            while (result != 1) {
                if (result % 2 == 0)
                    result = result / 2;
                else
                    result = (3 * result + 1);
                counter++;
                if (counter > memory) {
                    memory = counter;
                    numbermax = i;
                }
            }
        }
        System.out.print(numbermax);
    }
}
