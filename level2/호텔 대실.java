import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(String[][] book_times) {
        ArrayList<Book> book = new ArrayList<>();
        for(String[] book_time : book_times) {
        	book.add(new Book(get_time(book_time[0]), get_time(book_time[1])));
        }
        
        Collections.sort(book);
        
        ArrayList<Integer> end_time = new ArrayList<>();
        
        for(Book b : book) {
        	boolean flag = false;
        	
        	Collections.sort(end_time);
        	
        	for(int i = 0; i < end_time.size(); i++) {
        		int end_times = end_time.get(i) + 10;
        		
        		if(b.start >= end_times) {
        			end_time.set(i, b.end);
        			flag = true;
        			break;
        		}
        	}
        	
        	if(!flag) {
        		end_time.add(b.end);
        	}
        }
        
        return end_time.size();
    }
	
	public static int get_time(String str) {
		String[] s = str.split(":");
		
		return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
	}
}

class Book implements Comparable<Book>{
	int start, end;
	
	public Book(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Book o) {
		if(this.start == o.start) {
			return this.end - o.end;
		}
		return this.start - o.start;
	}
}
