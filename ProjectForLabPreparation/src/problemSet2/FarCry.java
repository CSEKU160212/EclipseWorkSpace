package problemSet2;

public class FarCry {
	String name;
	private String type;

	public FarCry(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
	private String getType() {
		return type;
	}

	public String toString() {
		return name;
	}

	

}