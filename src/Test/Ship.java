package Test;


import java.util.ArrayList;
import java.util.Arrays;

public class Ship {
    int size;
    int parts;
    boolean isAlive;
    boolean vertical;
    ArrayList<int[]> coords;

    public Ship(int size) {
        this.size = size;
        isAlive = true;
        parts = size;
        vertical = true;
        coords = new ArrayList<>(size);

    }

    public void hurt(int[] xy) {
        parts--;
        for (int i = 0; i < coords.size(); i++) {
            boolean b = Arrays.equals(xy, coords.get(i));
            if (b) {
                coords.remove(i);
            }
        }
    }

    public void setCoords(int x, int y) {
        int[] xy = {x, y};
        coords.add(xy);


    }

    public boolean checkCoords(int[] xy) {
        for (int[] coord : coords) {
            boolean b = Arrays.equals(xy, coord);
            if (b) {
                return true;
            }
        }
        return false;
    }
}



