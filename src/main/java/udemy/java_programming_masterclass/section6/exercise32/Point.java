package udemy.java_programming_masterclass.section6.exercise32;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("Empty constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
//         d(A,B)=Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA))
        double distance = 0;
        return distance;
    }
}
