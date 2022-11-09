public class Reverse {
    public static void main(String[] args) {
        int n = 123;
        //int m = n;
        int r=0;
        while(n!=0)
        {
            int a = n % 10;
            r = r*10+a;
            n/=10;
        }
        System.out.println(r);
    }
}
