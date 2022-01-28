package 剑指Offer50第一个只出现一次的字符;

import java.util.HashMap;

public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.containsValue(c));
        }
        for (char c : s.toCharArray()) {
            if(!map.get(c)){
                return c;
            }
        }
        return ' ';

    }
}
