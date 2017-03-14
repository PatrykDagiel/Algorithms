package Euler_Project_Alghoritms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by dagiel on 17/02/2017.
 */
public class EulerProject26 {

    EulerProject26() {}

    public String calculate() {
        int longest = 0;
        int highest_length = 0;
        for (int i = 1; i <= 1000; i++) {
            int len = getRecLength(i);
            if(len > highest_length) {
                longest = i;
                highest_length = len;
            }
        }
        return Integer.toString(longest);
    }

    private int getRecLength(int i) {
        Map<Integer, Integer> digits = new HashMap<Integer, Integer>();
        int state = 1;
        int iterator = 0;
        while(!digits.containsKey(state)) {
            digits.put(state, iterator);
            state = state * 10 % i;
            iterator++;
        }
        return iterator - digits.get(state);
    }


    public static void main(String[] args) {
        EulerProject26 container = new EulerProject26();
        System.out.print(container.calculate());
    }

}
