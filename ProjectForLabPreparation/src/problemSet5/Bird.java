package problemSet5;
public class Bird {
	private String name;
	private String size;
	
	public Bird() {
		this.name=name;
	}
	public Bird(String name) {
	this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDetails() {
		return "Details :\nName :"+name+"\nSize :"+size+"\n";
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.setName("magpie robin");
		bird.setSize("small");
		System.out.println(bird.getDetails());
		
		Sparrow sparrowOne = new Sparrow();
		sparrowOne.getDetail();
		sparrowOne.sound("whistle");
		Sparrow sparrowTwo = new Sparrow("House Sparrow","SMALL");
		System.out.println(sparrowTwo.getDetails());
		Sparrow sparrowThree = new Sparrow("Rufous-sided Towhee","medium","not sweet");
		System.out.println(sparrowThree);
		Sparrow.smallSparow();
		Sparrow sparrowFour = new Sparrow("Lark Sparrow","small","rock");
		sparrowFour.getDetail();
		Sparrow.smallSparow();
		sparrowFour.sound();	
	}
}