import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if((a & 1) == 1)
        {
            System.out.print(a+" is an odd number.");
        }
        else
        {
            System.out.println(a+" is an even number.");
        }
        sc.close();
    }
}
