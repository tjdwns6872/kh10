package api.lang.String;

public class Nickname {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 10) {
			this.name = name;
		}
	}

	public Nickname(String name) {
		this.setName(name);
	}
	
}
