package defaultPakage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.soap.Text;

public class fileDemo {

	public static void main(String[] args) throws Exception {
		
		DataOutputStream f=new DataOutputStream(new FileOutputStream("Text.ser"));
		f.writeUTF("Demo content: This is my first file creation :-) :-)");
		f.close();
		
		DataInputStream fe2=new DataInputStream( new FileInputStream("Text.ser"));
		String str=fe2.readUTF();
		System.out.println(str);
		fe2.close();
		
		

	}

}
