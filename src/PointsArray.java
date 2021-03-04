import java.util.Scanner;

public class PointsArray {

    public static void main(String[] args) {

        int [] points = new int[5];

        // points[0] = 7;
        // points[1] = 10;
        // points[2] = 12;
        // points[3] = 19;
        // points[4] = 26;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<points.length; i++){
            points[i] = in.nextInt();
        }

        for(int i=0; i<points.length; i++){
            System.out.println(points[i]);
        }

        for(int i=0; i<5; i++){
            System.out.println(points[i]);
        }

        System.out.println(points[0]);
        System.out.println(points[1]);
        System.out.println(points[2]);
        System.out.println(points[3]);
        System.out.println(points[4]);
    }
}
