class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] ch = A.toCharArray();
        
        int count = 0;
        while(true){
            if(new String(ch).equals(B)){
                return count;
            }
            
            char temp = ch[ch.length - 1];
            for(int i = ch.length - 1; i > 0; i--){
                ch[i] = ch[i - 1];
            }
            ch[0] = temp;
            
            if(new String(ch).equals(A)){
                break;
            }
            count++;
        }
        return -1;
    }
}
