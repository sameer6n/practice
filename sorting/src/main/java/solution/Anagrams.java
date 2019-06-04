package solution;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    /*
     *assuming both s1 and s2 are not null
     *
     */

    public Boolean isAnagram(String s1, String s2) {



        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }
        }

        for (Character c : s2.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    map.remove(c);
                } else {
                    map.put(c, map.get(c) - 1);
                }


            } else {
                return false;
            }
        }
        return map.isEmpty();

    }
}
