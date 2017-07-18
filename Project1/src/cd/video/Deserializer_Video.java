package cd.video;

/**
 *
 * @author Monir
 */
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Deserializer_Video {

    public ArrayList<Video> vids;

    public Deserializer_Video(String fileName) {
        vids = new ArrayList<Video>();
        try {

            deserializeAddress(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserializeAddress(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fio = new FileInputStream(fileName);
        ObjectInputStream oos = new ObjectInputStream(fio);

        boolean fin = true;
        while (fin) {
            try {
                Video s = (Video) oos.readObject();
                vids.add(s);
            } catch (EOFException e) {
                fin = false;
            }
        }

       // for (Video s : vids) {
       //     System.out.println(s);
      //  }

    }
}
