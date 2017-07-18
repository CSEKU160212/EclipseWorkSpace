package FoysalsProblem;

public class Test {
	public static void main(String[] args) {
		Database d = new Database();
		CD C = new CD("FirstCD", 10.38, "Lotif", "love");
		CD D = new CD("Second", 6.30, "Fahim", "chat");
		d.addCD(C);
		d.addCD(D);
		Item i = new Item("1st", 3.23);
		Item t = new Item("2nd", 4.44);
		d.addItem(i);
		d.addItem(t);
		// first CD show then Item
		d.showAll();
		// (current title,change title)
		d.CDTitleChange("FirstCD", "NewCD");
		System.out.println("After Change " + "\n");
		d.showCD();
	}

}
