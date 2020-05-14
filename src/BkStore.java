import java.io.IOException;
import java.util.ArrayList;


public class BkStore {
  
  public String name;
  private String address;
  private Integer sqFt;
  private Boolean hasUsedBooks;
  private String openTime;
  private String closeTime;
  private String daysOpen;
  private ArrayList<String> titles;

  public BkStore() {// constructor
    titles = new ArrayList<String>();
  loadTitles();
  }

  public BkStore(String name, String address, Integer sqFt, Boolean hasUsedBooks, String openTime, String closeTime,
      String daysOpen) {
    this.name = name;// saves argument as name
    this.address = address;// saves argument as name sets the address
    this.sqFt = sqFt;
    this.hasUsedBooks = hasUsedBooks;
    this.openTime = openTime;
    this.closeTime = closeTime;
    this.daysOpen = daysOpen;
    titles = new ArrayList<String>();
    loadTitles();

  }

 

  public void getName() {
    System.out.println(name);
  }

  public void getAddress() {
    System.out.println(address);
  }

  public void getSqFt() {
    System.out.println(sqFt + " Square Feet");
  }

  public void getHasUsedBooks() {
    System.out.println(hasUsedBooks);
  }

  public void getOpenTime() {
    System.out.println(openTime);
  }

  public void getClosedTime() {
    System.out.println(closeTime);
  }

  public void getDaysOpen() {
    System.out.println(daysOpen);
  }

  private void loadTitles() {
    try {
      Utils.loadStringsToArray(this.titles);
    } catch (IOException e) {
      // for now simply init the array to zero
      System.out.println("Could not initialize the titles");
      // make sure it is empty
      this.titles = new ArrayList<String>();

    }
  }
  public int numberOfTitles(){
    return titles.size();
    }
 
}
