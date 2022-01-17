package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GameHelper {

    public static List<int[]> aiHistory = new ArrayList<>();

    public static List<int[]> playerHistory = new ArrayList<>();


    public static void showField(Ship[][] field){
        System.out.println("    1  2  3  4  5  6  7  8  9  10");
        for (int i = 1; i < field.length - 1; i++) {
            System.out.printf("%3s", i + " ");
            for (int j = 1; j < field.length - 1; j++) {
                int[] xy = {i, j};
                try {
                    if (field[i][j].isAlive) {
                        System.out.printf("%3s", "[" + field[i][j].size + "]");
                    } else
                        System.out.printf("%3s", "[X]");
                }
                catch (NullPointerException e ){
                    System.out.printf("%3s", "[ ]");
                }
            }
            System.out.println();
        }
        for (int[] coords:playerHistory) {
            for (int coord : coords) {
                System.out.print(coord + " ");
            }
            System.out.println();
        }

    }

}
