class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for(char ch : s.toLowerCase().toCharArray()){
            if(ch == 'p'){
                count++;
            }
            else if(ch == 'y'){
                count--;
            }
        }
        
        return count == 0 ? true : false;
    }
}
