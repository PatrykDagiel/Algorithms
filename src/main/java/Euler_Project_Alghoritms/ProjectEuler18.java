package Euler_Project_Alghoritms;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by dagiel on 10/02/2017.
 */
public class ProjectEuler18 {
    public static void main(String[] args) throws Exception {
        int[][] array = Files.lines(Paths.get("C:\\Users\\dagiel\\Documents\\GithubPrywatny\\Algorithms\\src\\rsc\\triangle.txt"))
                .map((l) -> l.trim().split("\\s+"))
                .map((sa) -> Stream.of(sa).mapToInt(Integer::parseInt).toArray())
                .toArray(int[][]::new);

        for (int x = array.length - 1; x > 0; x--)
            for (int c = 0; c < array[x].length -1; c++)
                array[x-1][c] += Math.max(array[x][c], array[x][c+1]);

        System.out.println(array[0][0]);
}
}
