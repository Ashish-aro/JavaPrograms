public class nArmstrongNumber {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 1000;
        int i = 0;
        while(num!=0)
        {
            int temp = num;
            int count = 0;
            i = num;
            while(i!=0)
            {
                count = count +1;
                i = i / 10;
            }
            i=num;
            int result = 0;
            while(i!=0)
            {
                result = result + (int)Math.pow(i%10, count);
                i = i / 10;
                
            }
            if(result == temp)
                {
                    System.out.println(result);
                }
            count = 0;
            num = num - 1;
        }
    }
}
