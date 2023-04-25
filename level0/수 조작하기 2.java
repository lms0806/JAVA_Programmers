class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numLog.length - 1; i++){
            int a = numLog[i], b = numLog[i + 1];
            
            if(a < b){
                sb.append(b - a == 1 ? "w" : "d");
            }
            else{
                sb.append(a - b == 1 ? "s" : "a");
            }
        }
        return sb.toString();
    }
}
