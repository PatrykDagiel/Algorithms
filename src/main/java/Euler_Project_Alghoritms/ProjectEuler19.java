package Euler_Project_Alghoritms;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.YEAR;

/**
 * Created by dagiel on 14/02/2017.
 */
public class ProjectEuler19 {

    private static int days = 0;
    private static int[] days_array;
    private static int count = 0;
    private static int[] window1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] window2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static void calculate(int start, int end) {
        int a = start;
        int b = end;
        while (start <= end) {
            add_days(start);
            start += 1;
        }
        days_array = new int[days+1];
        for (int i = 0; i < days_array.length; i++) {
            if (i % 7 == 5) days_array[i] = 1;
            else days_array[i] = 0;
        }

        frog_jump(a, b, days_array);

        System.out.println("Tyle: " + count);
    }

    static void frog_jump(int a, int b, int[] c) {
        int position = 0;
        for (int o = 0; o <= 99; o++) {     // Century, 100 years
            if ((a % 4 == 0) && (a % 400 != 0)) {
                for (int i : window2) {
                    if (days_array[position] == 1) count += 1;
                    position += i;
                }
                a += 1;
            } else {
                for (int i : window1) {
                    if (days_array[position] == 1) count += 1;
                    position += i;
                }
                a += 1;
            }
        }
    }


    static void add_days(int x) {
        if ((x % 4 == 0) && (x % 400 != 0)) {
            days += 366;
        } else {
            days += 365;
        }
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        calculate(1901, 2000);
        long difference = System.nanoTime() - startTime;
        System.out.println("Total execution time [ms]: " + difference/1000000);
    }

}

