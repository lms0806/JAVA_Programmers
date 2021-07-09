class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == (reserve[j]-1)){
                    lost[i] = -1;
                    reserve[j] = -1;
                }
                if(lost[i] == (reserve[j]+1)){
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i++){
            if(lost[i] != -1){
                count++;
            }
        }
        
        return n - count;
    }
}
