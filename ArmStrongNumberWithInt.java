package Recursion;

public class ArmStrongNumberWithInt {
    static int powerfunction(int num) //Counting the power which is going to apply for ArmStrong Number
    {
        if(num == 0)
        {  // System.out.println(count);
            return 0;
        }
        //Small Problem and Cycle(Recursion) and Processing
        return powerfunction(num/10)+1;
    }
    static int armstrong(int num, int asnum, int c )
    {
        if(num==0)
        { 
            return asnum ;
        }
        
        asnum = asnum+(int)(Math.pow(num %10, c));
        //Small Problem and Cycle(Recursion)
        return armstrong(num/10, asnum,c);

    }
    public static void main(String[] args) {
        int num = 1634;
        int temp = num;
        int c = powerfunction(num);
        int num2 = armstrong(num, 0, c);
        System.out.println(num2);
        if(temp == num2)
            {
                System.out.println("ArmStrong Number");
            }
            else{
                System.out.println("Not an Armstrong Number");
            } 
    }
}
