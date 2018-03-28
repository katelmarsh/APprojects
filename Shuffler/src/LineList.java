import java.util.List;
import java.util.ArrayList;


public class LineList {
	private ArrayList<String> list;
	
	public LineList(){
		list = new ArrayList<String>();
	}
	
	public int size() {
		return list.size();
	}
	
	public String get(int k) {
		return list.get(k);
	}
	
	public void add(String line) {
		list.add(line);
	}
	
	public String remove(int k) {
		return list.remove(k);
	}
	
	public void move(int index, int newIndex) {
		String place = list.get(index);
			if (index < newIndex) {
				list.remove(index);
				list.add(newIndex, place);
			}
			else {
				list.add(newIndex,place);
				list.remove(index);
		}
	}
	
	public void shuffle() {
		int n = list.size()-1 ;
		while(n>=2) {
			int index = (int) Math.floor(Math.random()*(n-1));
			String oldString = list.get(index);
			String newString = list.get(n);
			
			list.remove(index);
			list.add(index,newString);
			
			list.remove(n);
			list.add(n,oldString);
			n--;
		}
		
	}
}
