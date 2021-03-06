package udemy.java_programming_masterclass.section6.exercise32;

public class Point {
    private int x;
    private int y;

    //  Empty constructor
    public Point() {
//        this(0, 0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
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

    // distance of point from center
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    // lub:
//            return distance(0,0);


    // distance between two points
    public double distance(int x, int y) {
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    // distance between points
    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}
