import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int i = 0, j = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        while(j != B.length){
            if(A[i] < B[j]){
                answer++;
                i++;
            }
            j++;
        }
        return answer;
    }
}
