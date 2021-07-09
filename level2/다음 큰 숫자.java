class Solution {
    public int solution(int n) {
        int ncount = onecount(Integer.toBinaryString(n));
        
        for(int i = n+1; i < 1000000; i++){
            if(onecount(Integer.toBinaryString(i)) == ncount){
                return i;
            }
        }
        
        return 0;
    }
    
    public int onecount(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }
        return count;
    }
}
