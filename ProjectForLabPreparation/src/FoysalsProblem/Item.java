package FoysalsProblem;

public class Item {
	private String title;
	private double Ptime;

	public Item(String title, double Ptime) {
   this.title=title;
   this.Ptime=Ptime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPtime() {
		return Ptime;
	}

	public void setPtime(double ptime) {
		Ptime = ptime;
	}
	
	public String toString()
	{
		return "Title: "+title+"\nPlayingTime: "+Ptime+"\n";
	}
	
	
}
