import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        axisSystem.clear();
        firstPoint();
        axisSystem.clear();
        secondPoint();
        axisSystem.clear();
        multiplyPoint();
        axisSystem.clear();
        userPoint();
        axisSystem.clear();
        randomUserPoints();
        axisSystem.clear();
        drawLine();
        axisSystem.clear();
        userDrawLine();
    }

    public static void firstPoint(){
        axisSystem.addSinglePoint(100, 150, "Black");
    }

    public static void secondPoint(){
        axisSystem.addSinglePoint(-200, 200, "Red");
    }

    public static void multiplyPoint(){
        axisSystem.addMultiplePoints(new int[]{50, 50, 60, 60, 70, 70}, "Green" );
    }

    public static void userPoint(){
        System.out.println("Enter color for the point: ");
        String color = scanner.next();
        System.out.println("Enter coordinate X: ");
        int x = scanner.nextInt();
        System.out.println("Enter coordinate Y: ");
        int y = scanner.nextInt();
        axisSystem.addSinglePoint(x, y, color);
    }

    public static void randomUserPoints(){
        Random random = new Random();
        System.out.println("Enter the amount of point you want to print: ");
        int pointsAmount = scanner.nextInt();
        System.out.println("Enter the color for those points: ");
        String color = scanner.next();
        int[] points = new int[pointsAmount *2];
        for(int i = 0; i<pointsAmount; i++){
            int x = random.nextInt(501) -250;
            points[i]=x;
            int y = random.nextInt(501) -250;
            points[i+1]=y;
        }
        axisSystem.addMultiplePoints(points, color);

    }

    public static void drawLine(){
        int[] points = new int[501*2];
        int index = 0;
        for (int x = -250; x <=250; x++){
            int y= 2*x +100;
            points[index++]=x;
            points[index++]=y;
        }
        axisSystem.addMultiplePoints(points, "Black");
    }


    public static void userDrawLine(){
        int[] points = new int[501*2];
        int index = 0;
        System.out.println("Enter the value of m for the straight line y=mx+n: " );
        int m = scanner.nextInt();
        System.out.println("Enter the value of n for the straight line y=mx+n: " );
        int n = scanner.nextInt();
        for (int x = -250; x <=250; x++){
            int y= m*x + n;
            points[index++]=x;
            points[index++]=y;
        }
        axisSystem.addMultiplePoints(points, "Black");
    }






    public static final Scanner scanner = new Scanner(System.in);
    public static final AxisSystem axisSystem = new AxisSystem();
}
