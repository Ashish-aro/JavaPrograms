package Recursion.SingleBranch;

public class ReplaceAllPiValues {
    public static String replaceallpi(String str, int i)
    {
        if(i == str.length())
        {
            return "";
        }
        if(str.charAt(i) =='p' && str.charAt(i+1) == 'i')
        {
            return "3.14"+ replaceallpi(str, i+2);
        }
        else
        {
            return str.charAt(i) + replaceallpi(str, i+1);
        }

    }
    public static void main(String[] args) {
        String str = "1+pi*4-pi*6";
        str = replaceallpi(str, 0);
        System.out.println(str);
    }
}
