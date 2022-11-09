import java.util.Scanner;

public class Carpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of room in feets : ");
        float length = sc.nextInt();
        System.out.print("Enter the width of the room in feets : ");
        float width = sc.nextInt();
        float area = length * width;
        float cost = 2.8f*area;
        int dcost = (int)cost;
        int ccost = (int)(100*(cost - dcost));
        System.out.println("The Cost of "+area+" square feets of Carpet is "+dcost+" $ and "+ccost+" cents");
        sc.close();

    }
}
