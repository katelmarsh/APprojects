import java.util.ArrayList;

public class IndexEntry {
	private String word;
	private ArrayList<Integer> numsList;
	
	public IndexEntry(String s) {
		s.toUpperCase();
		word = s;
		numsList = new ArrayList<Integer>();
	}
	
	public void add(int num) {
		if (!numsList.contains(num))
			numsList.add(num);
	}
	
	public String getWord() {
		return word;
	}
	
	public String toString() {
		String output = word + " ";
		for(int i : numsList) {
			output += i + ", ";
		}
	return output.substring(0,output.length()-2);
	}
}
