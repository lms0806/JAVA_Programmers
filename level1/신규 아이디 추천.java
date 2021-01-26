class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();//1
        
        answer = answer.replaceAll("[^(0-9|a-z|.|\\-|_)]","").replaceAll("\\(|\\)","");//2
        
        answer = answer.replaceAll("[\\.]+",".");//3
        
        answer = answer.replaceAll("^\\.|$\\.","");//4
        
        if(answer.equals("")){
            answer = "a";
        }//5
        
        if(answer.length() >= 16){
            answer = answer.substring(0,15);
        }
        if(answer.substring(answer.length()-1,answer.length()).equals(".")){
            answer = answer.substring(0,answer.length()-1);
        }//6
        
        if(answer.length() <= 2){
            while(answer.length() != 3){
                answer += answer.substring(answer.length()-1,answer.length());
            }
        }//7
        
        System.out.println(answer);
        
        return answer;
    }
}
