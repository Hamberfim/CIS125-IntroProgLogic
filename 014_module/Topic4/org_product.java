public class product {
	private String title;
    private int stockNumber; 
    private double price; 

    public product(String inputTitle, int inputStockNumber, double inputPrice) {
    	title = inputTitle;
    	stockNumber = inputStockNumber;
    	price = inputPrice; 
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }

    public int getStockNumber() {
       return stockNumber; 
    }

    public void setStockNumber(int stockNumber) { 
       this.stockNumber = stockNumber; 
    }

    public double getPrice() {
       return price; 
    }

    public void setPrice(double price) {
       this.price = price;
    }

   public static void main(String args[]) {
       product myBook = new product("Cartography: How and Why", 19901, 20.22);
       System.out.println("The New book's title, stock number and price are: " + myBook.getTitle() + ", " + myBook.getStockNumber() + ", " + myBook.getPrice());
   }
}
