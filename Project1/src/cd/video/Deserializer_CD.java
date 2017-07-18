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

public class Deserializer_CD {

    public ArrayList<CD> cds;

    public Deserializer_CD(String fileName) {
        cds = new ArrayList<CD>();
        try {
            deserializeAddress(fileName);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("1st Exception.");
        }
    }

    public void deserializeAddress(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fio = new FileInputStream(fileName);
        ObjectInputStream oos = new ObjectInputStream(fio);

        boolean fin = true;
        while (fin) {
            try {
                CD s = (CD) oos.readObject();
                cds.add(s);
            } catch (EOFException e) {
                fin = false;
            }
        }

        //for (CD s : cds) {
       //     System.out.println(s);
       // }

    }
}
