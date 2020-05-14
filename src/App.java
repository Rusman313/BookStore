
public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        BkStore Books = new BkStore("The Bell Book and Candle", "2424 Book Shop Lane, Charlotte, NC 28173", 1500, true, "8:00 AM", "6:00 PM", "Open Monday - Saturday");//constructor to pass in parameters BkStore(String name, String address, Integer sqFt, String hasUsedBooks, String openTime, String closeTime, String daysOpen)                
                Books.getName();
                System.out.println("What is the address?");
                Books.getAddress();
                System.out.println(" Is the store open today?");
                Books.getDaysOpen();
                Books.getOpenTime();
                System.out.println("What time does it close?");
                Books.getClosedTime();
                System.out.println("How big is the store?");
                Books.getSqFt();
                System.out.println(" Does the store have new or used books?");
                Books.getHasUsedBooks();
                System.out.println(Books.numberOfTitles());

    }
}
