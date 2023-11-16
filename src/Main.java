import com.workintech.S1D4.Point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        point1.setX(9);
        point1.setY(2);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        System.out.println(point1.distance());
        Point point2 = new Point(4, 7);
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(4, 7));
    }
}