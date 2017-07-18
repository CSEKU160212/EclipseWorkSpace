import java.util.ArrayList;

public class Database {
		ArrayList<CD> CDList=new ArrayList<>();
		ArrayList<Video> VideoList=new ArrayList<>();
	
	public void addCD(CD obj1)
	{
		CDList.add(obj1);
	}
	
	public void addVideo(Video obj2)
	{
		VideoList.add(obj2);
	}
	
	public String toString()
	{
		String str="";
		for(CD s: CDList)
			str+=s+"\n";
		for(Video st: VideoList)
			str+=st+"\n";
		
		return str;
	}
}
