class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    public static int dfs(int[] numbers, int depth, int sum, int target){
        if(depth == numbers.length){
            return sum == target ? 1 : 0;
        }
        
        return dfs(numbers, depth + 1, sum + numbers[depth], target) + dfs(numbers, depth + 1, sum - numbers[depth], target);
    }
}
