class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        if(m == 1){
            return section.length;
        }
        
        int num = section[0];
        for(int i = 1; i < section.length; i++){
            if(num + m <= section[i]){
                answer++;
                num = section[i];
            }
        }
        return answer + 1;
    }
}
