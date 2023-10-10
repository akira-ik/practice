public class Book extends TngibleAsset{
	private String isbn;
	public Book(Strig name, int price, String color, String isbn){
		super(name, price, color);
		this.isbn = isbn;
	}

	public String getisbn(){
		retur this.isbn;
	}

