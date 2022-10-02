class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] ch = my_string.toCharArray();
        
        char temp = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = temp;
        
        return new String(ch);
    }
}
