package Recursion;

public class SumOfDigit {
    static int[] sum(int num, int count)
    {
        
        if(num ==0)
        {
            //Array Return
            int arr[]= new int[2];
            return arr ;
        }
        
        int arr[] = sum(num/10, count+1);
        
        if(count%2==0)
        {
            arr[1] = arr[1] + num%10;
        }
        else{
            arr[0] = arr[0] + num%10;
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int arr[] = sum(12345,0);
        System.out.println("Even = "+arr[0]);
        System.out.println("Odd = "+arr[1]);
    }
}
