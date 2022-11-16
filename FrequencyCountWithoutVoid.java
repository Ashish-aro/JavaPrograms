package Recursion.SingleBranch;

import java.util.HashMap;

public class FrequencyCountWithoutVoid {
    public static HashMap<Character,Integer> getCount(String str, int length,  int i)
    {
        if(i == length)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character,Integer> map = getCount(str, length, i+1);
        char singleCharacter = str.charAt(i);
            if(map.get(singleCharacter)==null)
            {
                map.put(singleCharacter, 1);
            }
            else{
                int previousCount = map.get(singleCharacter);
                map.put(singleCharacter, previousCount+1);
            }
            return map;
    }
    public static void main(String[] args) {
        String str = "ram sharma";
        int length = str.length() -1;
        System.out.println(getCount(str, length, 0));
    }
}
