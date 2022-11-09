package Recursion;

public class ArmStrongNumberWithVoid {
    static int powerfunction(int num)
    {
        if(num == 0)
        {  // System.out.println(count);
            return 0;
        }
        
        return powerfunction(num/10)+1;
    }
    static void armstrong(int num, int count, int asnum, int temp, int c )
    {
        if(num==0)
        { 
            if(temp == asnum)
            {
                System.out.println("ArmStrong Number");
            }
            else{
                System.out.println("Not an Armstrong Number");
            }      
            return ;
        }
        
        asnum = asnum+(int)(Math.pow(num %10, c));
        //Small Problem and Cycle(Recursion)
        armstrong(num/10, count+1, asnum,temp,c);
        return;

    }
    public static void main(String[] args) {
        int num = 370;
        int temp = num;
        int c = powerfunction(num);
        armstrong(num, 1, 0, temp, c);
    }
}
