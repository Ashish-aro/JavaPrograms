package Recursion.SingleBranch;

import java.util.HashMap;

public class FrequencyCountWithVoid {
    public static void hashmap(String str, HashMap<Character, Integer> map, int length)
    {
        if(length == 0)
        {
            System.out.println(map);
            return;
        }
        char singleCharacter = str.charAt(length);
        // if(singleCharacter == ' ')
        // {
        //     return ;
        // }
        if(map.get(singleCharacter) == null)
        {
            map.put(singleCharacter, 1);
        }
        else
        {
            int previousCount = map.get(singleCharacter);
            map.put(singleCharacter, previousCount+1);
        }
        hashmap(str, map, length-1);
        
    }
    public static void main(String[] args) {
        String str = "ram sharma";
        int length = str.length()-1;
        // str.cahrAt(0)
        // str.substring(0)
        HashMap<Character, Integer> map = new HashMap<>();
        hashmap(str, map,length);
        
    }
    
}
