import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {
	public DocumentIndex(){
		super();
	}
	
	public DocumentIndex(int initCapacity){
		super(initCapacity);
	}
	
	public void addWord(String word, int num) {
		this.get(foundOrInserted(word)).add(num);
	}
	
	public void addAllWords(String str, int num) {
		String[] arr1 = str.split("\\W+");
		for(String s:arr1){
			if(s.length()>0)
			addWord(s,num);
		}
	}
	
	private int foundOrInserted(String word) {
		for(int i = 0; i < this.size(); i++) {
			String entryWord = this.get(i).getWord().toUpperCase();
			if(word.toUpperCase().equals(entryWord)) {
				return i;
			}
			else if(word.toUpperCase().compareTo(entryWord) < 0) {
				IndexEntry index = new IndexEntry(word);
				this.add(i, index);
				return i;
			}
		}

		IndexEntry index = new IndexEntry(word);
		this.add(index);
		return this.size() - 1;
	}
	}
