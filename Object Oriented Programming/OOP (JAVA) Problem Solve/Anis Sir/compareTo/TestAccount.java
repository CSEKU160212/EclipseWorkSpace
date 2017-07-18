import java.util.*;
public class TestAccount {
  
  public static void main(String[] args) { 
    
    ArrayList<Account> accountList = new ArrayList<Account>();
    
    accountList.add(new Account("Man Na", 2, 999.99));
    accountList.add(new Account("No Man", 3, 18888.99));
    accountList.add(new Account("Ya Sin", 1, 77777));
    accountList.add(new Account("Me Shoe",4, 998));
    
    for(Account a: accountList){
      System.out.println(a);
    }
    
    System.out.println();
    Collections.sort(accountList);
    
    for(Account a: accountList){
      System.out.println(a);
    }
  }
}
