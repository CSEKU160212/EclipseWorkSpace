package problemSet5;

public class Sparrow extends Bird implements Sound {

	public static int count=0;
	public String voice;
	public Sparrow() {
		setName("Petronia");
		setSize("small");
		voice="sweet";
		if(getSize().toLowerCase().equals("small"))
		count++;
	}

	public Sparrow(String name, String size) {
		super(name);
		setSize(size);
		voice="sweet";
		if(getSize().toLowerCase().equals("small"))
			count++;
	}

	public Sparrow(String name, String size, String voice) {
		super(name);
		setSize(size);
		this.voice=voice;
		if(getSize().toLowerCase().equals("small"))
			count++;
	}

	@Override
	public void sound() {
		System.out.println(voice);
	}

	@Override
	public void sound(String string) {
		System.out.println(string+"\n");
	}

	public void  getDetail() {
 System.out.println(super.getDetails()+"Voice :"+voice+"\n");	
	}
	
	public String getDetails() {
		return super.getDetails()+"Voice :"+voice+"\n";
	}

	public static void smallSparow() {
		System.out.println("Number of small sparrow :"+count+"\n");
	}
	public String toString() {
	return "Details :\nName :"+getName()+"\nSize :"+getSize()+"\nVoice :"+voice+"\n";
	}
	}
