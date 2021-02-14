import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int size = numbers.length * (numbers.length-1) / 2;
        
        int[] num = new int[size];
        
        int k = 0;
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                num[k] = numbers[i] + numbers[j];
                k++;
            }
        }
        
        Arrays.sort(num);
        
        int nums = num[0];
        int count = 1;
        for(int i = 1; i < num.length; i++){
            if(nums != num[i]){
                nums = num[i];
                count++;
            }
        }
        
        nums = num[0];
        int[] answer = new int[count];
        count = 1;
        answer[0] = num[0];
        for(int i = 1; i < num.length; i++){
            if(nums != num[i]){
                nums = num[i];
                answer[count] = nums;
                count++;
            }
        }
        return answer;
    }
}
