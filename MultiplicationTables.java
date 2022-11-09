import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int x = sc.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(x+" X "+i+" = "+(x*i));
        }
        sc.close();

    }
}
