import java.util.Scanner;

public class Fees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of credit hours : ");
        int chour = sc.nextInt();
        int tchour = chour * 85;
        System.out.print("Enter the charges of Books : ");
        int books = sc.nextInt();
        int afees = 65;
        int total= tchour+books+afees;
        System.out.println("Total Fees : Credit Hour + Book Money + Atheletic Hour");
        System.out.println("Total Fees : "+total);
        sc.close();
    }
}
