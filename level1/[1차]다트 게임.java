import java.util.stream.IntStream;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] num = new int[dartResult.length()];
        
        for(int i = 0; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            if(ch == '*'){
                num[i - 1] *= 2;
                if(i >= 4){
                    if(num[i - 3] != 0){
                        num[i - 3] *= 2;
                    }
                    else if(num[i - 4] != 0){
                        num[i - 4] *= 2;
                    }
                }
            }
            else if(ch == '#'){
                num[i - 1] *= -1;
            }
            if(ch == 'S'){
                if(i > 0 && dartResult.charAt(i-1) != '0'){
                    num[i] = dartResult.charAt(i-1) - '0';
                }
                else if(i > 1 && dartResult.charAt(i-2) == '1'){
                    num[i] = 10;
                }
            }
            else if(ch == 'D'){
                if(i > 0 && dartResult.charAt(i-1) != '0'){
                    num[i] = (int)Math.pow((dartResult.charAt(i - 1) - '0'), 2);
                }
                else if(i > 1 && dartResult.charAt(i - 2) == '1'){
                    num[i] = 100;
                }
            }
            else if(ch == 'T'){
                if(i > 0 && dartResult.charAt(i-1) != '0'){
                    num[i] = (int)Math.pow((dartResult.charAt(i - 1) - '0'), 3);
                }
                else{
                    num[i] = i > 1 && dartResult.charAt(i - 2) == '1' ? 1000 : 0;
                }
            }
        }
        return IntStream.of(num).sum();
    }
}
