package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 08/02/2017.
 */
public class Special_Pyth_Triplet {
    private int a;
    private int b;
    private int c;
    private Integer value;

    private boolean sum(){
        Integer answer = new Integer(a + b + c);
        if (answer.equals(value)) return true;
        else return false;
    }

    private boolean sqrt(){
        Double left_side = Math.pow(a,2) + Math.pow(b,2);
        Double right_side = Math.pow(c,2);
        if (left_side.equals(right_side)) return true;
        else return false;
    }

    private void calculate() {
            for (c = 3 ; c <= value - c; c++)
                for (b = 2 ; b < c ; b++)
                    for (a = 1; a < b ; a++ ) {
                        if (sum() && sqrt()) {
                            System.out.println("Answer is " + a + " x " + b + " x " + c);
                            System.exit(0);
                        }
                    }

    }


    Special_Pyth_Triplet(int x) {
       value = x;
    }

    public static void main(String[] args) {
        Special_Pyth_Triplet container = new Special_Pyth_Triplet(1000);
        container.calculate();
    }
}
