package Euler_Project_Alghoritms;

/**
 * Created by dagiel on 10/02/2017.
 */
public class ProjectEuler17 {
    long result = 0;
    long prev_result = 0;


    void calculate(int i) {
        int range = i;
        StringBuilder number_storage = new StringBuilder();
        for (int w = 1; w <= range; w++) {
            number_storage.delete(0, number_storage.length());
            number_storage.append(w);
            String lookup = number_storage.toString();
            prev_result = result;
            if (lookup.length() == 3 && !lookup.equals("100") && !lookup.equals("200")&& !lookup.equals("300")&& !lookup.equals("400")&& !lookup.equals("500")&& !lookup.equals("600")&& !lookup.equals("700")&& !lookup.equals("800") && !lookup.equals("900") ) result += 3;       // add and
            if (lookup.length() == 4 && !lookup.equals("1000")) result += 3;
//            for (int y = 1; y <= lookup.length(); y++) {
                if (lookup.length() > 4) break;
                else if (lookup.length() == 4) {
                    result += to_word_thousands_and_hundreds((int) lookup.charAt(0) - '0') + 8;
                    if (((int) lookup.charAt(1) - '0') != 0) {
                        result += to_word_thousands_and_hundreds((int) lookup.charAt(1) - '0') + 7;
                    }
                    if (((int) lookup.charAt(2) - '0') > 1) {
                        result += to_word_double_digit((int) lookup.charAt(2) - '0');
                    } else if (((int) lookup.charAt(2) - '0') == 1) {
                        result += add_teens((int) lookup.charAt(3) - '0');
                    } else if (((int) lookup.charAt(3) - '0') != 0) {
                        result += add_last_digit((int) lookup.charAt(3) - '0');
                    }
                } else if (lookup.length() == 3) {
                    result += to_word_thousands_and_hundreds((int) lookup.charAt(0) - '0') + 7;

                    if (((int) lookup.charAt(1) - '0') > 1) {
                        result += to_word_double_digit((int) lookup.charAt(1) - '0');
                    } else if (((int) lookup.charAt(1) - '0') == 1) {
                        result += add_teens((int) lookup.charAt(2) - '0');
                        System.out.println("For " + w  + " total length is " + result + "  and difference is " + (result - prev_result));
                        continue;
                    }
                        if (((int) lookup.charAt(2) - '0') != 0) {
                            result += add_last_digit((int) lookup.charAt(2) - '0');
                        }

                } else if (lookup.length() == 2) {
                    if (((int) lookup.charAt(0) - '0') > 1) {
                        result += to_word_double_digit((int) lookup.charAt(0) - '0');
                        result += add_last_digit((int) lookup.charAt(1) - '0');
                    } else if (((int) lookup.charAt(0) - '0') == 1) {
                        result += add_teens((int) lookup.charAt(1) - '0');
                    } else if (((int) lookup.charAt(1) - '0') != 0) {
                        result += add_last_digit((int) lookup.charAt(1) - '0');
                    }

                } else if (lookup.length() == 1) {
                    result += add_last_digit((int) lookup.charAt(0) - '0');
                }

                System.out.println("For " + w  + " total length is " + result + "  and difference is " + (result - prev_result));
            }

//        }
    }


    private int add_last_digit(int i) {
        switch(i) {
            case 1: return 3;   //one
            case 2: return 3;   //two
            case 3: return 5;   //three
            case 4: return 4;   //four
            case 5: return 4;   //five
            case 6: return 3;   //six
            case 7: return 5;   //seven
            case 8: return 5;   //eight
            case 9: return 4;   //nine
            default: return 0;
        }
    }

    private int add_teens(int i) {
        switch(i) {
            case 0: return 3; //ten
            case 1: return 6;   //eleven
            case 2: return 6;   //twelve
            case 3: return 8;   //thirteen
            case 4: return 8;   //fourteen
            case 5: return 7;   //fifteen
            case 6: return 7;   //sixteen
            case 7: return 9;   //seventeen
            case 8: return 8;   //eighteen
            case 9: return 8;   //nineteen
            default: return 0;
        }
    }

    private int to_word_double_digit(int i) {
        switch(i) {
            case 2: return 6; //twenty
            case 3: return 6; //thirty
            case 4: return 5; //forty
            case 5: return 5; //fifty
            case 6: return 5; //sixty
            case 7: return 7; //seventy
            case 8: return 6; //eighty
            case 9: return 6; //ninety
            default: return 0;
        }

    }

    private int to_word_thousands_and_hundreds(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 5;
            case 8:
                return 5;
            case 9:
                return 4;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        ProjectEuler17 container = new ProjectEuler17();
        container.calculate(1000);
    }

}

