package cd.video;

//import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class myListener implements ActionListener {

    ItemListing listing;

    public myListener(ItemListing n_listing) {
        this.listing = n_listing;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("load".equals(e.getActionCommand())) {
            Database data = listing.getDatabase();
            Deserializer_CD d_cd = new Deserializer_CD("C:\\Users\\Baby Bappy\\workspace\\Assighnment\\stu.ser");
            for(CD s : d_cd.cds)
            {
                data.addCDItem(s);
            }
            Deserializer_Video d_vid = new Deserializer_Video("C:\\Users\\Baby Bappy\\workspace\\Assighnment\\stu.ser");
            for(Video s : d_vid.vids)
            {
                data.addVideoItem(s);
            }
            listing.showAllItem();
        } else if ("save".equals(e.getActionCommand())) {
            Database data = listing.getDatabase();
            ArrayList<CD> cd = data.getCD();
            ArrayList<Video> video = data.getVideo();
            Serializer_CD cd_ser = new Serializer_CD("C:\\Users\\Baby Bappy\\workspace\\Assighnment\\stu.ser", cd);
            Serializer_Video video_ser = new Serializer_Video("C:\\Users\\Baby Bappy\\workspace\\Assighnment\\stu.ser", video);
        } else {
            listing.showAllItem();
        }
    }
}