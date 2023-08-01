class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            my_string = my_string.substring(0, queries[i][0]) + new StringBuilder(my_string.substring(queries[i][0], queries[i][1] + 1)).reverse() + my_string.substring(queries[i][1] + 1);
        }
        return my_string;
    }
}
