class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double a : numbers){
            answer += a;
        }
        double size = numbers.length;
        return answer / size;
    }
}
