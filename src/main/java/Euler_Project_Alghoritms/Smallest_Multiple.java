package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 07/02/2017.
 */
public class Smallest_Multiple {

    private int numbers_stack;


    public Smallest_Multiple(int x) {
        numbers_stack = x;
    }



    private void calculate() {
        for (long y = 1;  ; y++) {
            for (int i = 1; i <= numbers_stack; i++) {
                if (y % i == 0) {
                    if (i == numbers_stack) {
                        System.out.println("Odpowiedz to " + y);
                        System.exit(0);
                    }
                    continue;
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        Smallest_Multiple container = new Smallest_Multiple(20);
        container.calculate();
    }

}
