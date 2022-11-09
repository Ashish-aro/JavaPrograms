import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Width = ");
        float a = in.nextFloat();
        System.out.print("Height = ");
        float b = in.nextFloat();
        float perimeter = 2*(a+b);
        float area = a*b;
        System.out.println("Perimeter of Rectangle = "+perimeter);
        System.out.println("Area of Rectangle = "+area);
        in.close();
    }
}
