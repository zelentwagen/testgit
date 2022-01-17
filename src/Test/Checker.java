package Test;

import java.util.Arrays;

public class Checker {

    public static void chekShot(Ship[][] field, int[] coords) {


        if (field[coords[0]][coords[1]] == null) {
            System.out.println("Мимо");
            //return "Мимо";
        }
        else if (field[coords[0]][coords[1]] != null) {
            field[coords[0]][coords[1]].hurt(coords);
            if (field[coords[0]][coords[1]].parts < 1) {
                System.out.println("Потопил");
                //return "Потопил";
                field[coords[0]][coords[1]].isAlive = false;

            }
            else {
                System.out.println("Ранил");
                //return "Ранил";
            }
        }


    }


    public static boolean checkField(Ship[][] field) {
        boolean isNotEmpty = true;
        for (Ship[] cells : field) {
            for (Ship cell : cells) {
                isNotEmpty = cell == null || cell.isAlive;
            }
        }
        return isNotEmpty;
    }

}
