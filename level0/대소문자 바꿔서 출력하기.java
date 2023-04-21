import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				sb.append((char)(c - 'a' + 'A'));
			}
			else {
				sb.append((char)(c - 'A' + 'a'));
			}
		}
		System.out.print(sb);
	}
}
