
package 剑指Offer58II左旋转字符串;


public class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if(i<n){
                stringBuffer1.append(chars[i]);
            }else {
                stringBuffer2.append(chars[i]);
            }
        }
        return stringBuffer2.append(stringBuffer1).toString();

    }
}
