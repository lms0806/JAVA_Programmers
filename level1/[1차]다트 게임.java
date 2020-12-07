class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] str = dartResult.split("");
        int[] num = new int[str.length];
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("*")){
                num[i-1] *=2;
                if(i >= 4){
                    if(num[i-3] != 0){
                        num[i-3] *=2;
                    }
                    else if(num[i-4] != 0){
                        num[i-4]*=2;
                    }
                }
            }
            else if(str[i].equals("#")){
                num[i-1] = num[i-1]*-1;
            }
            if(str[i].equals("S")){
                if(!str[i-1].equals("0")){
                    num[i] = Integer.parseInt(str[i-1]);
                }
                else if(i > 1 && str[i-2].equals("1")){
                    num[i] = 10;
                }
                else{
                    num[i] = 0;
                }
            }
            else if(str[i].equals("D")){
                if(!str[i-1].equals("0")){
                    num[i] = Integer.parseInt(str[i-1])*Integer.parseInt(str[i-1]);
                }
                else if(i > 1 && str[i-2].equals("1")){
                    num[i] = 100;
                }
                else{
                    num[i] = 0;
                }
            }
            else if(str[i].equals("T")){
                if(!str[i-1].equals("0")){
                    num[i] = Integer.parseInt(str[i-1])*Integer.parseInt(str[i-1])*Integer.parseInt(str[i-1]);
                }
                else if(i > 1 && str[i-2].equals("1")){
                    num[i] = 1000;
                }
                else{
                    num[i] = 0;
                }
            }
        }
        
        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){
                answer+=num[i];
                //System.out.println(num[i]);
            }
            //System.out.println(num[i]);
        }
        return answer;
    }
}
