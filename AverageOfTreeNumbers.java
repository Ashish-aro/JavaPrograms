import java.util.Scanner;

public class AverageOfTreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int a = in.nextInt();
        System.out.print("Input Second Number : ");
        int b = in.nextInt();
        System.out.print("Input Second Number : ");
        int c = in.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average = "+avg);
        in.close();
    }
}
