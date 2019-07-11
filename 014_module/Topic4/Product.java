public class Product {
	private int stockNumber; 
    private double price; 

    public Product(int inputStockNumber, double inputPrice) {
    	stockNumber = inputStockNumber;
    	price = inputPrice; 
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
       Product myBook = new Product(19901, 20.22);
       System.out.println("The New book's stock number and price are: " + myBook.getStockNumber() + ", " + myBook.getPrice());
   }
}
