import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        double answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        ArrayList<String> arr = new ArrayList<>(), arr2 = new ArrayList<>();
        
        int count = 0, count1 = 0;
        for(int i = 0; i < str1.length()-1; i++){
            String s = str1.substring(i,i+2).replaceAll("[^a-z]","");
            if(s.length() == 2){
                arr.add(s);
            }
        }
        
        for(int i = 0; i < str2.length() - 1; i++){
            String s = str2.substring(i, i + 2).replaceAll("[^a-z]","");
            if(s.length() == 2){
                arr2.add(s);
            }
        }

        for(String s : arr){
           if(arr2.remove(s)){
               count++;
            }
            count1++;
        }
        
        count1 += arr2.size();
        answer = (double)count/count1 * 65536;
        
        if(count1 == 0){
            return 65536;
        }
        return (int)answer;
    }
}
