import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class XML
{
	public static void main(String[] args) {
	CD c1=new CD("The Miser","Noman Khan", 4, 55);
	CD c2=new CD("The End","Atif Aslam", 44, 5555);
	CD c3=new CD("Hona tha","Atif Aslam", 10, 553);
	CD c4=new CD("Bojhena shey bojhena","Arijit Sing", 4, 55556);
	
	Video v1=new Video("The Miser","Noman Khan", 4, 55);
	Video v2=new Video("The End","Atif Aslam", 44, 5555);
	Video v3=new Video("Hona tha","Atif Aslam", 10, 553);
	Video v4=new Video("Bojhena shey bojhena","Arijit Sing", 4, 55556);
	
	Database dt=new Database();
	dt.addCD(c1);
	dt.addCD(c2);
	dt.addCD(c3);
	dt.addCD(c4);
	
	dt.addVideo(v1);
	dt.addVideo(v2);
	dt.addVideo(v3);
	dt.addVideo(v4);

	System.out.println(dt);
	
	try {
	XMLEncoder m=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(new File("Object.xml"))));
	m.writeObject(dt);
	m.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("Done");
	}
	
	}
	
}
