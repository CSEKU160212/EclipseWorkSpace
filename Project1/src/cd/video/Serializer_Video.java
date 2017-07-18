
package cd.video;

/**
 *
 * @author Monir
 */
import java.io.*;
import java.util.ArrayList;

public class Serializer_Video {

    FileOutputStream fos;
    ObjectOutputStream oos;
    String fileName;
    ArrayList<Video> vids;

    public Serializer_Video(String fileName, ArrayList<Video> vids) {
        this.fileName = fileName;
        this.vids = vids;
        try {
            fos = new FileOutputStream(fileName);
            serializeAddress();
        } catch (IOException e) {
        }
    }

    public void serializeAddress() {
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            for (Video s : vids) {
                oos.writeObject(s);
            }
            oos.close();
        } catch (IOException e) {
        }

        System.out.println("Done Video Serialization.");
    }

    public void save() {
        try {
            oos.close();
            fos.close();
        } catch (IOException e) {

        }
    }

}
