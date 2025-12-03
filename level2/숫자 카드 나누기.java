import java.util.Arrays;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int a = arrayA[0];
        for(int i = 1; i < arrayA.length; i++){
            a = gcd(a, arrayA[i]);
        }
        
        int b = arrayB[0];
        for(int i = 1; i < arrayB.length; i++){
            b = gcd(b, arrayB[i]);
        }
        
        int answer = 0;
        if(check(arrayA, b)){
            answer = Math.max(answer, b);
        }
        if(check(arrayB, a)){
            answer = Math.max(answer, a);
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public boolean check(int[] arr, int num){
        for(int a : arr){
            if(a % num == 0){
                return false;
            }
        }
        return true;
    }
}
