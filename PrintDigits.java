package Recursion;

public class PrintDigits {
    static void printdigits(int num)
    {
        //Brake or Termination Case
        if(num ==0)
        {
            return;
        }
        //Small Problem and Cyclic (Recursion)
        printdigits(num/10);
        //Processing logic
        System.out.println(num%10);
    }
    public static void main(String[] args) {
        printdigits(12345);
    }
}
