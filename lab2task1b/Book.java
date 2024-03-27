package lab2task1b;

public class Book extends LibraryItem {
	
	protected int numberOfPages;
	
	protected String genre;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int publicationYear, int numberOfPages, String genre) {
		super(title, author, publicationYear);
		this.numberOfPages = numberOfPages;
		this.genre = genre;
	}

	@Override
	public String getTitle() {
		return super.title;
	}

	@Override
	public String getAuthor() {
		return super.author;
	}

	@Override
	public int getPublicationYear() {
		return super.publicationYear;
	}
	public String getInfo() {
		return super.toString() + " Number of Pages: " + this.numberOfPages + " Genre " + genre;
	}
	public String toString() {
		return super.toString() + " Number of Pages: " + this.numberOfPages + " Genre " + genre;
	}

}
