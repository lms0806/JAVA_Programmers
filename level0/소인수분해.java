import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0){
            int num = solve(n);
            
            if(num == 0){
                break;
            }
            
            if(!arr.contains(num)){
                arr.add(num);
            }
            
            n /= num;
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
    
    public static int solve(int n){
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                return i;
            }
        }
        return 0;
    }
}
