import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        HashMap<String, Integer> Player = new HashMap<>();
		HashMap<Integer, String> Rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
			Player.put(players[i], i);
			Rank.put(i, players[i]);
		}

		for (int i = 0; i < callings.length; i++) {
			int currentRank = Player.get(callings[i]);
			String player = Rank.get(currentRank);

			String frontPlayer = Rank.get(currentRank - 1);

			Player.put(player, currentRank - 1);
			Player.put(frontPlayer, currentRank);

			Rank.put(currentRank - 1, player);
			Rank.put(currentRank, frontPlayer);
		}

		for (int i = 0; i < players.length; i++) {
			answer[i] = Rank.get(i);
		}
        
        return answer;
    }
}
