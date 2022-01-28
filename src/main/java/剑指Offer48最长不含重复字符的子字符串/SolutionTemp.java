package 剑指Offer48最长不含重复字符的子字符串;

import java.util.HashMap;

public class SolutionTemp {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1,res = 0;
        for (int j = 0; j < s.length(); j++) {
            if(map.get(s.charAt(j)) != null){
                //找到重复数字前面位置并且更新为大者
                i = Math.max(i, map.get(s.charAt(j)));
            }
            map.put(s.charAt(j),j);
            res = Math.max(res,j-i);
        }
        return res;
    }

    public int lengthOfLongestSubstring2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        //记录前一个字符结尾的最大不重复子串长度
        int tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            int i = map.getOrDefault(s.charAt(j), -1);
            map.put(s.charAt(j), j);
            //j-i标识以当前字符结尾的不重复最大子串长度
            tmp = tmp < j - i ? tmp+1 :j-i;
            res = Math.max(res,tmp);
        }
        return res;
    }
}
