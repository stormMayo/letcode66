package 剑指Offer05替换空格;
public class solution {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        char[] result = new char[3 * s.length()];
        int index = 0 ;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                result[index++] = '%';
                result[index++] = '2';
                result[index++] = '0';
                index = index + 3;
            }else {
                result[index] = chars[i];
                index++;
            }
        }
        String s1 = new String(result, 0, index);
        return s1;
    }

    public String replaceSpace1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
