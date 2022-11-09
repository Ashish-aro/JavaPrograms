package Recursion;

public class SumOfDigitWithVoid {
    static void sum(int num,int count,int even,int odd)
    {
        //Brakes or Terminate Case
        if(num == 0)
        {
            System.out.println("Even = " + even);
            System.out.println("Odd = "+odd);
            return;
        }
        if(count%2==0)
        {
            even = even + num%10;
        }
        else{
            odd = odd + num%10;
        }
        //Small Problem and Recursion(Cycle) and Process Logic
        sum(num/10, count+1,even,odd);
    }
    public static void main(String[] args) {
        
        int even = 0, odd = 0;
        sum(12345, 1, even, odd);

    }
}
