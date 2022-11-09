import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of room : ");
        float length = sc.nextInt();
        System.out.print("Enter the width of room :");
        float width = sc.nextInt();
        float area = length * width;
        System.out.println("The floor space of room is "+area+" square feet");
        sc.close();
    }
}
