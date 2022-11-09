import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius : ");
        float radius = in.nextFloat();
        float area = 3.14f*radius*radius;
        float perimeter = 2*3.14f*radius;
        System.out.println("Area of Circle = "+area);
        System.out.println("Perimeter of Circle = "+ perimeter);
        in.close();
    }
}
