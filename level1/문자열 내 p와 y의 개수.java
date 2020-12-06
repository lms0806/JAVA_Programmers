class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] a = s.split("");
        int count = 0, count1 = 0;
        
        for(int i = 0; i < a.length; i++){
            if(a[i].equals("p") || a[i].equals("P")){
                count++;
            }
            if(a[i].equals("Y") || a[i].equals("y")){
                count1++;
            }
        }
        
        if(count != count1){
            answer = false;
        }

        return answer;
    }
}
