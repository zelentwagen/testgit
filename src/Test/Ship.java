package Test;


import java.util.ArrayList;
import java.util.Arrays;

public class Ship {
    int size;
    int parts;
    boolean isAlive;
    boolean vertical;
    ArrayList<int[]> coords;

    public Ship(int size){
        this.size = size;
        isAlive = true;
        parts = size;
        vertical = true;
        coords = new ArrayList<>(size);

    }

    public void hurt(int[] xy){
        parts--;
        coords.remove(xy);
    }

    public void setCoords(int x, int y){
        int[] xy = {x, y};
        coords.add(xy);

    }

}


