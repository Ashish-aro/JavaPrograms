

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String str = "ram sharma";
        // str.cahrAt(0)
        // str.substring(0)
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            char singleCharacter = str.charAt(i);
            if(singleCharacter == ' ')
            {
                continue;
            }
            if(map.get(singleCharacter)==null)
            {
                map.put(singleCharacter, 1);
            }
            else{
                int previousCount = map.get(singleCharacter);
                map.put(singleCharacter, previousCount+1);
            }
        }
        System.out.println(map);
    }
}
