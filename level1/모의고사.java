import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int num = 0, num1 = 0, num2 = 0;
        for(int i = 0; i < answers.length; i++){
            if(a[i%a.length] == answers[i]){
                num++;
            }
            if(b[i%b.length] == answers[i]){
                num1++;
            }
            if(c[i%c.length] == answers[i]){
                num2++;
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int max = Math.max(Math.max(num, num1), num2);
        
        if(max == num){
            arr.add(1);
        }
        if(max == num1){
            arr.add(2);
        }
        if(max == num2){
            arr.add(3);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
