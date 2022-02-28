package Test;

import java.util.Arrays;

public class Ai {


    public static int[] aiShot() {
        int x = (int) (1 + (Math.random() * 10));
        int y = (int) (1 + (Math.random() * 10));
        int[] coords = {x, y};
        while (checkRepeat(coords)){
           x = (int) (1 + (Math.random() * 10));
           y = (int) (1 + (Math.random() * 10));
        }
        GameHelper.aiHistory.add(coords);
        return coords;
    }

    public static void createAiShips(Ship[][] field) {

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                Ship ship = new Ship(i);
                if (((int) (Math.random() * 10)) % 2 == 0) {
                    ship.vertical = false;
                    int c = 1;
                    while (c > 0) {
                        try {
                            autoSpawnShip(field, ship);
                            //System.out.println();
                            c--;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            c = 1;
                        }
                    }
                } else {
                    ship.vertical = true;
                    int d = 1;
                    while (d > 0) {
                        try {
                            autoSpawnShip(field, ship);
                            //System.out.println();
                            d--;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            d = 1;
                        }
                    }
                }
            }

        }
    }

    public static void autoSpawnShip(Ship[][] field, Ship ship) {


        int numX = (int) (Math.random() * 12);
        int numY = (int) (Math.random() * 12);
        if (ship.vertical) {
            int c = 1;
            while(c > 0) {
                try {
                    for (int i = 0; i < ship.size; i++) {
                        if (field[numX][numY] == (null)
                                & field[numX - 1][numY] == (null)
                                & field[numX + 1][numY] == (null)
                                & field[numX][numY + 1] == (null)
                                & field[numX][numY - 1] == (null)) {
                            //System.out.println(numX + " " + numY + " свободно");
                            numX++;

                        } else {
                            //System.out.println(numX + " " + numY + " пробуем другую клетку");
                            i = -1;
                            numX = (int) (Math.random() * 12);
                            numY = (int) (Math.random() * 12);

                        }
                    }
                    for (int k = 0; k < ship.size; k++) {
                        field[--numX][numY] = ship;
                        field[numX][numY].setCoords(numX, numY);
                        //System.out.println(numX + " " + numY + " Ставлю корабль");

                    }
                    c--;
                } catch (ArrayIndexOutOfBoundsException e) {
                    //System.out.println(numX + " " + numY + " пробуем другую клетку");
                    c = 1;
                    numX = (int) (Math.random() * 12);
                    numY = (int) (Math.random() * 12);
                }
            }
        }
        else {
            int c = 1;
            while (c > 0) {
                try {
                    for (int i = 0; i < ship.size; i++) {
                        if (field[numX][numY] == (null)
                                & field[numX - 1][numY] == (null)
                                & field[numX + 1][numY] == (null)
                                & field[numX][numY + 1] == (null)
                                & field[numX][numY - 1] == (null)) {
                            //System.out.println(numX + " " + numY + " свободно");
                            numY++;
                        } else {
                            //System.out.println(numX + " " + numY + " пробуем другую клетку");
                            i = -1;
                            numX = (int) (Math.random() * 12);
                            numY = (int) (Math.random() * 12);

                        }
                    }
                    for (int k = 0; k < ship.size; k++) {
                        field[numX][--numY] = ship;
                        field[numX][numY].setCoords(numX, numY);
                        //System.out.println(numX + " " + numY + " Ставлю корабль");
                    }
                    c--;
                } catch (ArrayIndexOutOfBoundsException e) {
                    //System.out.println(numX + " " + numY + " пробуем другую клетку");
                    c = 1;
                    numX = (int) (Math.random() * 12);
                    numY = (int) (Math.random() * 12);
                }
            }
        }
    }

    public static boolean checkRepeat(int[] shot) {
        for (int[] coords : GameHelper.aiHistory) {
            if (Arrays.equals(coords, shot)){
                return true;
            }
        }
        return false;
    }


}


