public class Book extends Product {
	private String author;
	private String title;
	private int pages;
	
	
    public Book(int inputStockNumber, double inputPrice, String author) {
    	super(inputStockNumber, inputPrice);
    	this.author = author;
    }
    
    public Book(int inputStockNumber, double inputPrice, String title, String author) {
    	super(inputStockNumber, inputPrice);
    	this.title = title;
    	this.author = author;
    }
	
    public Book(int inputStockNumber, double inputPrice, int pages, String title, String author) {
    	super(inputStockNumber, inputPrice);
    	this.pages = pages;
    	this.title = title;
    	this.author = author;
    }
    
	
    public String getAuthor() {
    	return author;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public int getPages() {
        return pages; 
     }

     public void setPages(int pages) { 
        this.pages = pages; 
     }
     
     public static void main(String args[]) {
         Book newBook = new Book("Will Writer", "Cartography Today", 202);
         System.out.println("The New book's stock number and price are: " + newBook.getAuthor() + ", " + newBook.getTitle() + ", " + newBook.getPages());
     }
     
     @Override
     public String toString() {
    	 return "Book [author=" + author + ", title" + title + ", pages" + pages + getStockNumber() + ", " + getPrice() + "]";
     }
}
