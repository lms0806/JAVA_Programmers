import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            int a = 0;
            int count = 0, count1 = 0, count2 = 0;
            ArrayList<Character> arr = new ArrayList<>();
            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                
                if(ch == '('){
                    count++;
                    arr.add(ch);
                }
                else if(ch == '{'){
                    count1++;
                    arr.add(ch);
                }
                else if(ch == '['){
                    count2++;
                    arr.add(ch);
                }
                
                if(ch == ')'){
                    if(count == 0 || (arr.size() != 0 && arr.get(arr.size()-1) != '(')){
                        break;
                    }
                    count--;
                    arr.remove(arr.size()-1);
                }
                else if(ch == '}'){
                    if(count1 == 0 || (arr.size() != 0 && arr.get(arr.size()-1) != '{')){
                        break;
                    }
                    count1--;
                    arr.remove(arr.size()-1);
                }
                else if(ch == ']'){
                    if(count2 == 0 || (arr.size() != 0 && arr.get(arr.size()-1) != '[')){
                        break;
                    }
                    count2--;
                    arr.remove(arr.size()-1);
                }
                a++;
            }
            
            if(a == s.length() && count == 0 && count1 == 0 && count2 == 0){
                answer++;
            }
            s = s.substring(1,s.length()) + s.substring(0,1);
        }
        
        
        return answer;
    }
}
