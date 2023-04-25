class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("[abc]", " ").replaceAll("\\s+", " ").trim().split(" ");
        return answer[0].equals("") ? new String[]{"EMPTY"} : answer;
    }
}
