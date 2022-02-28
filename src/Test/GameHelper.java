package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class GameHelper {

    static Ship[][] playerField = new Ship[12][12];
    static Ship[][] enemyField = new Ship[12][12];
    static String[][] battleField = new String[12][12];


    public static List<int[]> aiHistory = new ArrayList<>();

    public static List<int[]> playerHistory = new ArrayList<>();

    public static void showField(Ship[][] field) {
        System.out.println("    1  2  3  4  5  6  7  8  9  10");
        for (int i = 1; i < field.length - 1; i++) {
            System.out.printf("%3s", i + " ");
            for (int j = 1; j < field.length - 1; j++) {
                int[] xy = {i, j};
                try {
                    if (!(field[i][j].checkCoords(xy))) {
                        System.out.printf("%3s", "[X]");
                    } else
                        System.out.printf("%3s", "[" + field[i][j].size + "]");
                } catch (NullPointerException e) {
                    System.out.printf("%3s", "[ ]");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void showBattleField(String[][] battleField, Ship[][] field) {
        System.out.println("    1  2  3  4  5  6  7  8  9  10");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%3s", i + " ");
            for (int j = 1; j < 11; j++) {
                int[] xy = {i, j};
                try {
                    if (battleField[i][j] == "0") {
                        System.out.printf("%3s", "[0]");
                    } else if (!(field[i][j].checkCoords(xy))) {
                        System.out.printf("%3s", "[X]");
                    } else {
                        System.out.printf("%3s", "[ ]");
                    }
                }catch (NullPointerException e){
                    System.out.printf("%3s", "[ ]");
                }

            }
            System.out.println();
        }
        System.out.println();
    }


}


























