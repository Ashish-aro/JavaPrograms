package Recursion.SingleBranch;

public class Pattern03 {
    static void star(int num)
        {
            if(num==0)
            {
                return;
            }
            System.out.println("*");
            star(num);
        }
        static void pattern(int num)
        {
            if(num==0)
            {

            }
            star(2*(5-num));
            System.out.println();
            pattern(num);
        }
    public static void main(String[] args) {
        pattern(5);
    }
}
