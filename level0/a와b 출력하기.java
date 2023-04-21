import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 2; i++) {
			sb.append((char)('a' + i)).append(" = ").append(st.nextToken()).append("\n");
		}
		System.out.print(sb);
	}
}
