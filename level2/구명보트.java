import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int i = 0;
        int j = people.length-1;
        while(i <= j){
            answer++;
            if(j == 0){
                break;
            }
            else if(people[i] + people[j] > limit){
                j--;
            }
            else {
                i++;
                j--;
            }
        }
        return answer;
    }
}
