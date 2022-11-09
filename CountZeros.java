import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int counter = 0;
        while(num!=0)
        {
            int c = num%10;
            num /= 10;
            if(c==0)
            {
                counter++;
            }
        }
        
        System.out.println("Counted Zeros : "+counter);
        sc.close();
    }
}
