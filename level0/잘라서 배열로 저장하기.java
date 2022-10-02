class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() / n + (my_str.length() % n == 0 ? 0 : 1)];
        
        int idx = 0;
        while(true){
            if(my_str.equals("")){
                break;
            }
            
            if(my_str.length() > n){
                answer[idx] = my_str.substring(0, n);
                my_str = my_str.substring(n);
            }
            else{
                answer[idx] = my_str;
                my_str = "";
            }
            
            idx++;
        }
        return answer;
    }
}
