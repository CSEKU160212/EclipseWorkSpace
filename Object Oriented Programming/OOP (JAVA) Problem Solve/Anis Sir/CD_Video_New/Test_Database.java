import java.lang.*;
public class Test_Database{
  public static void main(String[] args){
    
    CD c1 = new CD("Pagol Bondhu", "Mumtaj", 7, 30);
    CD c2 = new CD("Darun Roshik Bondhu", "Durjoy", 5, 30);
    Video v1 = new Video("Kaka Keno Neka", "Razeeb", 180);
    Video v2 = new Video("Shami Keno Ashami", "Alice", 150);
    
     Database d = new Database();
     d.addItem(c1);
     d.addItem(v1);
     d.addItem(v2);
     d.addItem(c2);
    
     d.sort();
     System.out.println(d);
  }

}