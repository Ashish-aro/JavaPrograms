import java.util.Scanner;
 class VotingCandidateSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out .print("Enter a number : ");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible");
        }
        sc.close();
    }
}