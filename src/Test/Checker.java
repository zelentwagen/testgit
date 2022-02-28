package Test;

import java.util.Arrays;

public class Checker {

    public static void chekShot(Ship[][] field, int[] coords) {


        if (field[coords[0]][coords[1]] == null) {
            System.out.println(Arrays.toString(coords) + " Мимо");
            //return "Мимо";
        }
        else if (field[coords[0]][coords[1]] != null) {
            field[coords[0]][coords[1]].hurt(coords);
            if (field[coords[0]][coords[1]].parts < 1) {
                System.out.println(Arrays.toString(coords) + " Потопил");
                //return "Потопил";
                field[coords[0]][coords[1]].isAlive = false;

            }
            else {
                System.out.println(Arrays.toString(coords) + " Ранил");
                //return "Ранил";
            }
        }


    }


    public static boolean checkField(Ship[][] field1, Ship [][]field2) {
        boolean field1IsNotEmpty = true;
        boolean field2IsNotEmpty = true;
        boolean isNotEmpty = true;
        for (Ship[] cells : field1) {
            for (Ship cell : cells) {
                field1IsNotEmpty = cell == null || cell.isAlive;
            }
        }
        for (Ship[] cells : field2) {
            for (Ship cell : cells) {
                field2IsNotEmpty = cell == null || cell.isAlive;
            }
        }
        return isNotEmpty = field1IsNotEmpty && field2IsNotEmpty;
    }

}
