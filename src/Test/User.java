package Test;

import java.util.Arrays;
import java.util.Scanner;

public class User {

    public static int[] shot() {
        Scanner scanner = new Scanner(System.in);
        int[] coords = new int[2];
        int c = 1;
        while (c > 0){
            System.out.println("введите x:");
            try {
                coords[0] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error");
            }
            System.out.println("введите y:");
            try {
                coords[1] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error");
            }
            if (checkRepeat(coords)) {
                c = 1;
                System.out.println("В эту точку уже стрелял");
            }
            else c = 0;
        }
        GameHelper.playerHistory.add(coords);
        return coords;

    }

    public static boolean checkRepeat(int[] shot) {
        for (int[] coords : GameHelper.playerHistory) {
            if (Arrays.equals(coords, shot)){
                return true;
            }
        }
        return false;
    }

}
