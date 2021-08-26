class Solution
{
    public static int solution(String s)
    {
        for(int i = s.length(); i >= 0; i--){
            for(int j = 0; j <= s.length() - i; j++){
                boolean flag = true;
                for(int k = 0; k < i / 2; k++){
                    if(s.charAt(k + j) != s.charAt(j + i - k - 1)){
                        flag = false;
                        break;
                    }
                }
                
                if(flag){
                    return i;
                }
            }
        }

        return 0;
    }
}
