class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int ncount = onecount(Integer.toBinaryString(n));
        
        for(int i = n+1; ; i++){
            int check = onecount(Integer.toBinaryString(i));
            
            if(check == ncount){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    public int onecount(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
