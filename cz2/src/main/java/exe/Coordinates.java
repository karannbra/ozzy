package exe;

import java.util.Objects;

public class Coordinates {

    final private int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY () {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Coordinates)) return false;

        Coordinates coordinates = (Coordinates) obj;
        return this.getX() == coordinates.getX() && this.getY() ==coordinates.getY();


    } public static void main(String[] args) {
        Coordinates v1 = new Coordinates(1, 2);
        Coordinates v2 = new Coordinates(1, 2);
        Coordinates v3 = new Coordinates(4, 5);

        System.out.println(v1.equals(v2));
        System.out.println(v2.equals(v3));
        System.out.println(v2.equals(v1));
    }



}
