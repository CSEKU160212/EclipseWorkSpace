package cd.video;

/**
 *
 * @author Monir
 */
import java.io.*;
import java.util.ArrayList;

public class Serializer_CD {

    FileOutputStream fos;
    ObjectOutputStream oos;
    String fileName;
    ArrayList<CD> cds;

    public Serializer_CD(String fileName, ArrayList<CD> cds) {
        this.fileName = fileName;
        this.cds = cds;
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
            for (CD s : cds) {
                oos.writeObject(s);
            }
            oos.close();
        } catch (IOException e) {
        }

        System.out.println("Done CD Serialization.");
    }

    public void save() {
        try {
            oos.close();
            fos.close();
        } catch (IOException e) {

        }
    }

}
