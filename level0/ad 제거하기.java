class Solution {
    public String[] solution(String[] strArr) {
        int size = 0;
        for(String s : strArr){
            if(!s.contains("ad")){
                size++;
            }
        }
        
        int idx = 0;
        String[] answer = new String[size];
        for(String s : strArr){
            if(!s.contains("ad")){
                answer[idx++] = s;
            }
        }
        return answer;
    }
}
