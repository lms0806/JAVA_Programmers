import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i = 0; i < str.length; i++){
            str[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        
        if(str[0].equals("0")){
            return "0";
        }
        
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }
        
        return answer;
    }
}
