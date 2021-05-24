import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            int a;
            int count = 0, count1 = 0, count2 = 0;
            ArrayList<Character> arr = new ArrayList<>();
            for(a = 0; a < s.length(); a++){
                char ch = s.charAt(a);
                
                if(ch == '(' || ch == '{' || ch == '['){
                    if(ch == '('){
                        count++;
                    }
                    else if(ch == '{'){
                        count1++;
                    }
                     else if(ch == '['){
                        count2++;
                    }
                    arr.add(ch);
                }
                else{
                    if(arr.size() == 0){
                        break;
                    }
                    if(ch == ')'){
                        if(count == 0 || arr.get(arr.size()-1) != '('){
                            break;
                        }
                        count--;
                    }
                    else if(ch == '}'){
                        if(count1 == 0 || arr.get(arr.size()-1) != '{'){
                            break;
                        }
                        count1--;
                    }
                    else if(ch == ']'){
                        if(count2 == 0 || arr.get(arr.size()-1) != '['){
                            break;
                        }
                        count2--;
                    }
                    arr.remove(arr.size()-1);
                }
            }
            
            if(a == s.length() && count == 0 && count1 == 0 && count2 == 0){
                answer++;
            }
            s = s.substring(1) + s.substring(0,1);
        }
        return answer;
    }
}
