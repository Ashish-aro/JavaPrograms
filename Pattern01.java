package Recursion.SingleBranch;

public class Pattern01 {
    static void star(int num)
    {
        if(num==0)
        {
            System.out.println();
            return;
        }
        System.out.print("*");
        star(num-1);
    }
    static void pattern(int i, int j)
    {
        if(i==0)
        {
            return;
        }
        star(j);
        pattern(i-1, j+1);
    }
    
    public static void main(String[] args) {
        pattern(5,1);
    }
}
