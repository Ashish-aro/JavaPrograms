package Recursion;

public class PrintDigitsWithoutVoid {
    static int printdigits(int num)
    {
        //Brake or Termination Case
        if(num ==0)
        {
            return 0;
        }
        //Small Problem and Cyclic (Recursion)
        printdigits(num/10);
        //Processing Logic
        System.out.println(num%10);
        return 0;
    }
    public static void main(String[] args) {
        printdigits(12345);
    }
}
