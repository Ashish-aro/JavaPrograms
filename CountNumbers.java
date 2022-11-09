package Recursion;

public class CountNumbers {

    static void count(int num, int c)
    {
        //Brake or Termination Case
        if(num == 0)
        {
            System.out.println(c);
            return;
        }
        //Small Problem or Recursion(Cycle)
        count(num/10,c+1);
    }

    static int countdigit(int num)
    {
        if(num == 0)
        {
            return 0;
        }

        return countdigit(num/10)+1;
    }

    public static void main(String[] args) {
        count(1245, 0);
        
        System.out.println(countdigit(12345));
    }
}
