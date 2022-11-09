import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int counter = 0;
        while(num!=0)
        {
            num = num/10;
            counter++;
        }
        System.out.println("Counted Digits : "+counter);
        sc.close();
    }
}
