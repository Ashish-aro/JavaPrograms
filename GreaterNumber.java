import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
       //Greatest of Two Numbers.

         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greatest.");
            }
            else
            {
                System.out.println(c+" is greatest.");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greatest.");
            }
            else
            {
                System.out.println(c+" is greatest.");
            }
        }
        sc.close();
    }
}
