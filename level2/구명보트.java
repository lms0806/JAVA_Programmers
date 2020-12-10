import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(people);
        
        int i = 0;
        int j = people.length-1;
        while(i <= j){
            if(j == 0){
                answer++;
                break;
            }
            else if(people[i]+people[j] > limit){
                j--;
                answer++;
            }
            else if(people[i] + people[j] <= limit){
                i++;
                j--;
                answer++;
            }
        }
        return answer;
    }
}
