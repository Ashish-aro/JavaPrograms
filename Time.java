import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes : ");
        int minute = sc.nextInt();
        int hour = minute/60;
        int rminutes = minute-(hour*60);
        System.out.println(hour+"hours and "+rminutes+" minutes");
        sc.close();
    }
}
