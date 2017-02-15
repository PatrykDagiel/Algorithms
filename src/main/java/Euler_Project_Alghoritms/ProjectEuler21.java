package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 15/02/2017.
 */
public class ProjectEuler21 {

    private int count = 0;

    ProjectEuler21(){

    }


    void calculate() {
        for (int i = 1; i < 10000; i++) {
            if (divisors(i) < 10000 && divisors(i) != i) {
                int x = divisors(i);
                if (divisors(x) == i) {
                    count += i;
                }
            }
        }
        System.out.println(count);
    }

    int divisors(int n) {
        int sum_even_divisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum_even_divisors += i;
            }
        }
        return sum_even_divisors;
    }


    public static void main(String[] args) {
        ProjectEuler21 container = new ProjectEuler21();
        container.calculate();
    }

}
