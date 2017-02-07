package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 07/02/2017.
 */
public class Sum_Square_Difference {

    private long memory_2;
    private long memory;
    private int size;

    Sum_Square_Difference(int s) {
        size = s;
    }

    private void calculate_sum_of_squares() {
        for (int i = 0; i <= size; i++) {
            memory += Math.pow(i, 2);
        }
    }

    private void calculate_square_of_sum() {
        int memory_temp = 0;
        for (int i = 1; i <= size; i++) {
            memory_temp += i;
        }
        memory_2 = (long)Math.pow(memory_temp, 2);
    }

    private void calculate_difference() {
        calculate_sum_of_squares();
        calculate_square_of_sum();
        System.out.println("Difference is " + (memory_2 - memory));
    }


    public static void main(String[] args) {
        Sum_Square_Difference container = new Sum_Square_Difference(100);
        container.calculate_difference();
    }

}
