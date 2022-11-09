public class GCD {
    public static void main(String[] args) {
        int n1 = 14;
        int n2 = 48;
        // while(n2%n1!=0)
        // {
        //     int c = n2%n1;
        //     n1 = n1%c;
            
        // }
        // ABOVE CODE IS ALSO CORRECT.
        while(n1%n2!=0)
        {
            if(n1>n2)
            {
                n1 -= n2;
            }
            else{
                n2 -= n1;
            }
        }
        System.out.println();
        System.out.println("GCD : "+n1);
    }
}
