package api.lang.String;

public class Connect2 {
	String propose;
	String word;
	public Connect2(String propose, String word) {
		this.setPropose(propose);
		this.setWord(word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		if(word.length() >= 2) {
			this.word = word;
		}
	}
	public String getPropose() {
		return propose;
	}

	public void setPropose(String propose) {
		this.propose = propose;
	}
	
	public boolean conn() {
		if(word.charAt(0) == propose.charAt(propose.length()-1)) {
			return true;
		}else {
			return false;
		}
	}
}
