package Euler_Project_Alghoritms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dagiel on 15/02/2017.
 */
public class EulerProject22 {
    static List<String> list = null;
    static List<String> list_2 = null;
    static long sum = 0;

    static void read_it(){
        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\dagiel\\Documents\\GithubPrywatny\\Algorithms\\src\\rsc\\names.txt"))) {
        list = lines.collect(Collectors.toList());
        } catch (IOException e) {

        }
        List<String> list2 = new ArrayList<String>(Arrays.asList(list.toString()
                .replace("\",\"", " ")
                .replace("\"", "")
                .replace("[", "")
                .replace("]", "")
                .split(" ")));

        Collections.sort(list2);

    System.out.println(list);
    System.out.println(list2);


        int position = 0;
        for (String s : list2) {
            ++position;
            for (int i = 0; i < s.length(); i++) {
                sum += ((int) s.charAt(i) - 64) * position;
            }
        }

        System.out.println("Suma wynosi " + sum);
    }


    public static void main(String[] args) {
        read_it();
    }




}
