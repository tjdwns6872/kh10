package api.lang.String;

public class Connect {
	String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		if(word.length() >= 2) {
			this.word = word;
		}
	}

	public Connect(String word) {
		this.setWord(word);
	}
}
