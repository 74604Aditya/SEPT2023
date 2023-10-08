public class Book {

	private String title;
	private String author;
	private double price;


	public Book(String title, String author, double price ) {

		this.title = title;
		this.author = author;
		this.price  = price;
	}

	public Book(String title, String author) {

		this(title, author, 0.0);
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public void displayDetails() {

		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}

	public static void main(String args[])  {

	Book[] books = new Book[3];

	books[0] = new Book("C Programming", "Dennis Ritchie",100.00);
	books[1] = new Book("OCA Java SE 8", "Bert Bates",125.50);
	books[2] = new Book("Operating System Concepts", "Peter Galvin");
	

	System.out.println("Book Inventory : ");
	for(Book book : books) {

		if(book != null) {

		book.displayDetails();

		System.out.println();
	
		}
	}

	books[2].setPrice(180.45);

	double total = 0.0;
	for(Book book : books) {
		if (book != null ) {


		total += book.getPrice();
	 
		}
	}

	System.out.println("Total Price of All Books : $" + total);

	}
}
