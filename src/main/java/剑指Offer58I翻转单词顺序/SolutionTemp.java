package 剑指Offer58I翻转单词顺序;

public class SolutionTemp {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int j = s.length()-1,i = j;
        while (i >= 0){
            //从右向左寻找第一个不为空的
            while (i >=0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i+1,j+1) + " ");
            while (i>=0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();
    }
}
